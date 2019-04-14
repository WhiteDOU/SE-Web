<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s2"%>
<%@ page import ="com.db.*"%>
<%@ page import ="com.Single.*"%>
<%@ page import ="com.superaction.*"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8"/>
    <title>东大活动墙</title>
    <meta name="keywords" content="keywords"/>
    <meta name="description" content="description"/>
    <script type="text/javascript" src="js\base-loading.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css\style.css"/>
  </head>
  <body>
    <div class="s_header w">
      <div class="s_header_top w">
        <div class="header_top w1000 auto">
          <div class="header_top_fl fl">东大活动墙校内活动信息发布系统</div>
          <div class="header_top_fr fr"><span class="header_tel dib">欢迎使用！</span>
            <div class="cb"></div>
          </div>
          <div class="cb"></div>
        </div>
      </div>
      <div class="s_header_nav w">
        <div class="header_nav w1000 auto">
          <div class="logo fl"><a href="index.jsp"><img src="images/logo.png" alt="" width="200" height="69"/></a></div>
          <div class="nav fr">
            <ul>
              <li class="pr"><li id="www"><li><a href="index.jsp">首页</a></li>
              <form action="LogInOutservlet"><li class="pr fr"><li id="www"><li><a href="login.jsp">登陆</a></li>
              </form>
            </ul>
          </div>
          <div class="cb"></div>
        </div>
      </div>
    </div>
    <div class="header_line"></div>
    <div class="banner">
      <div id="banner" class="dv_5"><a href="" style=" background:url(images/banner1.png) center center no-repeat; display: block; z-index: 1; " class="d1"></a><a href="" style=" background:url(images/banner2.png) center center no-repeat; display: block; z-index: 1; " class="d1"></a><a href="" style=" background:url(images/banner3.png) center center no-repeat; display: block; z-index: 1; " class="d1"></a>
        <div id="banner_id" class="d2">
          <table cellspacing="0" cellpadding="0">
            <tr>
              <td>
                <div class="nuw"></div>
              </td>
              <td>
                <div></div>
              </td>
              <td>
                <div></div>
              </td>
            </tr>
          </table>
        </div>
      </div>
    </div>
    <div class="cen_tip w">
      <div class="tip auto">
        <ul>
          <li class="first"><a href="club1.html" class="pr">
              <div class="tit">社团在线</div>
              <div class="entit">SOCIETY</div>
              <div class="pa tip_img_1"><img src="images/tip_1.png" alt=""/></div></a></li>
          <li><a href="activity1.html" class="pr">
              <div class="tit">活动信息</div>
              <div class="entit">ACTIVITY</div>
              <div class="pa tip_img_2"><img src="images/tip_2.png" alt=""/></div></a></li>
          <li><a href="competetion.html" class="pr">
              <div class="tit">竞赛列表</div>
              <div class="entit">COMPETITION</div>
              <div class="pa tip_img_3"><img src="images/tip_3.png" alt=""/></div></a></li>
          <li><a href="login.jsp" class="pr">
              <div class="tit">个人中心</div>
              <div class="entit">PERSONAL</div>
              <div class="pa tip_img_4"><img src="images/tip_4.png" alt=""/></div></a></li>
        </ul>
      </div>
    </div>
    <div class="s_cen w">
      <div class="center w1000 auto">
        <div class="cen_one">
          <div class="cen_one_fl fl">
            <div class="jqal_top">
              <div class="jqal_top_tit fl">抢票预告</div>
              <div class="jqal_top_more fr"><a href="activity1.html">更多></a></div>
              <div class="cb"></div>
            </div>
            <div class="jqal_bom mychgPic">
              <div id="myFocus" class="mF_liuzg">
                <ul class="pic">
                  <li><a href="" target="_blank"><img src="images/focus_1.png" alt="后来的我们宣传会" width="220" height="170"/></a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="cen_one_fr fr">
            <div class="cen_one_fr_top">
              <div class="cen_one_fr_tit fl">明星社团</div>
              <div class="cen_one_fr_more fr"><a href="club1.html">更多></a></div>
              <div class="cb"></div>
            </div>
            <div class="cen_one_fr_bom">
              <div class="cen_one_img fl"><img src="images/cen_one_img.png" alt="" width="150" height="170"/></div>
              <div class="cen_one_desc fr">
