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
	
	<script src="js/LietKeDanhSach.js"></script>
</head>
<body>
<a href="ThemHoatDong" class="btn btn-lg">Thêm mới hoạt động</a>
<a href="ThongKe" class="btn btn-lg">Thong Ke Diem Trung Binh Cua Truong Doan</a>

<div class="container">
   <div class="row">
      <div class="col-md-12">
         <h4>Danh Sach Hoat Dong</h4>
         <div class="table-responsive">
            <table id="mytable" class="table table-hover table-bordered">
               <thead class="warning">
                  <th><input type="checkbox" id="checkall" /></th>
                  <th class="active">MaHD</th>
                  <th class="active">TenHD</th>
                  <th class="active">MoTaHD</th>
                  <th class="active">NgayGioBD</th>
                  <th class="active">NgayGioKT</th>
                  <th class="active">SLToiThieuYC</th>
                  <th class="active">SLToiDaYC</th>
                  <th class="active">ThoiHanDK</th>
                  <th class="active">TrangThai</th>
                  <th class="active">MaTV</th>
                  <th class="active">LyDoHuyHD</th>
                  <th class="active"> Update</th>
                  <th class="active"> Delete</th>
                  
               </thead>
               <tbody>
               <c:forEach var="hd" items="${listHoatDong}">
                  <tr>
                     <td><input type="checkbox" class="checkthis" /></td>
                     <td>${hd.maHD}</td>
                     <td>${hd.tenHD}</td>
                     <td>${hd.moTaHD }</td>
                     <td>${hd.ngayGioBD }</td>
                     <td>${hd.ngayGioKT }</td>
                     <td>${hd.soLuongToiThieuYC }</td>
                     <td>${hd.soLuongToiDaYC }</td>
                     <td>${hd.thoiHanDK }</td>
                     <td>${hd.trangThai }</td>
                     <td>${hd.maTV }</td>
                     <td>${hd.lyDoHuyHD }</td>
                     
                     <td>
                     	<form action="CapNhatHoatDong" method="post">
                     		<input type="hidden" name="maHDCapNhat" value="${hd.maHD}">
                        	<p data-placement="top" data-toggle="tooltip" title="Edit"><a href="CapNhatHoatDong"></a><button class="btn btn-primary btn-xs"  ><span class="glyphicon glyphicon-pencil"></span></button></p>
                       	</form> 
                        
                     </td>
                     <td>
                     	<form action="XoaHoatDong">
                     		<input type="hidden" name="maHDXoa" value="${hd.maHD }">
                        	<p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p>
						</form>                     
                     </td>
                  </tr>
                  </c:forEach>
                  
               </tbody>
            </table>
            <div class="clearfix"></div>
            
            
<!----------------             phaan trang ------------------------>
            <ul class="pagination pull-right">
               <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
               <li class="active"><a href="#">1</a></li>
               <li><a href="#">2</a></li>
               <li><a href="#">3</a></li>
               <li><a href="#">4</a></li>
               <li><a href="#">5</a></li>
               <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
            </ul>
<!---------------             end phaan trang  ------------>
         </div>
      </div>
   </div>
</div>
<!-- -----------      end liet ke danh sach            ------------------------ -->







<!-- <!-- ----------------- phan edit --------------------------------- --> -->
<!-- <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true"> -->
<!--    <div class="modal-dialog"> -->
<!--       <div class="modal-content"> -->
<!--          <div class="modal-header"> -->
<!--             <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button> -->
<!--             <h4 class="modal-title custom_align" id="Heading">Edit Your Detail</h4> -->
<!--          </div> -->
<!--          <div class="modal-body"> -->
<!--             <div class="form-group"> -->
<!--                <input class="form-control " type="text" placeholder="Mohsin"> -->
<!--             </div> -->
<!--             <div class="form-group"> -->
<!--                <input class="form-control " type="text" placeholder="Irshad"> -->
<!--             </div> -->
<!--             <div class="form-group"> -->
<!--                <textarea rows="2" class="form-control" placeholder="CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan"></textarea> -->
<!--             </div> -->
<!--          </div> -->
<!--          <div class="modal-footer "> -->
<!--             <button type="button" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> Update</button> -->
<!--          </div> -->
<!--       </div> -->
<!--       /.modal-content  -->
<!--    </div> -->
<!--    <!-- /.modal-dialog -->  -->
<!-- </div> -->
<!-- <!-- --------------------  ending phan edit         ---------------- --> -->


<!-- ----------------------phan delete--------------------------------- -->
<!-- <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true"> -->
<!--    <div class="modal-dialog"> -->
<!--       <div class="modal-content"> -->
<!--          <div class="modal-header"> -->
<!--             <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button> -->
<!--             <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4> -->
<!--          </div> -->
<!--          <div class="modal-body"> -->
<!--             <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are you sure you want to delete this Record?</div> -->
<!--          </div> -->
<!--          <div class="modal-footer "> -->
<!-- <!--chinh sua tai day  --> -->
<!--          	<form action="HoatDongServlet"> -->
<!--          		<input type="hidden" name="action" value="delete"/> -->
<!--          		<button name="delete" value="delete_yes" type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok-sign"></span> Yes</button> -->
<!--            	    <button name="delete" value="delete_no"	data-dismiss="modal" type="button" class="btn btn-default"><span class="glyphicon glyphicon-remove"></span> No</button> -->
<!--          	</form> -->
<!-- <!-- end chinh sua -->             -->
<!--          </div> -->
<!--       </div> -->
<!--       /.modal-content  -->
<!--    </div> -->
<!--    <!-- /.modal-dialog -->  -->
<!-- </div> -->

<!-- -------------------end phan delete--------------------------- -->


</body>
</html>