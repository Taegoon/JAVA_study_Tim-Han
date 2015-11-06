package Controler;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.InformationDAO;

@WebServlet("/MemberBBSAddForm")
public class MemberBBSAddForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberBBSAddForm() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("hairAllBBS",new InformationDAO().getAllInformation());
		
		request.setAttribute("bbs", "MemberBBS.jsp");
		RequestDispatcher view = request.getRequestDispatcher("HairShopMain.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
