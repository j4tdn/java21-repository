package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao{
	
	private Connection connection;
	private Statement st;
	private ResultSet rs;
	
	private static final String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM t02_item_group";
			
	
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(GET_ALL_ITEM_GROUPS);
			while(rs.next()) {
				ItemGroup group = new ItemGroup(
						rs.getInt("C02_ITEM_GROUP_ID"),
						rs.getString("C02_ITEM_GROUP_NAME"));
				result.add(group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}

	@Override
	public ItemGroup get(int id) {
		
		return null;
	}
	
}
