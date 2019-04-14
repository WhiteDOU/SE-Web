package com.db;
import java.sql.*;
public class DB {
		private Connection con;           //connection����
		private PreparedStatement pstm;   //........����
		private String user="root";
		private String password="980711";
		private String className="com.mysql.jdbc.Driver";
		private String url="jdbc:mysql://localhost:3306/db_book?characterEncoding=utf-8";
		public DB(){
			try{
				Class.forName(className);
			}catch(ClassNotFoundException e){
				System.out.println("����ʧ��");
				e.printStackTrace();
			}
		}
		public Connection getCon(){               //��ȡ����
			try{
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_book?characterEncoding=utf-8",user,password);
			}catch(SQLException e){
				System.out.println("����ʧ��");
				con=null;
				e.printStackTrace();
			}
			return con;
		}
		public void doPstm(String sql,Object[] params){                      //�����ݿ���ɾ���
			if(sql!=null && !sql.equals("")){
				if (params == null )params = new Object[0];           //�½�object
				getCon();
				if(con!=null){
					try{
						pstm=con.prepareStatement(sql);
						System.out.println("out");
						for(int i=0;i<params.length;i++){
							pstm.setObject(i+1,params[i]);
							System.out.println(params[i]);
						}
						pstm.execute();
					}catch(SQLException e){
						System.out.println("doPostm��������");          
						e.printStackTrace();
					}
				}
			}
		}
		
		
		
		public ResultSet getRs() throws SQLException{                     //�Ż�ResultSet����
			return pstm.getResultSet();
		}
		public int getCount() throws SQLException{                          //������getResultSet����Ӱ��ļ�¼��
			return pstm.getUpdateCount();
		}
		public void closed(){
			try{
				if(pstm!=null)
					pstm.close();			
			}catch(SQLException e){
				System.out.println("�ر�pstm����ʧ�ܣ�");
				e.printStackTrace();
			}
			try{
				if(con!=null){
					con.close();
				}
			}catch(SQLException e){
				System.out.println("�ر�con����ʧ�ܣ�");
				e.printStackTrace();
			}
		}
}
