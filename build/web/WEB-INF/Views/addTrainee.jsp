<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Trainee Management</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
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
                    <a href="../index.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>  Dashboard</a>
                    <a href="../quanly/listAccount.html" class="list-group-item"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Account Management</a>
                    <a href="../quanly/listTrainer.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Trainer Management</a>
                    <a href="../quanly/listTrainee.html" class="list-group-item active main-color-bg">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Trainee Management
                    </a>
                    <a href="../quanly/listCourse.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Course Management</a>
                    <a href="../quanly/listTopic.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Topic Management</a>
                    <a href="../quanly/listCategory.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Category Management</a>
                </div>
            </div>
            <div class="col-sm-10" style="background-color:lavenderblush;">
                <div class="panel panel-default">
                    <div class="panel-body"> 
                        <br>
                        <div class="container">
                            <div class="panel panel-primary">
                                <div class="panel-body">
                                    <form method="Post" action="saveTrainee.html">
                                            <div class="form-group">
                                                <label for="trainerName">Trainee name:</label>
                                                <input  value="${trainee.traineeID}" type="number" class="form-control" id="id" name="id"hidden="true"/>
                                                <input required="true" value="${trainee.traineeName}" type="text" class="form-control" id="traineeName" name="traineeName" />
                                            </div>
                                            <div class="form-group">
                                                <label for="dob">Date Of Birth:</label>
                                                <input required="true" value="${trainee.dob}" type="text" class="form-control" id="dob" name="dob" />
                                            </div>
                                            <div class="form-group">
                                                <label for="education">Education:</label>
                                                <input required="true" value="${trainee.education}" type="text" class="form-control" id="education" name="education"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="programingLanguage">Programing Language:</label>
                                                <input required="true" value="${trainee.programingLanguage}" type="text" class="form-control" id="programingLanguage" name="programingLanguage"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="toeicScore">Toeic Score:</label>
                                                <input required="true" value="${trainee.toeicScore}" type="text" class="form-control" id="toeicScore" name="toeicScore" />
                                            </div>
                                            <div class="form-group">
                                                <label for="expericenDetail">Expericen Detail:</label>
                                                <input required="true" value="${trainee.expericenDetail}" type="text" class="form-control" id="expericenDetail" name="expericenDetail"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="department">Department:</label>
                                                <input required="true" value="${trainee.department}" type="text" class="form-control" id="department" name="department"/>
                                            </div>
                                            <div class="form-group">
                                                <label for="location">location:</label>
                                                <input required="true" value="${trainee.location}" type="text" class="form-control" id="location" name="location"/>
                                            </div>
                                            
                                            <button class="btn btn-success">Add Trainee</button>
                                        
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
