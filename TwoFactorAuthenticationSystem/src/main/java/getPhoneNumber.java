import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class getPhoneNumber {

	public static String getEncryptedPhone(String uname) {
			String dbDriver = "com.mysql.cj.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306/testdb";
			String dbUsername = "amrit";
			String dbPassword = "myPass";
			String encryptedPhoneNumber="";
			
				try {
					Class.forName(dbDriver);
					Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
					Statement statement = connection.createStatement();
					String query = "SELECT Phone FROM test_table where UserName='"+uname+"'";
					ResultSet result = statement.executeQuery(query);
					result.next();
					encryptedPhoneNumber = result.getString(1);
					//System.out.println("Connection built to database");
					
				}catch(Exception e) {
					System.out.println("No connection built to database"+e);
				}
				
			return encryptedPhoneNumber;
	}
	
	public static String phonewithAreaCode(String phone) {
		return "+1"+phone;
	}

	

}
