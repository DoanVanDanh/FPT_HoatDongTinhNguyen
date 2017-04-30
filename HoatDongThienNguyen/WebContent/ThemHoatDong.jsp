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
	
	
	<link rel="stylesheet" href="css/them.css">
</head>
<body>
<a href="DanhSachHoatDong" class="btn btn-lg">Quay về danh Sách hoạt động</a>


	<div class="container">
    <div class="row vertical-offset-100">
    	<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title">Thêm hoạt động</h3>
			 	</div>
			  	<div class="panel-body">
			    	<form role="form" accept-charset="utf-8" method="post" action="ThemHoatDong">
                    <fieldset>
			    	  	<div class="form-group">
			    	  		<label  class="control-label">Mã HĐ</label>		
			    		    <input class="form-control" type="text"  name="maHD" placeholder="Mã HĐ">
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Tên HĐ</label>				
			    		    <input class="form-control" type="text"  name="tenHD" placeholder="Tên HĐ">
			    		</div>
			    		
			    		<div class="form-group">	
			    			<label  class="control-label">Mô Tả HĐ</label>	
			    		    <input class="form-control" type="text"  name="moTaHD" placeholder="Mô Tả HĐ">
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Thời gian bắt đầu HĐ</label>	
			    		    <input class="form-control" type="datetime-local"  name="batDau" ><span>chọn ngày giờ bắt đầu HĐ</span>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Thời gian kết thúc HĐ</label>
			    		    <input class="form-control" type="datetime-local" name="ketThuc" > <span>chọn  kết thúc HĐ</span>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Số lượng tối thiểu</label>	
			    		    <input class="form-control" type="number" name="soLuongToiThieu" placeholder="số lượng tối thiểu"/>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Số lượng tối đa</label>	
			    		    <input class="form-control" type="number" name="soLuongToiDa" placeholder="số lượng tối đa"/>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Thời hạn đăng ký</label>
			    		    <input class="form-control" type="datetime-local" name="thoiHan" > <span>chọn  ngày giờ</span>
			    		</div>
			    		
			    		
			    		
			    		<div class="form-group">	
			    			<label  class="control-label">Mã TV</label>	
			    		    <input class="form-control" type="text"  name="maTV" placeholder="Mô Tả HĐ">
			    		</div>
<!-- 			    		<div class="checkbox"> -->
<!-- 			    	    	<label> -->
<!-- 			    	    		<input name="remember" type="checkbox" value="Remember Me"> Remember Me -->
<!-- 			    	    	</label> -->
<!-- 			    	    </div> -->
						<input type="hidden" name="actionForm" value ="themHanhDong">
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="thêm mới">
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
	
	
	
	<h1>Mẫu thứ 2_ đơn giản</h1>
	<form class="form-horizontal">
    <div class="form-group">
        <label for="inputEmail" class="control-label col-xs-2">First Name</label>
        <div class="col-xs-5">
            <input type="text" class="form-control" id="inputEmail" placeholder="Email">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword" class="control-label col-xs-2">Last Name</label>
        <div class="col-xs-5">
            <input type="text" class="form-control" id="inputPassword" placeholder="Last Name">
        </div>
    </div>
      <div class="form-group">
        <label for="inputEmail" class="control-label col-xs-2">Username</label>
        <div class="col-xs-5">
            <input type="email" class="form-control" id="inputEmail" placeholder="Email">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword" class="control-label col-xs-2">Password</label>
        <div class="col-xs-5">
            <input type="password" class="form-control" id="inputPassword" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword" class="control-label col-xs-2">Confirm Password</label>
        <div class="col-xs-5">
            <input type="password" class="form-control" id="inputPassword" placeholder="Password">
        </div>
    </div>
    
    <div class="form-group">
        <div class="col-xs-offset-2 col-xs-10">
            <button type="submit" class="btn btn-primary">Add Admin</button>
        </div>
    </div>
</form>
	
</body>
</html>