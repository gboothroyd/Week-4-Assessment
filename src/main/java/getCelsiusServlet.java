

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getCelsiusServlet
 */
@WebServlet("/getCelsiusServlet")
public class getCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userFTemp = request.getParameter("userFTemp");
		TempConverter userTemp = new TempConverter(Integer.parseInt(userFTemp));
		request.setAttribute("userTempGauge", userTemp);
		getServletContext().getRequestDispatcher("/celsiusResult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(userTemp.toString());
		writer.close();
		
	}

}
