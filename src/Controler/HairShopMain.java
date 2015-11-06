package Controler;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.*;

@WebServlet("/HairShopMain")
public class HairShopMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HairShopMain() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		
		request.setAttribute("hairshop", new HairShopDAO().getHairShop(1));
		request.setAttribute("designers",new DesignerDao().getMemberList());
			
		request.setAttribute("bbs", "MemberBBS.jsp");
		RequestDispatcher view = request.getRequestDispatcher("HairShopMain.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
