package dao;

import java.sql.JDBCType;
import java.sql.SQLException;
import java.sql.SQLType;
import java.util.List;

import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT C02_ITEM_GROUP_ID " + ItemGroup.PROP_ID + ", \n"
			+ "       C02_ITEM_GROUP_NAME " + ItemGroup.PROP_NAME + "\n"
			+ "  FROM t02_item_group";
	
	private static final String GET_ITEM_GROUP_BY_ID = ""
			+ "SELECT C02_ITEM_GROUP_ID " + ItemGroup.PROP_ID + ", \n"
			+ "       C02_ITEM_GROUP_NAME " + ItemGroup.PROP_NAME + "\n"
			+ "  FROM t02_item_group\n"
			+ " WHERE C02_ITEM_GROUP_ID = ";
	
	private static final String INSERT_ITEM_GROUP = ""
			+ "INSERT INTO t02_item_group(C02_ITEM_GROUP_NAME)\n"
			+ "VALUES(?)";
	
	private static final String UPDATE_ITEM_GROUP = ""
			+ "UPDATE t02_item_group\n"
			+ "   SET C02_ITEM_GROUP_NAME = ?\n"
			+ " WHERE C02_ITEM_GROUP_ID = ?";
	
	private static final String MERGE_ITEM_GROUP = ""
			+ "CALL merge_item_group(?, ?)";
	
	@Override
	public List<ItemGroup> getAll() {
		return getElements(GET_ALL_ITEM_GROUPS, this::transform);
	}
	
	@Override
	public ItemGroup get(int id) {
		String sql = GET_ITEM_GROUP_BY_ID + id;
		return getElement(sql, this::transform);
	}
	
	@Override
	public void save(ItemGroup group) {
		try {
			pst = connection.prepareStatement(INSERT_ITEM_GROUP);
			pst.setString(1, group.getName());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("We found errors when save new group: " + e.getMessage());
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup group) {
		try {
			pst = connection.prepareStatement(UPDATE_ITEM_GROUP);
			pst.setString(1, group.getName());
			pst.setInt(2, group.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void mergeP(ItemGroup group) {
		try {
			pst = connection.prepareCall(MERGE_ITEM_GROUP);
			// pst.setInt(1, group.getId());
			pst.setObject(1, group.getId(), JDBCType.INTEGER);
			pst.setString(2, group.getName());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private ItemGroup transform() {
		ItemGroup group = null;
		try {
			group = new ItemGroup(rs.getInt(ItemGroup.PROP_ID), rs.getString(ItemGroup.PROP_NAME));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return group;
	}

}
