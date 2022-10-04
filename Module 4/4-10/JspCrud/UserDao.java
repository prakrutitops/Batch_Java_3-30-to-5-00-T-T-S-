package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam.Mode;
import javax.jws.soap.SOAPBinding.Use;

import com.model.Model;

public class UserDao 
{
	public static Connection getconnect()
	{
		Connection con=null;
		
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");

				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		return con;
	}
	
	public static int savedata(Model m)
	{	
		int status=0;
		
		Connection con= UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("insert into info(Fname,Lname,Email) values (?,?,?)");
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			status = ps.executeUpdate();
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	public static List<Model>viewdata()
	{
		List<Model>list =new ArrayList<Model>();
		
			Connection con= UserDao.getconnect();
			
			try 
			{
				PreparedStatement ps =con.prepareStatement("select * from info");
				ResultSet set =ps.executeQuery();
				while(set.next())
				{
					int id =set.getInt(1);
					String name =set.getString(2);
					String surname =set.getString(3);
					String email =set.getString(4);
					
					Model m =new Model();
					m.setId(id);
					m.setFname(name);
					m.setLname(surname);
					m.setEmail(email);
					
					list.add(m);
				}
				
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return list;
	}
	
	public static int deletedata(int id)
	{
		Connection con =UserDao.getconnect();
		int status =0;
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("delete from info where id =?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	public static Model getemployeebyid(int id)
	{	
		
		Model m=new Model();
		Connection con= UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("select * from info where id=?");
			ps.setInt(1, id);
			ResultSet set=ps.executeQuery();
			
			if(set.next())
			{
				int id2=set.getInt(1);
				String fname=set.getString(2);
				String lname=set.getString(3);
				String email =set.getString(4);
				
				
				
				m.setId(id2);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				
				
			}
			
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return m;
	}
	
	public static int updatedata(Model m)
	{	
		int status=0;
		
		Connection con= UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("update info set Fname=? , Lname =?, Email=? where id =?");
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setInt(4,m.getId());
			
			System.out.println(m.getEmail());
			status = ps.executeUpdate();
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
}
