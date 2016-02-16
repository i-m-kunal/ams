<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AMS | Dashboard</title>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>

    <asset:stylesheet href="pms.css"/>
    <asset:javascript src="application.js"/>

</head>

<body ng-app="amsApp">

<div ng-include src="'ams/header.html'"></div>

<div ui-view=""></div>

<div ng-include src="'ams/footer.html'"></div>

</body>
</html>
