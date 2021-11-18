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
            <div class="list-group">
               <a href="../index.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>  Dashboard</a>
                <a href="../quanly/listAccount.html" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Account Management</a>
                 <a href="../quanly/listTrainer.html" class="list-group-item active main-color-bg">
                    <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Trainer Management
                </a>
                <a href="../quanly/listTrainee.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Trainee Management</a>
                <a href="../quanly/listCourse.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Course Management</a>
                <a href="../quanly/listTopic.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Topic Management</a>
                 <a href="../quanly/listCategory.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Category Management</a>
            </div>
            <div class="col-sm-10" style="background-color:lavenderblush;">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <br>
                        <div class="container">
                            <div class="panel panel-primary">
                                <div class="panel-body">
                                    <form method="POST" action="saveTrainer.html">
                                            <div class="form-group">
                                                <label for="trainerName">Trainer name:</label>
                                                <input  value="${trainer.trainerID}" type="number" class="form-control" id="id" name="id"hidden="true"/>
                                                <input required="true" value="${trainer.trainerName}" type="text" class="form-control" id="trainerName" name="trainerName" />
                                            </div>
                                            <div class="form-group">
                                                <label for="education">Education:</label>
                                                <input required="true" value="${trainer.education}" type="text" class="form-control" id="education" name="education" />
                                            </div>
                                            <div class="form-group">
                                                <label for="typework">Type Work:</label>
                                                <input required="true" value="${trainer.typework}" type="text" class="form-control" id="typework" name="typework"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="workingplace">Working Place:</label>
                                                <input required="true" value="${trainer.workingplace}" type="text" class="form-control" id="workingplace" name="workingplace"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="telephone">Telephone:</label>
                                                <input required="true" value="${trainer.telephone}" type="text" class="form-control" id="telephone" name="telephone" />
                                            </div>
                                            <div class="form-group">
                                                <label for="email">Email:</label>
                                                <input required="true" value="${trainer.email}" type="text" class="form-control" id="email" name="email"/>
                                            </div>
                                            <button class="btn btn-success">Add Trainer</button>
                                        
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