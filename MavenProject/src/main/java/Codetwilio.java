
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Codetwilio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Codetwilio() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userInput = request.getParameter("input");
		System.out.println("userInput" + userInput);

		if (userInput.equals(TwilioMessage.CODETOSEND)) {
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("code.jsp");
		}
	}

}
