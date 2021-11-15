<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Editor Account</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"/>

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1 class="text-center">ADMIN PAGE</h1>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <form class="form-inline" action="/action_page.php">
                <button class="btn btn-success mr-sm-3" type="submit">Search</button>
                <input class="form-control mr-sm-10" type="text" placeholder="Search">
            </form>
        </nav>
    <h7>---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</h7>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-2" style="background-color:lavender;">
                <div class="list-group">
                    <a href="../index.html" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Dashboard</a>
                    <a href="../quanly/listAccount.html" class="list-group-item active main-color-bg">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Account Management
                    </a>
                    <a href="../quanly/listTrainer.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Trainer Management</a>
                    <a href="../quanly/listTrainee.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Trainee Management</a>
                    <a href="../listSource.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Source Management</a>
                    <a href="../istTopic.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Topic Management</a>
                    <a href="../listCategory.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Category Management</a>
                </div>
            </div>
            <div class="col-sm-10" style="background-color:lavenderblush;">
                <div class="panel panel-default">
                    <div class="panel-heading main-color-bg">
                        <h5 class="panel-title">Add Account</h5>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                        </div>
                        <br>
                        <div class="container">
                            <div class="panel panel-primary">
                                <div class="panel-body">
                                    <form method="POST" action="save.html">
                                        <div class="form-group">
                                            
                                            <div class="form-group">
                                                <label for="username">Username:</label>
                                                
                                                <input required="true" type="text" class="form-control" id="username" name="username"value="${account.username}"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="password">Password:</label>
                                                <input required="true"  type="text" class="form-control" id="password" name="password" value="${account.password}"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="acVerify">Ac Verify:</label>
                                                <input required="true"  type="text" class="form-control" id="acVerify" name="acVerify" value="${account.acVerify}"/>
                                            </div>
                                            <button class="btn btn-success">Add Account</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>