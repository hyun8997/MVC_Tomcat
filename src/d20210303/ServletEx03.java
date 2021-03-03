package d20210303;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

// 서블릿을 작성하는 방법 - 2
// 1. GenericServlet 상속
// 2. service(~req, ~resp) override => 필요한 로직을 작성
// 3. @WebServlet 주소 지정]

//서블릿은 자바 기술, 근데 톰캣쪽의 API에 javax.servlet.GenericServlet 이 기본

@WebServlet("/service.do")
public class ServletEx03 extends GenericServlet{

	@Override
	public void init() throws ServletException {
		//init() : 서블릿이 로딩 시 단 한번만 호출
		//		 : 필요한 자원을 할당, 서블릿 초기화 목적
		System.out.println("서블릿이 초기화 될 때 호출");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 서블릿이 초기화 된 후 클라이언트로부터 온 요청에 대한 서비스를 수행
		System.out.println("Service() 수행 중...");
		
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>servletEx02 Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> service() called : 서비스 메소드 호출 중... </h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	@Override
	public void destroy() {
		// destroy() : 서블릿 객체가 더 이상 필요하지 않게 되면 메모리에서 제거
		System.out.println("서블릿이 메모리에서 제거될 때 호출..");
		
	}
	
	
	
}
