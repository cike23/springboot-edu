<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
    <meta name="content-type" content="text/html; charset=UTF-8" />

    <style type="text/css">
        *{margin:0px;padding:0px;}
        ul,li{list-style-type:none;}
        a{text-decoration:none;color:#000;}
        body,html{background:#fff;font-family:"微软雅黑";font-size:12px;}

        #top{width:100%;height:60px;background:#0f3102;}
        #top .header{text-align:center;color:#fff;font-size:30px;line-height:60px;font-weight:600;}

        #content{width:100%;height:500px;}
        #content .box{width:400px;height:400px;margin:10px auto;border:1px solid green;}
        #content .box .banner{width:100%;height:50px;background:#216b0e;color:#fff;font-size:30px;font-weight:800;
            line-height:50px;text-indent:20px;border:1px solid red;}
        #content .box .user{width:100%;height:100px;border:1px solid red;}
        #content .box .pass{width:100%;height:100px;border:1px solid red;}
        #content .box .login{width:100%;height:50px;border:1px solid red;}

    </style>
</head>

<body>
<!-- 头部 -->
<div id="top">
    <div class="header">环境数据平台</div>
</div>

<!-- 内容主体 -->
<div id="content">
    <div class="box">
        <div class="banner">登 录 采 集</div>
        <div class="user">
            <p class="txt">用户名</>
            <p><input type="text" /></p>
        </div>
        <div class="pass">
            <p class="txt">密码</>
            <p><input type="text" /></p>
        </div>
        <div class="login">
            <input type="button" id="btn" value="开始采集" />
        </div>
    </div>
</div>

<script type="text/javascript" src="/static/js/jquery.js"></script>
<script type="text/javascript">


    function isEmpty(str){
        if ( str == "" ) return true;
        var regu = "^[ ]+$";
        var re = new RegExp(regu);
        return re.test(str);
    }

    $(function () {
        $("#btn").click(function () {
            alert("点击了......");
        });
    });
</script>
</body>
</html>