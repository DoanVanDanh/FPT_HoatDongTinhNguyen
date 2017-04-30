package controller;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.HoatDong;
import model.dao.HoatDongDAO;

/**
 * Servlet implementation class CapNhatHoatDong
 */
@WebServlet("/CapNhatHoatDong")
public class CapNhatHoatDong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CapNhatHoatDong() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 response.setContentType("text/html; charset=UTF-8");

		
		// lấy mã hoạt động từ bên (danh sách hoạt động) truyền qua
		String maHDCapNhat = request.getParameter("maHDCapNhat");
		System.out.println(maHDCapNhat);
		if(maHDCapNhat!=null){
			//gửi qua trang Cap nhật .jsp
			HoatDong hoatDong = HoatDongDAO.getHoatDong(maHDCapNhat);
			request.setAttribute("hd", hoatDong);
			
			RequestDispatcher rd = request.getRequestDispatcher("CapNhatHoatDong.jsp");
//			RequestDispatcher rd = request.getRequestDispatcher("http://google.com");
			rd.forward(request, response);
		}
		
		
		//cập nhật .jsp-->truyền qua
		String a = request.getParameter("maHD");
		if(a!=null){
			
			//nếu rỗng ==> từ bên cập nhật truyền qua (không còn qua bên danh sach nữa nên maHD = null);
			
			String b = request.getParameter("tenHD");
			String c = request.getParameter("moTaHD");
			String d = request.getParameter("batDau");
			String e = request.getParameter("ketThuc");
			int f = Integer.valueOf(request.getParameter("soLuongToiThieu"));
			int g = Integer.valueOf(request.getParameter("soLuongToiDa"));
			String h = request.getParameter("thoiHan");
			String i = request.getParameter("trangThai");
			String k = request.getParameter("maTV");
			HoatDong hd = new HoatDong(a, b, c, d, e, f, g, h, i, k, "");
			
			
			if(HoatDongDAO.updateHoatDong(hd)){
				System.out.println("đã cập nhật thành công");
				response.sendRedirect("DanhSachHoatDong");
			}
			else
				System.out.println(" k cập nhật được");
		}
		System.out.println("aaa");
//		response.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		pw.write("<h2>aaaaaaaaaaaaaaaáaaaaaaaaaaaaaaa</h2>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
