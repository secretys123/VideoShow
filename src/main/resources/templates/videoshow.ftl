<html>
<head>
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<#--<#list videos as video>-->
<#--${video.id}-->
<#--${video.video_url}-->
<#--${video.comment}-->
<#--</#list>-->


<div class="container-fluid">

<#assign i =1/>
<#list videos as video>
    <#if i%3==1>
    <div class="row-fluid">
    </#if>
    <div class="span4" style="text-align: center;">
        <video src=${video.video_url} controls width="350" height="300"></video>
        <div>${video.comment}</div>
    </div>
    <#if i%3==0>
    </div>
    </#if>
    <#assign i++>
</#list>
</body>

</html>