package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.HoatDong;
import model.dao.HoatDongDAO;

/**
 * Servlet implementation class HoatDong
 */
@WebServlet("/DanhSachHoatDong")
public class DanhSachHoatDong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachHoatDong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		ArrayList<HoatDong> hoatDongs = HoatDongDAO.getListHoatDong();
		request.setAttribute("listHoatDong", hoatDongs);
		
		String acion = request.getParameter("action");
		if(acion!=null){
			String userSelection = request.getParameter("delete");
			if(userSelection.equals("delete_yes")){
				System.out.println("xoa");
			}
			else
				System.out.println("k xoa");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("DanhSachHoatDong.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
