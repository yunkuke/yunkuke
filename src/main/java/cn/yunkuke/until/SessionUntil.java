package cn.yunkuke.until;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;

import cn.yunkuke.entity.Users;

/** 
* @author zqb on 2016年9月21日 
*/
public class SessionUntil {

	public static void main(String[] args) {
		

	}
	public boolean isNull(HttpServletRequest request){
		if(request.getSession()==null){
			return true;
		}else{
			return false;
		}
	}
	public String getSessionID(HttpServletRequest request){
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		return userId;		
	}
	public int getSessionLevel(HttpServletRequest request){
		HttpSession session = request.getSession();
		int userLevel =(int)session.getAttribute("userLevel");
		return userLevel;		
	}
}
