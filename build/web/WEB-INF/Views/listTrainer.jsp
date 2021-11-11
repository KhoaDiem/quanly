
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Trang chủ</title>
	<link href="./assets/css/bootstrap.min.css" rel="stylesheet">
	<link href="./assets/css/style.css" rel="stylesheet">
	<script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Nhân sự</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.html">Dashboard</a></li>
					<li><a href="hai.html">Nhân sự</a></li>
					<li><a href="duy.html">Khoa</a></li>
					<li><a href="quang.html">Phòng ban</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Xin chào, Admin</a></li>
					<li><a href="login.html">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<header id="header">
		<div class="container">
			<div class="row">
				<div class="col-md-10">
					<h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Quản lý <small>Nhân sự UTT</small></h1>
				</div>
				<div class="col-md-2">
					<div class="dropdown create">
						<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							Chức năng
							<span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="hai.html">Quản lý nhân sự</a></li>
							<li><a href="duy.html">Quản lý khoa</a></li>
							<li><a href="quang.html">Quản lý phòng ban</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</header>

	<section id="breadcrumb">
		<div class="container">
			<ol class="breadcrumb">
				<li class="active">Dashboard</li>
			</ol>
		</div>
	</section>

	<section id="main">
		<div class="container">
			<div class="row">
				<div class="col-md-3">
					<div class="list-group">
						<a href="index.html" class="list-group-item active main-color-bg">
							<span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Bảng điều khiển
						</a>
						<a href="hai.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Quản lý nhân sự</a>
						<a href="quang.html" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Quản lý phòng ban</a>
						<a href="duy.html" class="list-group-item"><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Quản lý khoa</a>
					</div>

					<div class="well">
						<h4>Tổng người dùng</h4>
						<div class="progress">
							<div class="progress-bar" role="progressbar" aria-valuenow="300" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">
								300
							</div>
						</div>
						<h4>Đang online </h4>
						<div class="progress">
							<div class="progress-bar" role="progressbar" aria-valuenow="4" aria-valuemin="0" aria-valuemax="100" style="width: 4%;">
								4
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-9">
					<div class="panel panel-default">
						<div class="panel-heading main-color-bg">
							<h3 class="panel-title">Tổng quan</h3>
						</div>
						<div class="panel-body">
							<div class="col-md-4">
								<div class="well dash-box">
									<h2><span class="glyphicon glyphicon-user" aria-hidden="true"></span> 300</h2>
									<h4>Nhân viên</h4>
								</div>
							</div>
							<div class="col-md-4">
								<div class="well dash-box">
									<h2><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> 4</h2>
									<h4>Phòng ban</h4>
								</div>
							</div>
							<div class="col-md-4">
								<div class="well dash-box">
									<h2><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> 8</h2>
									<h4>Khoa</h4>
								</div>
							</div>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Người dùng gần đây</h3>
						</div>
						<div class="panel-body">
							<table class="table table-striped table-hover">
								<tr>
									<th>STT</th>
									<th>Tên</th>
									<th>Email</th>
									<th>Ngày truy cập</th>
								</tr>
								<tr>
									<td>1</td>
									<td>Vũ Đình Tuân</td>
									<td>vutuanutt@gmail.com</td>
									<td>17/10/2018</td>
								</tr>
								<tr>
									<td>2</td>
									<td>Phùng Xuân hải</td>
									<td>haipx@gmail.com</td>
									<td>17/10/2018</td>
								</tr>
								<tr>
									<td>3</td>
									<td>Tô Đình Duy</td>
									<td>duytd@gmail.com</td>
									<td>17/10/2018</td>
								</tr>
								<tr>
									<td>4</td>
									<td>Vũ Minh Quang</td>
									<td>quangvm@gmail.com</td>
									<td>17/10/2018</td>
								</tr>
								<tr>
									<td>5</td>
									<td>Đỗ Nam Huy</td>
									<td>huydn@gmail.com</td>
									<td>17/10/2018</td>
								</tr>
								<tr>
									<td>6</td>
									<td>Hoàng Văn Lãm</td>
									<td>lamhv@gmail.com</td>
									<td>16/10/2018</td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<footer id="footer">
		<p>Copyright 67DCHT22, &copy; 2018</p>
	</footer>

    <!-- Bootstrap core JavaScript
    	================================================== -->
    	<!-- Placed at the end of the document so the pages load faster -->
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    	<script src="js/bootstrap.min.js"></script>
    </body>
    </html>

