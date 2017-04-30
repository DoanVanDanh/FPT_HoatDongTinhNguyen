package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.ThanhVien;
import model.dao.ThanhVienDAO;

@WebServlet("/ThongKe")
public class ThongKe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThongKe() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<ThanhVien> thanhViens = ThanhVienDAO.getDanhGiaTruongDoan();
		request.setAttribute("truongDoan", thanhViens);
		
		RequestDispatcher rd = request.getRequestDispatcher("ThongKe.jsp");
		rd.forward(request, response);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
