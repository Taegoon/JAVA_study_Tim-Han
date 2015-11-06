package Controler;

import ita.PagingUtil;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Entity.HairShopEntity;
import Model.HairShopDAO;

@WebServlet("/AllHairShopMain")
public class AllHairShopMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AllHairShopMain() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ArrayList<HairShopEntity> list = new ArrayList<HairShopEntity>();
//		String pageNo = request.getParameter("pageNo");
//		PagingUtil paging = new PagingUtil(list.size(),1,pageNo,"AllHairShopMain?pageNo=$");
//		
//		request.setAttribute("list", list);
//		request.setAttribute("paging", paging);
		
		request.setAttribute("hairShops",new HairShopDAO().getAllHairShop());
		RequestDispatcher view = request.getRequestDispatcher("AllHairShopMain.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
