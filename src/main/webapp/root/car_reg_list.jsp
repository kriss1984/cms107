<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	  
    <title></title>

    <!-- Bootstrap -->
   
<link href="/root/css/bootstrap.min.css" rel="stylesheet">
<link href="/root/css/font-awesome.min.css" rel="stylesheet">
<link href="/root/css/animate.min.css" rel="stylesheet">
<!-- Custom Theme Style -->
<link href="/root/css/custom.min.css" rel="stylesheet">
<link href="/root/css/kriss.css" rel="stylesheet">
  </head>

  <body class="nav-md">

  <jsp:include page="common/body_1.jsp"/>
        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>报名管理 </h2>
                      <ul class="nav navbar-right panel_toolbox">
                          <li>
                             信息列表
                          </li>
                      </ul>
                    <div class="clearfix"></div>
                  </div>

                  <div class="x_content">


                    <div class="table-responsive">
                      <table class="table table-striped jambo_table bulk_action">
                        <thead>
                        <tr class="headings">
                          <th>
                            <input type="checkbox" id="check-all" class="flat">
                          </th>
                          <th class="column-title">名字 </th>
                          <th class="column-title">联系方式 </th>
                          <th class="column-title">意向车型</th>
                          <th class="column-title">参展区域</th>
                          <th class="column-title">报名时间</th>
                          <th class="column-title">报名IP</th>
                          <th class="bulk-actions" colspan="7">
                            <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
                          </th>
                        </tr>
                        </thead>
                        <tbody>

                    <c:forEach items="${pager.rows}" var="row" varStatus="st">
                        <tr class="${stt.index%2==0?"odd":"even"}  pointer">
                          <td class="a-center ">
                            <input type="checkbox" class="flat" name="table_records">
                          </td>
                          <td class=" ">${row.username}</td>
                          <td class=" ">${row.phone}</td>
                          <td class=" ">${row.cartype}</td>
                          <td class=" ">${row.zone}</td>
                          <td class=" "><fmt:formatDate value="${row.registtime}" pattern="yyyy-MM-dd HH:mm" /></td>
                          <td class=" ">${row.registip}</td>
                          <td class="last"></td>
                        </tr>
                      </c:forEach>

                        </tbody>
                      </table>
                      ${pager.bootstrapPager}
                    </div>

                  </div>
                </div>

              </div>
            </div>

          </div>
        </div>
        <!-- /page content -->
  <jsp:include page="common/foot_1.jsp" />
      </div>
    </div>

    <!-- jQuery -->
    <script src="/root/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="/root/js/bootstrap.min.js"></script>
    <script src="/root/js/custom.min.js"></script>
    <script src="/root/js/icheck.min.js"></script>
  </body>
</html>

<script>
    function prePage() {
        if ("${pager.page}" == "1") {
            return;
        }
        location.href="/biz?m=carRegList&pageNo="+"${pager.page-1}";
    }
    function nextPage() {
        if ("${pager.total}" ==${pager.page}) {
            return;
        }
        location.href="/biz?m=carRegList&pageNo="+"${pager.page+1}";
    }
    function goPage(page) {
        location.href="/biz?m=carRegList&pageNo="+page;
    }


</script>
