

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getFahrenheitServlet
 */
@WebServlet("/getFahrenheitServlet")
public class getFahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userCTemp = request.getParameter("userCTemp");
		TempConverter userTemp = new TempConverter(Integer.parseInt(userCTemp));
		request.setAttribute("userTempGauge", userTemp);
		getServletContext().getRequestDispatcher("/fahrenheitResult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(userTemp.toString());
		writer.close();
	}

}