<p>想学习一口纯正的粤语吗？</p>
<p>想看港剧不用看字幕吗？</p>
<p>觉得别人能唱《红日》《浮夸》很酷炫吗?</p>
<p>想站在东大粤语歌唱大赛的舞台上一展歌喉吗？</p>
无论你渴望在这里收获友情爱情，还是基情 我们都无任欢迎 
我们就是想找那么一群人 一起疯 一起笑 一起做喜欢的事 一起扛 磕磕碰碰哈哈笑笑 填满你的大学时光 
毕竟大学，只有一次

                <p><a href="club-yue"> [ 查看详情 ]</a></p>
              </div>
              <div class="cb"></div>
            </div>
          </div>
          <div class="cb"></div>
        </div>
        <div class="cen_two">
          <div class="cen_two_fl fl">
            <div class="fwfw_top">
              <div class="fwfw_top_tit fl">近期活动</div>
              <div class="fwfw_top_more fr"><a href="activity1.html">更多></a></div>
              <div class="cb"></div>
            </div>
            <div class="fwfw_bom picMarquee-top">
              <div class="bd">
                <ul>
                  <li><img src="images/marquee_1.png" alt="" class="fl"/>
                      <div class="fwfw_marquee fr">
                        <div class="fwfw_tit">春风十里浑南有你</div>
                        <div class="fwfw_desc">和我在时光街头走一走</div>
                      </div>
                      <div class="cb">										</div></a></li>
                  <li><img src="images/marquee_2.png" alt="" class="fl"/>
                      <div class="fwfw_marquee fr">
                        <div class="fwfw_tit">粤声悠悠其韵长流</div>
                        <div class="fwfw_desc">第四届粤语歌唱大赛</div>
                      </div>
                      <div class="cb">	</div></a></li>
                  <li><img src="images/marquee_3.png" alt="" class="fl"/>
                      <div class="fwfw_marquee fr">
                        <div class="fwfw_tit">樱花诗赛</div>
                        <div class="fwfw_desc">这里有你的诗和远方</div>
                      </div>
                      <div class="cb">											</div></a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="cen_two_cen fl">
            <div class="s_news_top">
              <div class="s_news_top_tit fl">竞赛动态</div>
              <div class="s_news_top_more fr"><a href="competetion.html">更多></a></div>
              <div class="cb"></div>
            </div>
            <div class="s_news_bom">
              <div class="s_news_flag_tit">关于举办东北大学2018年“建龙钢铁”大学生数学建模竞赛</div>
              <div class="s_news_flag_desc">为深入开展科技创新活动，培养和锻炼学生运用所学解决实际问题的能力，同时选拔优秀学生参加2018年全国大学生数学建模竞赛及2019年国际（美国）大学生数学建模竞赛，经研究决定举办东北大学2018年“建龙钢铁”大学生数学建模竞赛。 <a href="http://cxzx.neu.edu.cn/SinglePage.aspx?id=c92a87d9-1bc8-4f4e-9597-323c989f3af9&newsType=38ddc72a-0f81-4821-ad00-2db7b671d5bc">[ 查看详情 ]</a></div>
              <div class="s_news_bom_ul">
                <ul>
                  <li><a href="http://cxzx.neu.edu.cn/SinglePage.aspx?id=c44afbb7-32c6-4b3f-84aa-55db7347be76&newsType=38ddc72a-0f81-4821-ad00-2db7b671d5bc">关于举办2018东北大学大学生LabVIEW编程竞赛比赛通知...</a></li>
                  <li><a href="http://cxzx.neu.edu.cn/SinglePage.aspx?id=02663768-0c24-4b14-bde9-6781c593a580&newsType=38ddc72a-0f81-4821-ad00-2db7b671d5bc">关于举办东北大学2018年“建龙钢铁”大学生新媒体设计竞赛的通知...</a></li>

                </ul>
              </div>
            </div>
          </div>
          <div class="cen_two_fr fr">
            <div class="cont_top">
              <div class="cont_top_tit fl">信息反馈</div>
              <div class="cb"></div>
            </div>
            <div class="cont_bom"><a href=""><img src="images/s_lxwm_bg.png" alt=""/></a>
              <p>联系人：校团委学生团体部部长 孙坤老师</p>
              <p>电话：024-65652769</p>
              <p>手机：13309816765</p>
              <p>E-Mail：sunkun@neu.edu.cn</p>
            </div>
          </div>
          <div class="cb"></div>
        </div>
      </div>
    </div>
    <script type="text/javascript" src="js/jquery-1.8.1.min.js"></script>
    <!--首页banner特效-->
    <script type="text/javascript" src="js/banner.js"></script>
    <script type="text/javascript" src="js/main.js"> </script>
    <script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
    <script>
      banner();
      //- 服务范围特效
      jQuery(".picMarquee-top").slide({mainCell:".bd ul",autoPlay:true,effect:"topMarquee",vis:3,interTime:50});
    </script>
  </body>
</html>