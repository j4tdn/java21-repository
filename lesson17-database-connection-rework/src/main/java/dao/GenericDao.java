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
	static final int BATCH_SIZE = 100;
	
	Connection connection;
	ResultSet rs;
	
	// Khi thực hiện câu truy vấn, ở dạng hoàn chỉnh không tham số thì sử dụng st
	Statement st;
	
	// Sử dụng khi cần tham số
	PreparedStatement pst;
	
	GenericDao(){
		connection = DbConnection.getConnection();
	}
	
	<E> List<E> getElements(String sql, Function<ResultSet, E> transformer ){
		List<E> result = new ArrayList<E>();
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
	
	 	<E> E getElement(String sql, Function<ResultSet, E> transformer, Consumer<PreparedStatement> argumentsSetter ){
		E result = null;
		try {
			pst = connection.prepareStatement(sql);
			argumentsSetter.accept(pst);
			rs = pst.executeQuery();
			while(rs.next()) {
				result=transformer.apply(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
}
