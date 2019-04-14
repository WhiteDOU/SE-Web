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
 * Servlet implementation class Passservlet
 */
@WebServlet("/Passservlet")
public class Passservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Passservlet() {
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
		String sql="UPDATE tb_info SET info_state = ? WHERE (id = ?)";
		String id1=request.getParameter("id");
		int id = Integer.valueOf(id1);
		String state1="1";
		Object[] params={state1,id};
		int t=myOp.OpUpdate(sql, params);
		System.out.println("xiugai"+t);
		String sql1="SELECT * FROM tb_info WHERE (info_state = ?)";
		String state="0";
		Object[] params2={state};
		List allsublist=myOp.OpListShow(sql1,params2);		//����ҵ������л�ȡ��Ϣ�б�ķ���������List����
		request.setAttribute("allsublist",allsublist);
            request.getRequestDispatcher("/check.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
