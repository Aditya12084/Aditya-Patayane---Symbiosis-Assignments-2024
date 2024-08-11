package ecom.products.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ecom.products.dbase.DatabaseConnection;
import  ecom.products.model.Product;


public class ProductsDao {
	
	public static int saveProduct(Product prod) 
			throws ClassNotFoundException, SQLException
	{
		int result = 0;
		
		String insertStatement = 
		"INSERT INTO products(title,image,category,price,ratings,description) VALUES(?, ?, ?, ?, ?, ?)";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = con.prepareStatement(insertStatement);
			
			pst.setString(1, prod.getTitle());
			pst.setString(2, prod.getImage());
			pst.setString(3, prod.getCategory());
			pst.setInt(4, prod.getPrice());
			pst.setFloat(5, prod.getRatings());
			pst.setString(6,prod.getDescription());
			
			result = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static int updateProduct(Product prod) 
			throws ClassNotFoundException, SQLException
	{
		int result = 0;
		
		String updateStatement = 
		"UPDATE products set title=?,image=?,category=?,price=?,ratings=?,description=? where id=?";
		Connection con = DatabaseConnection.initializeDatabase();
		try(con){
			PreparedStatement pst = 
					con.prepareStatement(updateStatement);
			pst.setString(1, prod.getTitle());
			pst.setString(2, prod.getImage());
			pst.setString(3, prod.getCategory());
			pst.setInt(4, prod.getPrice());
			pst.setFloat(5, prod.getRatings());
			pst.setString(6,prod.getDescription());
			pst.setInt(7, prod.getId());
			
			
			result = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
public static int deleteProdById(int id) throws ClassNotFoundException, SQLException {
    
	   int result = 0;
		
		String delStatement="DELETE from products where id="+id;
		
		
		Connection con=DatabaseConnection.initializeDatabase();
		
		try(con){
			PreparedStatement pst = 
					con.prepareStatement(delStatement);
	
			result = pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
	}


public static List<Product> getProducts() throws ClassNotFoundException, SQLException {
	
	List<Product> prods=new ArrayList<Product>();
	
	String getStatement="SELECT * FROM products";
	
	Connection con=DatabaseConnection.initializeDatabase();
	
	try (con) {
		PreparedStatement pst=con.prepareStatement(getStatement);
		
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			int id=rs.getInt("id");
			String title=rs.getString("title");
			String image=rs.getString("image");
			String category=rs.getString("category");
			int price=rs.getInt("price");
			Float ratings=rs.getFloat("ratings");
			String desc=rs.getString("description");
			prods.add(new Product(id,title,image,category,price,ratings,desc));
		}
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	return prods;
}
}
	

