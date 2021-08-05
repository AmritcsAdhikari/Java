import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserNameCheck {
	public static boolean isUsernameAvailable(String username) throws SQLException  {
		boolean userNameAvailable = true;
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String dbUsername = "amrit";
		String dbPassword = "myPass";
		if(username.length()==0) {
			return false;
		}

	
			try {
				Class.forName(dbDriver);
				Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				Statement statement = connection.createStatement();
				String query = "SELECT UserName FROM test_table where UserName='"+username+"'";
				ResultSet result = statement.executeQuery(query);
				if(result.next() == false) {
					userNameAvailable = true;
				}
				else {
					userNameAvailable = false;
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return userNameAvailable;
		}
		public static void main(String[] args) throws SQLException {
			System.out.println(UserNameCheck.isUsernameAvailable("amir"));
		}
}
