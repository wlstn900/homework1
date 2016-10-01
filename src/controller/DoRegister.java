package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")



public class DoRegister extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		
		Customer cus=new Customer(id, password, name, gender, email);
		CustomerService service = (CustomerService)CustomerService.getInstance();
		//request.setAttribute("customer", cus);
		
		String page=null;
		
		/*if(cus.getId()==service.findCustomer(cus.getId()).getId()){
			page="view/registerFail.jsp";
			request.setAttribute("id", id);
			
		}*/
		//else{
			service.addCustomer(cus);
			page="/view/registerSuccess.jsp";
			request.setAttribute("id", id);
			request.setAttribute("password", password);
			request.setAttribute("name", name);
			request.setAttribute("gender", gender);
			request.setAttribute("email", email);
		//}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
