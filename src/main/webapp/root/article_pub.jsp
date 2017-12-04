<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	  
    <title> </title>

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
            <div class="page-title">
              <div class="title_left">
                <h3>新增文章</h3>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>请填写文章内容 </h2>
                   
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" action="/article?m=saveArticle" method="post">
                      <div class="form-group">
                        <label class="control-label col-md-2 col-sm-2 col-xs-12" >标题 <span class="required">*</span>
                        </label>
                        <div class="col-md-8 col-sm-8 col-xs-12">
                          <input type="text" required class="form-control col-md-7 col-xs-12" name="articleTitle">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-2 col-sm-2 col-xs-12" >内容 <span class="required">*</span>
                        </label>
                         <div class="col-md-8 col-sm-8 col-xs-12">
                           <textarea cols="10" id="editor1" name="articleContent" rows="30"></textarea>
                           <ckeditor:replace replace="articleContent" basePath="/ckeditor/" ></ckeditor:replace>
                        </div>
                      </div>
     
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
                          <button class="btn btn-primary" type="button">取 消</button>
                          <button type="submit" class="btn btn-success">提 交</button>
                        </div>
                      </div>

                    </form>
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
  </body>
</html>
