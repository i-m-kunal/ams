<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AMS | <g:layoutTitle/></title>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>

    <!-- Our Website CSS Styles -->
    <link rel="stylesheet" href="/css/main.css">
    <asset:stylesheet href="pms.css"/>
    <asset:javascript src="application.js"/>

</head>

<body ng-app="amsApp">

<!--[if lt IE 7]>
<p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->


<!-- Our Website Content Goes Here -->
<g:render template="/layouts/header"></g:render>
<sec:ifLoggedIn>
    %{--<div ui-view></div>--}%
</sec:ifLoggedIn>
<sec:ifNotLoggedIn>
    <g:layoutBody/>
</sec:ifNotLoggedIn>
<g:render template="/layouts/footer"></g:render>

</body>
</html>
