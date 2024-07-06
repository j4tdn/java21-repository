package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

public class GenericDao {

	Connection connection;

	Statement st;
	ResultSet rs;
	
	GenericDao() {
		connection = DbConnection.getConnection();
	}

	<E> List<E> getElements(String sql, Supplier<E> supplier) {
		List<E> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				result.add(supplier.get());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

}
