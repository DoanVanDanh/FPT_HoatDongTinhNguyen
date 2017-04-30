<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="" content="content" charset="utf-8">
  	<title></title>
   <link rel="stylesheet" href="assets/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/css/bootstrap-theme.min.css">
    
  <!-- add thư viện jquery để js bootstrap chạy được -->
  <script src="assets/js/jquery-3.2.0.min.js" ></script>
  <script src="assets/js/bootstrap.min.js" ></script>
  <link rel="stylesheet" href="css/ThongKe.css">
</head>
<body>


<h1>Thong Ke</h1>
<a href="DanhSachHoatDong" class="btn btn-lg">Quay về danh Sách hoạt động</a>

<div class="table-responsive">
  <table class="table table-hover table-bordered">
    <thead >
      <th class="active">MaTV</th>
      <th class="active">HoTen</span></th>
      <th class="active">Diem Danh Gia Trung Binh</th>
    </thead>
    <tbody>
    <c:forEach var="truongDoan" items="${truongDoan}">
      <tr>
       	<td>${truongDoan.maTV }</td>
       	<td>${truongDoan.hoTen }</td>
       	<td><i class="glyphicon glyphicon-heart" style="color: red"></i>${truongDoan.diemDanhGiaTrungBinh }</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>