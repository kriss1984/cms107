
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="/root/images/img.jpg" alt="..." class="img-circle profile_img">
                    </div>
                    <div class="profile_info">
                        <span>欢迎,</span>
                        <h2>${sessionScope.currentUser.nickName}</h2>
                    </div>
                </div>
                <!-- /menu profile quick info -->

                <br />

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <h3>主菜单</h3>
                        <ul class="nav side-menu">
                            <!--
                            <li><a><i class="fa fa-home"></i>文章系统<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" style="display: block;">
                                    <li><a href="/root/article_pub.jsp">发表文章</a></li>
                                    <li><a href="/article?m=listArticle">文章列表</a></li>
                                </ul>
                            </li>
                            -->
                            <li><a><i class="fa fa-home"></i>客户管理<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" style="display: block;">
                                    <li><a href="/biz?m=regList">客户列表</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- /sidebar menu -->
            </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
            <div class="nav_menu">
                <nav>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a href="/user?m=logout" class="user-profile dropdown-toggle" >
                                <img src="/root/images/img.jpg" alt="">退出
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
        <!-- /top navigation -->
