package cn.yunkuke.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/** 
* @author zqb on 2016年9月17日 
*/
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response =(HttpServletResponse) arg1;
		HttpSession session =request.getSession();
		
		if(request.getRequestURI().indexOf("login")!=-1
				||request.getRequestURI().indexOf("register")!=-1){
			arg2.doFilter(arg0, arg1);
		}
		
		if(session.getAttribute("userId")!=null){
			arg2.doFilter(arg0, arg1);
		}else{
			arg2.doFilter(arg0, arg1);
			//response.sendRedirect("/yunkuke/error/noLogin");
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		

	}

}
