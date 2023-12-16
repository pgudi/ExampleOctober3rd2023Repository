package com.sgtesting.tests;

public class ExecuteAutoItScriptFilesDemo {

	public static void main(String[] args) {
		executeFile();

	}
        	
	private static void executeFile()
	{
		try
		{
		//	Runtime.getRuntime().exec("E:\\GitRepository4\\AutoIT\\DisplayMessageWindow.exe");
			
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\GitRepository4\\AutoIT\\SaveApplicationAndOverWriteDemo.exe");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
