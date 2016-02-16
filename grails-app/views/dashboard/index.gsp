<!DOCTYPE html>
<html>
<head>

    <meta name="layout" content="amsLayout">
    <title>Dashboard</title>


</head>

<body>
<div class="closeSidebar">
    <section class="content-header">
        <h1>
            Dashboard
            <small>Schedule</small>
        </h1>
        <ol class="breadcrumb">
            <li ng-show="isAdmin"><a href="#" ng-click="goToHome()"><i class="fa fa-user"></i> Admin</a></li>
            <li><a href="#" ng-click="goToDashboard()"><i class="fa fa-dashboard"></i> Dashboard</a></li>
        </ol>

    </section>
    <section class="content">
        <div ui-view="dash"></div>
        <div ui-view class="row"></div>
    </section>
</div>

<script>
    $(document).on("click", ".openSidebar", function () {
        $(".control-sidebar").addClass("control-sidebar-open")
    });
</script>
</body>
</html>
