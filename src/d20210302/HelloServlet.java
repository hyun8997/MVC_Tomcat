package d20210302;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet : 웹에서 동작하는 작은 자바프로그램

// Servlet 객체를 만들어서 사용하려면 상속받아서 쓰면 된다.


@WebServlet("/hello.html")		//주소 앞에 반드시 / 필요. 빠지면 동작 X, 주소가 같은 파일이 있어도 동작 X
public class HelloServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// req : 요청객체
		// resp : 응답 객체
		
		// 응답 - 출력
		PrintWriter out = resp.getWriter();
		
		// HTML 형식으로 출력
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet World</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
}




