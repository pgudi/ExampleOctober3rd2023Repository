package com.sgtesting.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class SQLOperationsUsingPreparedStatementDemo {
	public static void main(String[] args) {
	//	readRecordsFromTable();
		insertRecordsData();
	}
	
	private static void readRecordsFromTable()
	{
		Connection conn=null;
		try
		{
			
			System.out.println("DB Connection becomes succesfully!!");
			String query="select * from dept";
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsdata=rs.getMetaData();
			String first=rsdata.getColumnName(1);
			String second=rsdata.getColumnName(2);
			String third=rsdata.getColumnName(3);
			System.out.printf("%-12s",first);
			System.out.printf("%-12s",second);
			System.out.printf("%-12s",third);
			System.out.printf("\n");
			while(rs.next())
			{
				String deptid=rs.getString("DEPTNO");
				String deptname=rs.getString("DNAME");
				String place=rs.getString("LOC");
				System.out.printf("%-12s",deptid);
				System.out.printf("%-12s",deptname);
				System.out.printf("%-12s",place);
				System.out.printf("\n");
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
	}

	
	private static void insertRecordsData()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			System.out.println("DB Connection becomes succesfully!!");
			String query="insert into dept values(60,'BANKING','PARIS')";
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.executeUpdate();
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
	}
}
