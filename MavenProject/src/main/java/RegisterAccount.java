import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String dbUsername = "amrit";
		String dbPassword = "myPass";

		PrintWriter out = response.getWriter();
		//boolean userNameAvailable = false;

		List errorList = new LinkedList<String>();

		String username = request.getParameter("uname");
		System.out.print(username);
		boolean u = false;
		try {
			 u = UserNameCheck.isUsernameAvailable(username);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if ((username.length() == 0)) {
			errorList.add("!!!	Error--Enter USERNAME");
		}
		String password = request.getParameter("pass");
		System.out.print(password);
		if (password.length() == 0) {
			errorList.add("!!!	Error--Enter PASSWORD");
		}
		String phone = request.getParameter("phone");
		System.out.print(phone);
		if (phone.length() == 0) {
			errorList.add("!!!	Error--Enter PHONE NUMBER");
		}
		if ((phone.length() > 0) && (phone.length() != 10)) {
			errorList.add("!!!	Error--A phone number should contain 10 digits");
		}

		try {
			if ((UserNameCheck.isUsernameAvailable(username) == false) ) {
				errorList.add("!!!	Error--Username already taken");
				
				if (!errorList.isEmpty()) {
					request.setAttribute("errorList", errorList);
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
				}

			} else {
				if(username.length()>0 && (password.length()>0) && (phone.length()>0)) {
					// calling getSHA() from SHA256 class to hash password
					String hashedPassword = HashingSHA256.getSHA(password);
					// calling encryption method to encrypt phone number
					String encryptedPhone = AES.encrypt(phone);

					try {
						Class.forName(dbDriver);
						Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
						Statement statement = connection.createStatement();
						String query = "insert into test_table  values('" + username + "','" + hashedPassword + "','"
								+ encryptedPhone + "')";
						statement.executeUpdate(query);

						System.out.println("Data inserted into the database successfully.");
					} catch (ClassNotFoundException | SQLException e) {
						System.out.println(e);
					}

					// after the successful storage of data into database, we want to redirect to
					// the log in page
					response.sendRedirect("login.jsp");

				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

			
			

				

