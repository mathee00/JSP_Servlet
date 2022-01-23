package BeautifulThings;

//This is a servlet which handles for inputs

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleFormInput
 */
@WebServlet("/HandleFormInput")
public class HandleFormInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleFormInput() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
		String Age = request.getParameter("age");
		String City = request.getParameter("city");
		//Next -> Direct the web browser to another page
		//		  send the fname and lname parameters.
		
		//putting variables into the request
		request.setAttribute("fname", firstName);
		request.setAttribute("lname", lastName);
		
		request.setAttribute("age", Age);
		request.setAttribute("city", City);
		
		request.getRequestDispatcher("ResponsePage.jsp").forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
