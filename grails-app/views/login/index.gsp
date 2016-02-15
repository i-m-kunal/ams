<%--
  Created by IntelliJ IDEA.
  User: kunal
  Date: 8/2/16
  Time: 10:24 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><meta name="layout" content="amsLayout"/>
    <title>Login Page</title>
</head>

<body>
<div class="jumbotron" style="padding-left: 30px">
    <h3>Please Login</h3>

    <div >
        <sec:ifNotLoggedIn>
            <p>

                <g:link class="btn btn-primary btn-lg" role="button" controller="login"
                        action="auth">ToTheNew Digital
                </g:link>
            </p>

        </sec:ifNotLoggedIn>
    </div>
</div>
</body>
</html>