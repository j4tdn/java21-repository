package view;

import java.sql.Connection;

import connection.DbConnection;

public class Ex01DbConnectionTest {
	
	public static void main(String[] args) {
		Connection connection = DbConnection.getConnection();
		System.out.println("MySQL connection --> " + connection);
	}
	
}
