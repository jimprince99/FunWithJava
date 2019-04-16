package com.jimprince99.h2database;

import java.sql.*;

/**
 * Create an in-memory database
 * 
 * @author jpri1335
 *
 */
public class EmbeddedDatabase {

	public static void main(String[] args) throws SQLException {
		System.out.println("starting");
		Connection conn = null;
		Statement stmt = null;
		String sql = "";

		conn = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");

		// create a table
		stmt = conn.createStatement();

		sql = "CREATE TABLE REGISTRATION " + "(id INTEGER not NULL, " + " first VARCHAR(255), " + " last VARCHAR(255), "
				+ " age INTEGER, " + " PRIMARY KEY ( id ))";

		stmt.executeUpdate(sql);

		// populate a table
		sql = "INSERT INTO Registration " + "VALUES (100, 'Zara', 'Ali', 18)";
		boolean success = stmt.execute(sql);
		System.out.println("result of insert=" + success);

		// query a table
		sql = "SELECT id, first, last, age FROM Registration";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			int age = rs.getInt("age");
			String first = rs.getString("first");
			String last = rs.getString("last");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", Age: " + age);
			System.out.print(", First: " + first);
			System.out.println(", Last: " + last);
		}
		rs.close();

		// Update
		sql = "UPDATE Registration " + "SET age = 30 WHERE id in (100, 101)";
		int result = stmt.executeUpdate(sql);
		System.out.println("Updated " + result + " lines");

		// close the connection
		conn.close();

		System.out.println("end");
	}

}
