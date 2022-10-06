package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.SignupModel;

public class UserDao 
{
	
	
	public static Connection getconnect()
	{
		Connection con=null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static int SignupNow(SignupModel model)
	{
		int status = 0;
		
			Connection con =UserDao.getconnect();
			
			try 
			{
				PreparedStatement ps =con.prepareStatement("insert into signup (name,email,mobile,password) values (?,?,?,?)");
				ps.setString(1, model.getName());
				ps.setString(2, model.getEmail());
				ps.setString(3, model.getMobile());
				ps.setString(4, model.getPassword());
				
				status = ps.executeUpdate();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return status;
	}
	public static SignupModel loginNow(SignupModel model)
	{
		boolean flag = false;

		SignupModel obj = null;
		
		try {
			Connection con = UserDao.getconnect();
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1, model.getEmail());
			ps.setString(2, model.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				obj = new SignupModel();
				obj.setName(rs.getString("name"));
				obj.setEmail(rs.getString("email"));
				obj.setMobile(rs.getString("mobile"));
				obj.setPassword(rs.getString("password"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		return obj;
	}
	
}
