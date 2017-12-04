
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>后台登录 </title>

    <!-- Bootstrap -->
    <link href="/root/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/root/css/font-awesome.min.css" rel="stylesheet">

    <!-- Animate.css -->
    <link href="/root/css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="/root/css/custom.min.css" rel="stylesheet">
</head>

<body class="login">
<div>


    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form action="/user?m=login" method="post" id="logForm">
                    <h1>后台系统</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="用户名" name="logName" />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="密码" name="logPasswd"  />
                    </div>
                    <div>
                        <a class="btn btn-default " href="javascript:;" onClick="login()">登录</a>
                    </div>

                    <div class="clearfix"></div>
                    <div class="separator">
                        <div class="clearfix"></div>
                        <br />

                        <div>
                            <h1><i class="fa fa-paw"></i> 管理后台</h1>
                            <p>©2018 All Rights Reserved</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>


    </div>
</div>
<script src="/js/jquery.min.js" ></script>
<script src="/js/kriss.js" ></script>
<script>
    function login(){
        if($("input[name='logName']").val()==''){
            alert("请填写用户名");
            return;
        }
        if($("input[name='logPasswd']").val()==''){
            alert("请填写密码");
            return;
        }
        $("#logForm").trigger("submit");
    }
    var status  = getQueryString("status");
    if(status) {
        if (status == 'logFailed') {
            alert("用户名或密码错误");
        }else if(status == 'nolog'){
            alert("未登录或登录超时，请重新登录");
        }
    }

</script>
</body>
</html>
