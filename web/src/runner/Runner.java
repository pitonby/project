package runner;

import java.sql.Connection;
import java.sql.SQLException;

import connector.ConnectorDB;

public class Runner {

	public static void main(String[] args) {
		try {
			Connection connect = ConnectorDB.getConnection();
			System.out.println(connect.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
