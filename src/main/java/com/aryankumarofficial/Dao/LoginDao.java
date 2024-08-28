package com.aryankumarofficial.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	protected String url = "jdbc:mysql://localhost:3306/loginmodule";
	protected String dbUser = "root";
	protected String dbPass = "1234";
	protected String query = "select * from users where uname=? and pass=?";

	public boolean verifyCredentails(String username, String password) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, dbUser, dbPass);

			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
