package d20210303;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// now.do - servlet을 실행하면 브라우저에 현재 시각을 출력

@WebServlet("/w20210303/now.do")
public class ServletEx02 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// endcoding
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		// 필요한 로직을 작성
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd a hh:mm");
		
		String time = sdf.format(d);
		
		// 출력 객체 생성
		PrintWriter out = resp.getWriter();
				
		out.println("<html>");
		out.println("<head>");
		out.println("<title>servletEx02 Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Today is Wednesday </h1>");
		out.println("<h1> " + time +" </h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
