package ecom.products.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecom.products.dao.ProductsDao;
import ecom.products.model.Product;




@WebServlet("/")
public class ProductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private ProductsDao productsDao = new ProductsDao();
	
    
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String servUrl=request.getServletPath();
		
	
		
		switch (servUrl) {
		case "/prods": {
			try {
				List<Product> prodList=ProductsDao.getProducts();
				
				request.setAttribute("prodList", prodList);
					
				RequestDispatcher dispatcher=request.getRequestDispatcher("prod-list.jsp");
				
				dispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		  break;
		}
		case "/delete": {
			try {
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				int r=0;
				
				r=ProductsDao.deleteProdById(id);
				if(r>0) {
					response.sendRedirect("done.jsp");
				}
				else {
					response.sendRedirect("error.jsp");
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		  break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + servUrl);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, 
			IOException {
		
		int id=0;
		
		if(request.getParameter("id")!=null) {
			id=Integer.parseInt(request.getParameter("id"));
		}
	
		String title = request.getParameter("title");
		String image = request.getParameter("image");
		String category = request.getParameter("category");
		int price = Integer.parseInt(request.getParameter("price"));
		float ratings = Float.parseFloat(request.getParameter("ratings"));
		String desc=request.getParameter("desc");
			
		Product product = new Product();
	    
		
		product.setId(id);
		product.setTitle(title);
		product.setImage(image);
		product.setCategory(category);
		product.setPrice(price);
		product.setRatings(ratings);
		product.setDescription(desc);	
		
		
		String userReq=request.getServletPath();
		
		
		System.out.print(userReq);
		
		switch (userReq) {
		
		
		case "/addProduct": 

			try {
				int x = 0;
				
				
				x= productsDao.saveProduct(product);
				
				System.out.print(x);
				
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else
				{
					response.sendRedirect("error.jsp");
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//the required changes must be in do post method & java beans are nothing but model classes
			
			
			break;
		
		
		
		case "/update":
			
			
			try {
				int x = 0;
				x = productsDao.updateProduct(product);
				if(x>0)
				{
					response.sendRedirect("done.jsp");
				}
				else
				{
					response.sendRedirect("error.jsp");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
	

		default:
			throw new IllegalArgumentException("Unexpected value: " + userReq);
		}
		
	}

}
