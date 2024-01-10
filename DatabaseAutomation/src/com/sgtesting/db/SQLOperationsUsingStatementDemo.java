package com.sgtesting.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class SQLOperationsUsingStatementDemo {
	public static void main(String[] args) {
	//	readRecordsFromTable();
		insertRecords();
	}
	
	private static void readRecordsFromTable()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			System.out.println("DB Connection becomes succesfully!!");
			Statement stmt=conn.createStatement();
			String query="select * from dept";
			ResultSet rs=stmt.executeQuery(query);
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

	private static void insertRecords()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			System.out.println("DB Connection becomes succesfully!!");
			Statement stmt=conn.createStatement();
			String query="insert into dept values(60,'INFO TECH','BANGALORE')";
			stmt.executeUpdate(query);
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
