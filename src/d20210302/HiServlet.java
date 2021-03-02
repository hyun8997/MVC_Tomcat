package d20210302;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi.jsp")
public class HiServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// req : 요청객체
		// resp : 응답 객체
		req.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/html; charset=UTF-8");

		// 응답 - 출력
		PrintWriter out = resp.getWriter();
			
		// HTML
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hi Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>내가 만들어본 두번째 서블릿 파일</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
