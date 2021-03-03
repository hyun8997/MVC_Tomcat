package d20210303;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20210303/cal.do")
public class ServletEx05 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String num1 = req.getParameter("num1");
		int n1=0;
		if(num1!=null){
			n1 = Integer.parseInt(num1);
		}
		String num2 = req.getParameter("num2");
		int n2=0;
		if(num2!=null){
			n2 = Integer.parseInt(num2);
		}
		
		String plus = req.getParameter("plus");
		if(plus==null){plus="off";}
		String minus = req.getParameter("minus");
		if(minus==null){minus="off";}
		String multi = req.getParameter("multi");
		if(multi==null){multi="off";}
		String divi = req.getParameter("divi");
		if(divi==null){divi="off";}
		
		double result = 0;
		
		if(plus.equals("on")) {
			result=n1+n2;
		}else if(minus.equals("on")) {
			result=n1-n2;
		}else if(multi.equals("on")) {
			result=n1*n2;
		}else if(divi.equals("on")&&n2!=0) {
			result=n1/n2;
		}
		
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>servletEx01 Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Result </h1>");
		out.println("<h1>"+"num "+n1+" num2 "+n2+ "</h1>");
		out.println("<h1>"+"result" +result+ "</h1>");
		out.println("<h1> "+ "+" + plus +"-"+ minus+ "*"+ multi+"/"+divi+" </h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
