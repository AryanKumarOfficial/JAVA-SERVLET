package com.aryankumarofficial.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.aryankumarofficial.model.Alien;

public class AlienDao {

	public Alien getAlien(int aid) {

		Alien alien = new Alien();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/aliens";
			String user = "root";
			String password = "1234";
			String query = "select * from aliens where aid=" + aid;

			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				alien.setAid(rs.getInt("aid"));
				alien.setAname(rs.getString("aname"));
				alien.setTech(rs.getString("tech"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return alien;
	}

}
