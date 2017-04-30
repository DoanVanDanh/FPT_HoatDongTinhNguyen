package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.HoatDong;
import model.dao.HoatDongDAO;

@WebServlet("/XoaHoatDong")
public class XoaHoatDong extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public XoaHoatDong() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maHDXoa = request.getParameter("maHDXoa");
		if(maHDXoa!=null){
			//Không xóa các hoạt động ở trạng thái là "Đã kết thúc
			HoatDong hoatDong = HoatDongDAO.getHoatDong(maHDXoa);
			String trangThai = hoatDong.getTrangThai();
			if(HoatDongDAO.deleteHoatDong(maHDXoa) && trangThai.equals("Đã kết thúc")){
				RequestDispatcher rd = request.getRequestDispatcher("XoaHoatDong.jsp");
				rd.forward(request, response);
			}
			else{
				response.setCharacterEncoding("utf-8");;
				PrintWriter pw = response.getWriter();
				pw.println("ko xóa được");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
