package com.db;
import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import com.Single.*;


public class OpDB {
	private DB mydb;
	public OpDB(){
		mydb=new DB();	
	}
	public List OpListShow(String sql,Object[] params){
		List onelist=new ArrayList();
		mydb.doPstm(sql, params); 		//����DB���doPstm()������ѯ���ݿ�
		try{
			ResultSet rs=mydb.getRs();//��ȡResultSet���������
			if(rs!=null){
				while(rs.next()){
					InfoSingle infoSingle=new InfoSingle();	//����һ����Ϣ�����
					infoSingle.setId(rs.getInt("id"));           //id
					infoSingle.setInfoType(rs.getInt("info_type"));                //����
					infoSingle.setInfoTitle(rs.getString("info_title"));              //����
					infoSingle.setInfoContent(rs.getString("info_content"));           //�����
					infoSingle.setInfoLinkman(rs.getString("info_linkman"));          //��ϵ��
					infoSingle.setInfoPhone(rs.getString("info_phone"));              //�绰
					infoSingle.setInfoEmail(rs.getString("info_email"));              //email
					infoSingle.setInfoDate1(DoString.dateTimeChange(rs.getTimestamp("info_date1")));     //����ʱ��
					infoSingle.setInfoDate2(rs.getString("info_date2"));     //�ʱ��
					infoSingle.setInfoState(rs.getString("info_state"));                  //���״̬
					infoSingle.setInfoPeopleNum(rs.getString("info_peoplenum"));           //��������
					infoSingle.setInfoPeopleFreeNum(rs.getString("info_peoplefreenum"));    //����ʣ������
					onelist.add(infoSingle);			//����Ϣ��Ķ��󱣴浽List���϶�����			
				}
			}
			rs.close();//�رս��������
		}catch (Exception e){
			System.out.println("�鿴��Ϣ�б�ʧ�ܣ�(��ѯ���ݿ�)");			
			e.printStackTrace();
		}finally{
			mydb.closed();		//�ر����ݿ�����	
		}
		return onelist;		
	}
	public List OpListShowUserman(String sql,Object[] params){
		List onelist=new ArrayList();
		mydb.doPstm(sql, params); 		//����DB���doPstm()������ѯ���ݿ�
		try{
			ResultSet rs=mydb.getRs();//��ȡResultSet���������
			if(rs!=null){
				while(rs.next()){
					Personal personal=new Personal();	//����һ����Ϣ�����
					personal.setName(rs.getString("c_name"));           //��������
					personal.setAct(rs.getString("c_act"));    //����ʣ������
					onelist.add(personal);			//����Ϣ��Ķ��󱣴浽List���϶�����			
				}
			}
			rs.close();//�رս��������
		}catch (Exception e){
			System.out.println("�鿴��Ϣ�б�ʧ�ܣ�(��ѯ���ݿ�)");			
			e.printStackTrace();
		}finally{
			mydb.closed();		//�ر����ݿ�����	
		}
		return onelist;		
	}
	
	public InfoSingle OpSingleShow(String sql,Object[] params){
		InfoSingle infoSingle=null;
		mydb.doPstm(sql, params);       		//����DB���doPstm()������ѯ���ݿ�
		try{
		    ResultSet rs=mydb.getRs();	//��ȡResultSet���������
			if(rs!=null&&rs.next()){//���rs��Ϊnull�����Ҵ��ڼ�¼
				InfoSingle infosingle=new InfoSingle();	//����һ����Ϣ�����
				infosingle.setId(rs.getInt("id"));           //id
				infosingle.setInfoType(rs.getInt("info_type"));                //����
				infosingle.setInfoTitle(rs.getString("info_title"));              //����
				infosingle.setInfoContent(rs.getString("info_content"));           //�����
				infosingle.setInfoLinkman(rs.getString("info_linkman"));          //��ϵ��
				infosingle.setInfoPhone(rs.getString("info_phone"));              //�绰
				infosingle.setInfoEmail(rs.getString("info_email"));              //email
				infosingle.setInfoDate1(DoString.dateTimeChange(rs.getTimestamp("info_date1")));     //����ʱ��
				infosingle.setInfoDate2(rs.getString("info_date2"));     //�ʱ��
				infosingle.setInfoState(rs.getString("info_state"));                  //���״̬
				infosingle.setInfoPeopleNum(rs.getString("info_peoplenum"));           //��������
				infosingle.setInfoPeopleFreeNum(rs.getString("info_peoplefreenum"));    //����ʣ������
				rs.close();	//�رս��������			
			}
		}catch(Exception e){
			System.out.println("�鿴��ϸ����ʧ�ܣ�(��ѯ���ݿ�)");
			e.printStackTrace();			
		}finally{
			mydb.closed();//�ر����ݿ�����
		}
		return infoSingle;
	}
	public int OpUpdate(String sql,Object[] params){		
		int i=-1;
		mydb.doPstm(sql, params);	//����DB���doPstm()�����������ݿ�
		try{
			i=mydb.getCount();					//��ȡ���²�����Ӱ��ļ�¼��	
		}catch(SQLException e){
			System.out.println("ִ��OpUpdate()����ʧ�ܣ�(�������ݿ�)");
			e.printStackTrace();
		}finally{
			mydb.closed();
		}
		return i;
	}
	public int LogOn(String sql,Object[] params){
		mydb.doPstm(sql, params);	//��ѯ���ݿ��ȡ�����
		try {
			ResultSet rs=mydb.getRs();			//��ȡ�����	
			UserSingle usersingle=new UserSingle();
			int a = 0;
			if(rs!=null&&rs.next()){
			a=Integer.parseInt(rs.getString("user_type"));}
			boolean mark=(rs==null||!rs.next()?false:true);	//�ж��û��Ƿ���ڣ������ڷ���false�����ڷ���true
			rs.close();
			return a;			
		} catch (SQLException e) {
			System.out.println("��¼ʧ�ܣ�");
			e.printStackTrace();
			return 0;
		}
		finally{
			mydb.closed();
		}
	}}
	
	
