package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.OpDB;

/**
 * Servlet implementation class userman
 */
@WebServlet("/userman")
public class userman extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userman() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8"); 
		HttpSession session = request.getSession();//��ȡsession
		OpDB myOp = new OpDB();	
		String name=(String) session.getAttribute("name");
		String sql="SELECT * FROM contact WHERE (c_name = ?)";
		Object[] params={name};
		List typefindlist=myOp.OpListShowUserman(sql,params);		//����ҵ������л�ȡ��Ϣ�б�ķ���������List����
		request.setAttribute("usermanlist",typefindlist);
            request.getRequestDispatcher("/personal.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
