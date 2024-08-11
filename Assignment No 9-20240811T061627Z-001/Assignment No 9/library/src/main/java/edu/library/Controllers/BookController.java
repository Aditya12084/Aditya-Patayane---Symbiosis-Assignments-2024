package edu.library.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.library.entities.Book;
import edu.library.repos.BookRepository;

@CrossOrigin("*")
@RestController
public class BookController {

	@Autowired
	private BookRepository repo;
	
	@GetMapping("/allBooks")
	public List<Book> getBook()
	{
		return repo.findAll();
	}
	
	@PostMapping("/saveBook")
	public String addBook(@RequestBody Book book)
	{
		String res;
		
		try {
			repo.save(book);
			res = "Success";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			res = e.getMessage();
		}
		
		return res;
		
	}
	
	@DeleteMapping("/deleteBook")
	public String deleteBook(@RequestBody Book book)
	{
        String res;
		
        try {
        	repo.deleteById(book.getId());
			res = "Success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			res = e.getMessage();
		}
		
		return res;
	}
	
	@PatchMapping("/updateBook")
	public String updateBook(@RequestBody Book book) {
		String res;
		
		try {
			
        	repo.save(book);

        	res="Success";
        	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			res = e.getMessage();
		}
		
		return res;
	}
	
	
	
}