package d20210303;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet.php")
public class ServletEx04 extends HttpServlet{
	
	// 객체 직렬화를 위한 코드
	private static final long serialVersionUID = 1L;	//가져다가 사용하지는 않는다고 함(?)
	
	// 추후 프레임워크에서 서블릿을 잘 인식을 못할 경우가 있음. 그 때 처리하기 위한 방법
	public ServletEx04() {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("Served : ").append(req.getContextPath());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
	
	
	
}
