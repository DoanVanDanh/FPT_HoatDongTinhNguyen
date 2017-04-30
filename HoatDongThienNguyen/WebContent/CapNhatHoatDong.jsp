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

	
<!-- ----------------- phan edit --------------------------------- -->
	<div class="container">
    <div class="row vertical-offset-100">
    	<div class="col-md-4 col-md-offset-4">
    		<div class="panel panel-default">
			  	<div class="panel-heading">
			    	<h3 class="panel-title">Cập nhật hoạt động</h3>
			 	</div>
			  	<div class="panel-body">
			    	<form role="form" accept-charset="utf-8" method="post" action="CapNhatHoatDong">
                    <fieldset>
			    	  	<div class="form-group">
			    	  		<label  class="control-label">Mã HĐ</label>		
			    		    <input class="form-control" type="text"  name="maHD" value=${hd.maHD}>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Tên HĐ</label>				
			    		    <input class="form-control" type="text"  name="tenHD" value=${hd.tenHD}>
			    		</div>
			    		
			    		<div class="form-group">	
			    			<label  class="control-label">Mô Tả HĐ</label>	
			    		    <input class="form-control" type="text"  name="moTaHD" value=${hd.moTaHD}>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Thời gian bắt đầu HĐ</label>	
			    		    <input class="form-control" type="datetime-local"  name="batDau" value=${hd.ngayGioBD}><span>chọn ngày giờ bắt đầu HĐ</span>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Thời gian kết thúc HĐ</label>
			    		    <input class="form-control" type="datetime-local"  name="ketThuc" value=${hd.ngayGioKT}> <span>chọn  kết thúc HĐ</span>
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Số lượng tối thiểu</label>	
			    		    <input class="form-control" type="number" name="soLuongToiThieu" value=${hd.soLuongToiThieuYC} />
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Số lượng tối đa</label>	
			    		    <input class="form-control" type="number" name="soLuongToiDa" value=${hd.soLuongToiDaYC} />
			    		</div>
			    		
			    		<div class="form-group">
			    			<label  class="control-label">Thời hạn đăng ký</label>
			    		    <input class="form-control" type="datetime-local" name="thoiHan" value=${hd.thoiHanDK}> <span>chọn  ngày giờ</span>
			    		</div>
			    		
			    		<div class="form-group">	
			    			<label  class="control-label">Trạng thái</label>
			    			<input class="form-control" type="text"   value=${hd.trangThai}>
			    			<select class="form-control" name="trangThai">
								  <option value="Đang mời đăng ký">Đang mời đăng ký</option>
								  <option value="Đã hết hạn đăng ký">Đã hết hạn đăng ký</option>
								  <option value="Trưởng đoàn tự hủy">Trưởng đoàn tự hủy</option>
								  <option value="Đã kết thúc">Đã kết thúc</option>
							</select>	
			    		    
			    		</div>
			    		
			    		<div class="form-group">	
			    			<label  class="control-label">Mã TV</label>	
			    		    <input class="form-control" type="text"  name="maTV" value=${hd.maTV}>
			    		</div>
<!-- 			    	    		<input name="remember" type="checkbox" value="Remember Me"> Remember Me -->
						<input type="hidden" name="actionForm" value ="capNhatHanhDong">
			    		<input class="btn btn-lg btn-success btn-block" type="submit" value="cập nhật">
			    	</fieldset>
			      	</form>
			    </div>
			</div>
		</div>
	</div>
<!-- --------------------  ending phan edit         ---------------- -->
	

</body>
</html>