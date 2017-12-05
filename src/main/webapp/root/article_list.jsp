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
                    <h2>文章管理 </h2>
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
                          <th class="column-title">标题 </th>
                          <th class="column-title">发布时间 </th>
                          <th class="column-title">URL</th>
                          <th class="column-title">点击次数</th>
                          <th class="column-title">关键词</th>
                          <th class="column-title no-link last"><span class="nobr">操作</span>
                          </th>
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
                          <td class=" ">${row.articleTitle}</td>
                          <td class=" "><fmt:formatDate value="${row.createTime}" pattern="yyyy-MM-dd" /></td>
                          <td class=" ">
                              <c:if test="${fn:length(row.path)>0}">
                                  <a href="${applicationScope.host}${row.path}" target="_blank">${applicationScope.host}${row.path}<a>
                              </c:if>

                          </td>
                          <td class=" ">${row.clickCnt}</td>
                          <td >${row.keyWords}</td>
                          <td class=" last">
                              <a href="#">查看</a>
                              <a href="#">编辑</a>
                              <a href="#">删除</a>
                          </td>
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
        location.href="/article?m=listArticle&pageNo="+"${pager.page-1}";
    }
    function nextPage() {
        if ("${pager.total}" ==${pager.page}) {
            return;
        }
        location.href="/article?m=listArticle&pageNo="+"${pager.page+1}";
    }
    function goPage(page) {
        location.href="/article?m=listArticle&pageNo="+page;
    }
</script>
