/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David Wang A00670230
 */

import com.mysql.jdbc.Driver;
import java.sql.*;

public class SQLConnect {
	public SQLConnect() throws SQLException {
		makeConnection();
	}
	
	private Connection db1;
	
	public Connection makeConnection() throws SQLException {
		if(db1 == null) {
			new Driver();
			db1 = DriverManager.getConnection("jdbc:mysql://localhost/chatdb", "chatadmin", "chat");
		}
		return db1;
	}
	
	public static void main(String args[]) {
		try {
			SQLConnect c = new SQLConnect();
			System.out.println("Connection established");
		} catch(SQLException e) {
			e.printStackTrace();
			System.err.println("Connection error");
		}
	}
}
