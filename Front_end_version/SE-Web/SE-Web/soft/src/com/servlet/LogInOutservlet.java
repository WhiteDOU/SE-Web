package com.servlet;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Single.UserSingle;
import com.db.OpDB;

/**
 * Servlet implementation class LogInOutservlet
 */

public class LogInOutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected UserSingle user;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInOutservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8"); 
		HttpSession session = request.getSession();//获取session
		OpDB myOp = new OpDB();	
		Object ob=session.getAttribute("name");
 		//如果对象为空，或者不是UserSingle类的实例，表示没有登录
		if(ob!=null) {
            request.getRequestDispatcher("/index.jsp").forward(request,response);
			System.out.println("已经登陆");
			int t=Integer.parseInt((String)(session.getAttribute("type")));
			if(t==1)
	            request.getRequestDispatcher("/index1.jsp").forward(request,response);
			else if(t==2)
				request.getRequestDispatcher("/index2.jsp").forward(request,response);
			else if(t==3)
				request.getRequestDispatcher("/index3.jsp").forward(request,response);

		}//返回登录页面
		else{						//已经登录
			
				
		String sql="select * from tb_user where name=? and password=?";
		String name = request.getParameter("name");  
        String pwd = request.getParameter("pwd");
		Object[] params={name,pwd};
		int k;
		if(( k=myOp.LogOn(sql, params))!=0){								//存在该用户，登录成功
			session.setAttribute("name", name);// 将用户名和密码保存在session中  
            session.setAttribute("pwd", pwd);// 将用户名和密码保存在session中  					
            session.setAttribute("type",k);
            System.out.println(k);
            if(k==1)
            request.getRequestDispatcher("/index1.jsp").forward(request,response);
            else if(k==2)
                request.getRequestDispatcher("/index2.jsp").forward(request,response);
            else if(k==3)
                request.getRequestDispatcher("/index3.jsp").forward(request,response);

		}
		else {
		response.sendRedirect("login.jsp?error=yes");}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}



}
