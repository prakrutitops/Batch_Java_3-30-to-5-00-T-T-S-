import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Test implements ActionListener
{
	JFrame frame;
	JButton btninsert,btnview,btnupdate,btndelete;
	
	public Test() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		btninsert = new JButton("INSERT");
		btnview = new JButton("VIEW");
		btnupdate = new JButton("UPDATE");
		btndelete = new JButton("DELETE");
	
		btninsert.addActionListener(this);
		btnview.addActionListener(this);
		btnupdate.addActionListener(this);
		btndelete.addActionListener(this);
		
		frame.add(btninsert);
		frame.add(btnview);
		frame.add(btnupdate);
		frame.add(btndelete);
		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Test();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Alloperations a =new Alloperations();
		// TODO Auto-generated method stub
		if(e.getSource()==btninsert)
		{
			a.insertdata();
		}
		if(e.getSource()==btnview)
		{
			a.viewdata();
		}
		if(e.getSource()==btndelete)
		{
			a.deletedata();
		}
		if(e.getSource()==btnupdate)
		{
			a.updatedata();
		}
	}
}

class Alloperations
{
	
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton btn1,btndelete,btnupdate,btnupdate2;
	String did;
	JPanel jp,jp2;
	
	
	public void insertdata()
	{
		insertframe=new JFrame();
		
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		
		btn1=new JButton("INSERT");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String host="jdbc:mysql://localhost:3306/";
				String db="prakruti";
				String url=host+db;
				
				String name=tf1.getText().toString();
				String surname=tf2.getText().toString();
				
				
				
				try 
				{
					Connection con = DriverManager.getConnection(url,"root","");
					String sql= "insert into register value(null, '" + name + "','"+surname+"')";
					Statement stmt=(Statement) con.createStatement();
					int status=stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("INSERTED");
					}
					else
					{
						System.out.println("FAIL");
					}
				}
				catch (SQLException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn1);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	public void viewdata()
	{
		String host="jdbc:mysql://localhost:3306/";
		String db="prakruti";
		String url=host+db;
		
		
		try 
		{
			Connection con = DriverManager.getConnection(url,"root","");
			String sql="select * from register";
			Statement stmt=(Statement) con.createStatement();
			
			ResultSet set =stmt.executeQuery(sql);
			System.out.println("\t"+"ID"+"\t"+"NAME"+"\t"+"SURNAME");
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String surname =set.getString(3);
			
				System.out.println("\t"+id+"\t"+name+"\t"+surname);
			}
			
	
			
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deletedata()
	{
		
		
		deleteframe = new JFrame();
		tf3=new JTextField(20);
		btndelete=new JButton("DELETE");
		
		
		btndelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
				String id=tf3.getText().toString();
				
				

				String host="jdbc:mysql://localhost:3306/";
				String db="prakruti";
				String url=host+db;
				
				try 
				{
					Connection con = DriverManager.getConnection(url,"root","");
					String sql ="Delete from register where id="+id;
					Statement stmt=(Statement) con.createStatement();
					int status=stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("Deleted");
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Erorr");
					}
				}
				catch (SQLException e2)
				{
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
			
		});
		deleteframe.add(tf3);
		deleteframe.add(btndelete);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
		
		
	}
	public void updatedata()
	{
		
		
		updateframe=new JFrame();
		
		
		tf3 =new JTextField(10);
		btnupdate=new JButton("Edit");
		
		jp=new JPanel();
		jp2=new JPanel();
		
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		btnupdate2=new JButton("Update");
		
		jp.add(tf3);
		jp.add(btnupdate);
		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(btnupdate2);
		
		jp.add(jp2);
		
		jp2.setVisible(false);
		
		
		btnupdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String host="jdbc:mysql://localhost:3306/";
				String db="prakruti";
				String url=host+db;
				
				 did=tf3.getText().toString();
				 int id=Integer.parseInt(did);
				 
				 try 
				 {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,"root","");
					
					String sql="select *from register where id=" + id + "";
					Statement stmt=con.createStatement();
					jp.setVisible(false);
					ResultSet set=stmt.executeQuery(sql);
					
					if(set.next())
					{
						
						id=set.getInt(1);
						String name1=set.getString(2);
						String surname1=set.getString(3);
						
						
						tf1.setText(name1);
						tf2.setText(surname1);
						
						jp2.setVisible(true);
						jp.setVisible(false);
					
						
					}
					else
					{
						System.out.println("Error in Edit");
					}
					
				 }
				 catch (Exception e1) 
				 {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 	
				 
				
			}
		});
		
		btnupdate2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String host="jdbc:mysql://localhost:3306/";
				String db="prakruti";
				String url=host+db;
				
				
				String name1=tf1.getText().toString();
				String surname1=tf2.getText().toString();


				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,"root","");
					
					String sql = "update register set name='" + name1 + "',surname='"+ surname1
							+ "' where id=" + did+ "";
					
					Statement stmt=con.createStatement();
					
					int a=stmt.executeUpdate(sql);
					
					if(a>0)
					{
						System.out.println("updated");
						updateframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				
				} 
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
	}
	
	
}
