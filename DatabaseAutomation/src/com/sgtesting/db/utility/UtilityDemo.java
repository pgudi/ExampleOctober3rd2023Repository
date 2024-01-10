package com.sgtesting.db.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

class DBUtility
{
	/**
	 * 
	 * @param query
	 * @param dburl
	 * @param dbuser
	 * @param dbpwd
	 * @return rowCount
	 */
	public static int getRecordsCount(String query,String dburl,String dbuser,String dbpwd)
	{
		int rowCount=0;
		Connection conn=null;
		try
		{
			conn=DBUtility.getDbConnection(dburl, dbuser, dbpwd);
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				rowCount=rowCount+1;
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return rowCount;
	}
	/**
	 * 
	 * @param query
	 * @param dburl
	 * @param dbuser
	 * @param dbpwd
	 * @return columnCount
	 */
	public static int getTableColumnCount(String query,String dburl,String dbuser,String dbpwd)
	{
		int columnCount=0;
		Connection conn=null;
		try
		{
			conn=DBUtility.getDbConnection(dburl, dbuser, dbpwd);
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmeta=rs.getMetaData();
			columnCount=rsmeta.getColumnCount();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return columnCount;
	}
	
	public static List<String> getFirstRecord(String query,String dburl,String dbuser,String dbpwd)
	{
		List<String> obj=null;
		Connection conn=null;
		try
		{
			obj=new ArrayList<String>();
			conn=DBUtility.getDbConnection(dburl, dbuser, dbpwd);
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmeta=rs.getMetaData();
			int cc=rsmeta.getColumnCount();
			String arr[]=new String[cc];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=rsmeta.getColumnName(i+1);
			}
			if(rs.next()==true)
			{
				for(int i=0;i<arr.length;i++)
				{
					String data=rs.getString(arr[i]);
					obj.add(data);
				}
			}
					
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return obj;
	}
	
	public static boolean isInsertedRecord(String query,String dburl,String dbuser,String dbpwd) 
	{
		boolean insertAction=false;
		Connection conn=null;
		try
		{
			conn=DBUtility.getDbConnection(dburl, dbuser, dbpwd);
			PreparedStatement stmt=conn.prepareStatement(query);
			int statusValue=stmt.executeUpdate();
			if(statusValue==1)
			{
				insertAction=true;
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return insertAction;
	}
	public static Connection getDbConnection(String dburl,String username,String pwd)
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(dburl, username, pwd);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}
public class UtilityDemo {
	public static void main(String[] args) {
		/*
		int rc=DBUtility.getRecordsCount("select * from dept", "jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
		System.out.println("# of Rows in a table :"+rc);
		int cc=DBUtility.getTableColumnCount("select * from dept", "jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
		System.out.println("# of Column in a table :"+cc);
		
		List<String> record=DBUtility.getFirstRecord("select * from product", "jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
		System.out.println(record);
		*/
		String query="insert into dept values(60,'BANKING','PARIS')";
		boolean val=DBUtility.isInsertedRecord(query, "jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
		System.out.println(val);
	}

}
