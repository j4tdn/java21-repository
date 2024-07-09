package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import connection.DbConnection;
import utils.SqlUtils;

public class GenericDao {
	
	Connection connection;
	ResultSet rs;
	
	// Khi thực hiện câu truy vấn, ở dạng hoàn chỉnh không cần truyền tham số vào
	// thì có thể sử d
	Statement st;
	
	// Sử dụng khi câu truy vấn hoàn chỉnh hoặc câu truy vấn cần truyền tham số vào
	// lúc thực thi
	// + Đỡ phải cộng chuỗi khi thực hiện câu hoàn chỉnh
	// + 
	PreparedStatement pst;
	
	GenericDao() {
		connection = DbConnection.getConnection();
	}
	
	<E> List<E> getElements(String sql, Supplier<E> supplier) {
		List<E> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			// pst = connection.prepareStatement(sql);
			// rs = pst.executeQuery();
			while(rs.next()) {
				result.add(supplier.get());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	<E> E getElement(String sql, Supplier<E> supplier) {
		E result = null;
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				result = supplier.get();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
}
