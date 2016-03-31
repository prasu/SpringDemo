<!DOCTYPE html>

<html ng-app="ciApp">
<head>
<title>CI Dashboard</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/ci_dash.css" media="screen" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/nav.css" media="screen" />
<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> -->
<script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
</head>

<body>
<div  class='container'>
            <div class='page-header'>
                <h1> CI - Dashboard </h1>
            </div>
            <div class='row'>
                <div class='col-sm-12' ng-include='"${pageContext.request.contextPath}/resources/pages/views/nav.html"'></div>
            </div>
            <div class='row'>
                <div class='col-sm-12' ng-view></div>
            </div>
        </div>

    <!-- <script src='../lib/jquery/dist/jquery.min.js'></script> -->
	<!-- <script src='../lib/bootstrap/dist/js/bootstrap.min.js'></script> -->
	<!-- <script src='../lib/angular/angular.min.js'></script> -->
	<!-- <script src='../lib/angular-route/angular-route.min.js'></script>
	<script src='../lib/angular-resource/angular-resource.min.js'></script>
	<script src='../lib/angular-messages/angular-messages.min.js'></script> -->
	<script src="${pageContext.request.contextPath}/resources/js/ci-apps.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/ci-controllers.js"></script>
    <!--<script src="../js/myCtrl.js"></script> -->

</body>
</html>
