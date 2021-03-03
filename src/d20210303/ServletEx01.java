package d20210303;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 작성 방법 복습
// 1. HttpServlet 상속
// 2. do~ method overide => 필요한 로직을 작성
// 3. WebServlet annotation => 주소를 매칭

//3. WebServlet annotation => 주소를 매칭
@WebServlet("/w20210303/wednesday.do")
//1. HttpServlet 상속
public class ServletEx01 extends HttpServlet{
	// 2. do~ method overide => 필요한 로직을 작성
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	
	
	// get, post 어떤 방식이든 가능하도록 처리
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// 필요한 로직을 작성
		
		// endcoding
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
				// 사용자로부터 전달받은 메세지를 출력하기 위한 로직
				// 변수 생성 - 사용자가 parameter에 담아서 보낸 데이터를 대입
				String msg = req.getParameter("msg");
				
				// 출력 객체 생성
				PrintWriter out = resp.getWriter();
				
				out.println("<html>");
				out.println("<head>");
				out.println("<title>servletEx01 Result</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1> Today is Wednesday </h1>");
				out.println("<h1> " + msg +" </h1>");
				out.println("</body>");
				out.println("</html>");
		
	}
	
	
	
	
	
	
	
}
