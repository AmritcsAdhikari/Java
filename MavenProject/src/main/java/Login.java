import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("username");
		String password = request.getParameter("password");

		String dbDriver = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String dbUsername = "amrit";
		String dbPassword = "myPass";

		try {
			Class.forName(dbDriver);
			Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			Statement statement = connection.createStatement();
			// use resultset select password from database where username is uname
			String query = "select * from test_table where UserName='" + uname + "'";
			ResultSet result = statement.executeQuery(query);
			result.next();// points to the start of the row

			String hashPassFromdb = result.getString(2);
			System.out.println("The result: " + hashPassFromdb);

			if (hashPassFromdb.equals(HashingSHA256.getSHA(password))) {
			
				String phoneFromdb = getPhoneNumber.getEncryptedPhone(uname);
				String plainPhoneNumber = AES.decrypt(phoneFromdb);
				String phoneWithArea = getPhoneNumber.phonewithAreaCode(plainPhoneNumber);
				System.out.println(phoneWithArea);
				TwilioMessage.sendMessage(phoneWithArea);
				
				response.sendRedirect("code.jsp");
				
			} else if (!hashPassFromdb.equals(HashingSHA256.getSHA(password)))

			{
				String error = "Username and password do not match";
				request.setAttribute("errorList", error);
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
//				PrintWriter out = response.getWriter();
//				out.print("Username password do not match0");
//				response.sendRedirect("login.jsp");
			}

			System.out.println("Data inserted into the database successfully.");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

	}
}
