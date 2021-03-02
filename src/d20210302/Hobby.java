package d20210302;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20210302/printHobby.do")
public class Hobby extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// req : 요청객체		객체를 기준(브라우저말고)
		// resp : 응답 객체
		req.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/html; charset=UTF-8");
		
		String hobby = req.getParameter("hobby");
		
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>printHobby.do</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>당신의 취미는 "+hobby+"입니다.</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
	
}
