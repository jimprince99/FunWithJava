package com.jimprince99.dbexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyPreparedStatement {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "four4four");
		
		Statement statement = conn.createStatement();
		
		String sql = "CREATE TABLE people (id INTEGER NOT NULL, name VARCHAR(20))";
		
		int result = statement.executeUpdate(sql);
		
		String sql2 = "INSERT INTO people VALUES (1, 'jim')";
		
		int result2 = statement.executeUpdate(sql2);
		
		sql2 = "INSERT INTO people VALUES (2, 'mij')";
		int result4 = statement.executeUpdate(sql2);
		
		
		String sql3 = "SELECT id, name FROM people";
		
		ResultSet rs = statement.executeQuery(sql3);
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println(id + ", " + name);
		}
		
		String sql4 = "select * from people where id = ?";
		PreparedStatement statement2 = conn.prepareStatement(sql4);
		statement2.setInt(1, 2);

		ResultSet rs2 = statement2.executeQuery();
		while (rs2.next()) {
			int id = rs2.getInt(1);
			String name = rs2.getString(2);
			System.out.println(id + ", " + name);
		}
				
				
	}

}
