package by.unlimit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Info");
		
		//response.setContentType("text/html");
		//response.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Surprise, motherfucker! Шашлык у Ашота!");
		printWriter.close();
	}

	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	} */

}
