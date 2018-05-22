package com.dkyw.ykt.mis.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 		0.01版本使用JDBC进行数据库操作
 */
public class JDBCUtil {
	
	/*
	 		加参数?characterEncoding=utf8&useSSL=true是为了解决报错：Establishing SSL connection without server's identity 
			verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be 
			established by default if explicit option isn't set. For compliance with existing applications not using SSL 
			the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting 
			useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
	*/
	public static String url = "jdbc:mysql://localhost:3306/ykt_mis_0.01?characterEncoding=utf8&useSSL=true";	public static String dbname = "ykt_mis";
	public static String dbpwd = "datalook";
	static {
			String JDBC_MySQL_Driver = "com.mysql.jdbc.Driver";
		
			//1.打开数据库驱动
			try {
				Class.forName(JDBC_MySQL_Driver);
			} catch (ClassNotFoundException e) {
				System.out.println("数据库驱动失败！");
				e.printStackTrace();
			}
			
		
	}
	
	//创建conn连接对象
	public static Connection getConn(){
		Connection conn = null;
		//2.获取连接
		try {
			conn = DriverManager.getConnection(url, dbname, dbpwd);
		} catch (SQLException e) {
			System.out.println("创建数据库连接对象conn失败！");
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConn(Connection conn){
		
	}
	
	
}
