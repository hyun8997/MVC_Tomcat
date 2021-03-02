package d20210302;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20210302/loginOk.do")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//endcoding
		resp.setContentType("text/html; charset=UTF-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		//출력용 객체 생성
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>loginOk.do</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>당신의 ID는 "+id+"입니다.</h1>");
		out.println("<h1>당신의 PW는 "+pw+"입니다.</h1>");
		out.println("</body>");
		out.println("</html>");
	}//doget
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//endcoding
				resp.setContentType("text/html; charset=UTF-8");
				
				String id = req.getParameter("id");
				String pw = req.getParameter("pw");
				
				//출력용 객체 생성
				PrintWriter out = resp.getWriter();
				
				out.println("<html>");
				out.println("<head>");
				out.println("<title>loginOk.do</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>당신의 ID는 "+id+"입니다.</h1>");
				out.println("<h1>당신의 PW는 "+pw+"입니다.</h1>");
				out.println("</body>");
				out.println("</html>");
	}
	
}
