package d20210302;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20210302/movie.do")
public class Movie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>movie.do</title>");
		out.println("</head>");
		out.println("<body>");
		
		if(name.equals("콘스탄틴")){
			out.println("<img src='./movie/movie_image1.jpg' />");
		}
		
		out.println("</body>");
		out.println("</html>");
		
		
	}
}
