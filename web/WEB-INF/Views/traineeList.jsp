<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Quản lý nhân sự</title>
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
                 <a href="../quanly/listTrainer.html" class="list-group-item active main-color-bg">
                    <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Trainer Management
                </a>
                
                <a href="../quanly/listTrainee.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Trainee Management</a>
                <a href="../quanly/listSource.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Source Management</a>
                <a href="../quanly/listTopic.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Topic Management</a>
                 <a href="../quanly/listCategory.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Category Management</a>
            </div>
      </div>
      <div class="col-sm-10" style="background-color:lavenderblush;">
          <div class="panel panel-default">
            <div class="panel-heading main-color-bg">
              <h3 class="panel-title">Trainer</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-12">
                  <input class="form-control" type="text" placeholder="Filter Trainer">
                </div>
              </div>
              <br>
             <table class=" table table-dark table-striped">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Họ Và Tên</th>
                                <th>Tổ chức giáo dục</th>
                                <th>Ngôn ngữ </th>
                                <th>Điểm Topic</th> 
                                <th>Kinh nghiệm thực tế</th>
                                <th>Lớp học</th>
                                <th>Chức vụ</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead> 
                        <tbody>
                            <c:forEach items="${TraineeList}" var="item" varStatus="loop">
                                <tr>
                                    <td>${item.traineeID}</td>
                                    <td>${item.traineeName}</td>
                                    <td>${item.dob}</td>
                                    <td>${item.education}</td>
                                    <td>${item.programingLanguage}</td>
                                    <td>${item.toeicScore}</td>
                                    <td>${item.expericenDetail}</td>
                                    <td>${item.department}</td>
                                     <td>${item.location}</td>
                                    <td>
                                        <a href="editTrainee.html"> 
                                            <button class="btn btn-success">Edit</button>
                                        </a>
                                    </td>
                                    <td>
                                        <a href="deleteTrainee.html"> 
                                            <button class="btn btn-success">Detele</button>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <a href="addTrainee.html"> 
                        <button class="btn btn-success">Add Trainee</button>
                    </a>
            </div>
      </div>
  </div>
</div>
           
        
</body>
</html>
