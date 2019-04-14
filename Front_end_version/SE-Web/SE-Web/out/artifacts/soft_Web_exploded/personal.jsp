<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>欢迎进入个人中心</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style media="all" type="text/css">@import "css/all.css";</style>
</head>
<body>
<div id="main">
	<div id="header">
		<class="logo"><img src="img/neu.png" width="98" height="98" alt="" /></a>

	</div>
	<div id="middle">
		<div id="left-column">
			<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;个人中心</h3>

			<ul class="nav">
				<li class="active"><a href="#">我的活动</a></li>
				<li class="last"><a href="index1.jsp">返回首页</a></li>
			</ul>
		</div>
		<div id="center-column">
			<div class="top-bar">
				<h1>我的活动</h1>
			</div><br />
		 <p>&nbsp;</p>
		  
			<div class="table">
				<img src="images/bg-th-left.gif" width="8" height="7" alt="" class="left" />
				<img src="images/bg-th-right.gif" width="7" height="7" alt="" class="right" />
				<table class="listing" cellpadding="0" cellspacing="0">
					<tr>
						<th width="260">活动名称</th>
						<th width="125">活动时间</th>
						<th width="125">活动地点</th>
						<th class="last" width="first"></th>
					</tr>
					<tr class="bg">
						<td class="first style1">奔跑吧，少年！金锤社校园定向越野活动</td>
						<td>2018.06.01</td>
						<td>东北大学南湖校区</td>
						<td class="last"><input type="submit" name="" value="取消" /></td>
					</tr>
					<c:forEach var="list" items="${allsublist}">
					<tr>
					<tr class="bg">
						<td class="first style1"> ${list.infoTitle} </td>
						<td>${list.id}</td>
						<td>${list.infoContent}</td>
						<td>${list.infoLinkman}</td>
						<td class="last">未通过</td>
					</tr>
					</c:forEach>
				</table>

			</div>
		</div>
		<div id="right-column">
			<strong class="h">活动须知</strong>
			<div class="box">可在个人中心查看当前已报名活动，点击活动名称查看活动详细信息，
			点击“取消报名”按钮可取消报名，取消报名后无法参加活动，再次参加请重新报名。</div>
	  </div>
	</div>
	<div id="footer"></div>
</div>

  
  </body>
</html>

