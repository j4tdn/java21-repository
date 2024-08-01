package dao;

import java.sql.JDBCType;
import java.sql.SQLException;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import transformer.ItemGroupTransformer;
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
			+ " WHERE C02_ITEM_GROUP_ID = ?";
	
	private static final String GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT C02_ITEM_GROUP_ID " + ItemGroup.PROP_ID + ", \n"
			+ "       C02_ITEM_GROUP_NAME " + ItemGroup.PROP_NAME + "\n"
			+ "  FROM t02_item_group\n"
			+ " WHERE C02_ITEM_GROUP_NAME = ?";
	
	private static final String INSERT_ITEM_GROUP = ""
			+ "INSERT INTO t02_item_group(C02_ITEM_GROUP_NAME)\n"
			+ "VALUES(?)";
	
	private static final String UPDATE_ITEM_GROUP = ""
			+ "UPDATE t02_item_group\n"
			+ "   SET C02_ITEM_GROUP_NAME = ?\n"
			+ " WHERE C02_ITEM_GROUP_ID = ?";
	
	private static final String MERGE_ITEM_GROUP = ""
			+ "CALL merge_item_group(?, ?)";
	
	private static final String GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       sum(t12.C12_AMOUNT) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + ",\n"
			+ "       GROUP_CONCAT(concat(t1.C01_ITEM_NAME,'-',t6.C06_SIZE_NAME,'-',t12.C12_AMOUNT)) " + ItemGroupDto.PROP_ITEM_DETAILS + "\n"
			+ "  FROM t02_item_group t2\n"
			+ "  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
			+ "  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID\n"
			+ "  JOIN t06_size t6 ON t12.C12_SIZE_ID = t6.C06_SIZE_ID\n"
			+ "  GROUP BY t2.C02_ITEM_GROUP_ID,\n"
			+ "           t2.C02_ITEM_GROUP_NAME";
	
	private static final String TS_UPDATE_Q1 = ""
			+ "UPDATE t02_item_group SET C02_ITEM_GROUP_NAME = ? WHERE C02_ITEM_GROUP_ID = ?";
	
	private static final String TS_DELETE_Q2 = ""
			+ "DELETE FROM t02_item_group WHERE C02_ITEM_GROUP_ID = ?";
	
	@Override
	public void updateNGroups() {
		try {
			connection.setAutoCommit(false);
			
			// sql1
			pst = connection.prepareStatement(TS_UPDATE_Q1);
			pst.setString(1, "Cập nhật");
			pst.setInt(2, 10);
			pst.executeUpdate();
			
			// sql2
			pst = connection.prepareStatement(TS_DELETE_Q2);
			// pst.setInt(-1, 19);
			pst.setInt(1, 18);
			pst.executeUpdate();
			
			connection.commit();
		} catch (SQLException e) {
			SqlUtils.rollback(connection);
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return getElements(GET_ALL_ITEM_GROUPS, ItemGroupTransformer::transformItemGroup);
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return getElements(GET_ITEM_GROUP_DETAILS, ItemGroupTransformer::transformItemGroupDto);
	}
	
	@Override
	public ItemGroup get(int id) {
		return getElement(GET_ITEM_GROUP_BY_ID, ItemGroupTransformer::transformItemGroup, (pst) -> {
			try {
				pst.setInt(1, id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}
	
	@Override
	public ItemGroup get(String name) {
		return getElement(GET_ITEM_GROUP_BY_NAME, ItemGroupTransformer::transformItemGroup, (pst) -> {
			try {
				pst.setString(1, name);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
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
	public void save(List<ItemGroup> groups) {
		try {
			pst = connection.prepareStatement(INSERT_ITEM_GROUP);
			
			int batchCount = 0;
			for (ItemGroup group: groups) {
				pst.setString(1, group.getName());
				pst.addBatch();
				if (++batchCount % BATCH_SIZE == 0) {
					pst.executeBatch();
				}
			}
			
			// if size of list is not divided by BATCH_SIZE
			// remaining will be executed here
			pst.executeBatch();
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
	
}
