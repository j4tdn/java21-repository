package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import connection.DbConnection;
import utils.SqlUtils;

public class GenericDao {
	
	static final int BATCH_SIZE = 1000;
	
	Connection connection;
	ResultSet rs;
	
	// Khi thực hiện câu truy vấn, ở dạng hoàn chỉnh không cần truyền tham số vào
	// thì có thể sử dụng
	Statement st;
	
	// Sử dụng khi câu truy vấn hoàn chỉnh hoặc câu truy vấn cần truyền tham số vào
	// lúc thực thi
	// + Đỡ phải cộng chuỗi khi thực hiện câu hoàn chỉnh
	// + 
	PreparedStatement pst;
	
	GenericDao() {
		connection = DbConnection.getConnection();
	}
	
	<E> List<E> getElements(String sql, Function<ResultSet, E> transformer) {
		List<E> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				result.add(transformer.apply(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	<E> List<E> getElements(String sql, Function<ResultSet, E> transformer, Consumer<PreparedStatement> argumentsSetter) {
		List<E> result = new ArrayList<>();
		try {
			pst = connection.prepareStatement(sql);
			argumentsSetter.accept(pst);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(transformer.apply(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	<E> E getElement(String sql, Function<ResultSet, E> transformer, Consumer<PreparedStatement> argumentsSetter) {
		E result = null;
		try {
			pst = connection.prepareStatement(sql);
			argumentsSetter.accept(pst);
			rs = pst.executeQuery();
			if(rs.next()) {
				result = transformer.apply(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
}