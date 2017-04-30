package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.HoatDong;
import model.dao.HoatDongDAO;

/**
 * Servlet implementation class ThemHoatDong
 */
@WebServlet("/ThemHoatDong")
public class ThemHoatDong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemHoatDong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("actionForm");
		System.out.println(action);
		
		if(action!=null){
			String maHD = request.getParameter("maHD");
			String tenHD = request.getParameter("tenHD");
			String moTaHD = request.getParameter("moTaHD");
			String ngayGioBD = request.getParameter("batDau");
			String ngayGioKT = request.getParameter("ketThuc");
			int soLuongToiThieu = Integer.valueOf(request.getParameter("soLuongToiThieu"));
			int soLuongToiDa = Integer.valueOf(request.getParameter("soLuongToiDa"));
			String thoiHan = request.getParameter("thoiHan");
			String maTV = request.getParameter("maTV");
			System.out.println(maTV);
			
			HoatDong hd = new HoatDong(maHD, tenHD, moTaHD, ngayGioBD, ngayGioKT, soLuongToiThieu, soLuongToiDa, thoiHan, "Đang mời đăng ký", maTV, "");
			if(HoatDongDAO.insertHoatDong(hd)){
				System.out.println("da them thanh cong");
				response.sendRedirect("DanhSachHoatDong");
			}
			else{
				System.out.println("them moi k thanh cong");
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("ThemHoatDong.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
