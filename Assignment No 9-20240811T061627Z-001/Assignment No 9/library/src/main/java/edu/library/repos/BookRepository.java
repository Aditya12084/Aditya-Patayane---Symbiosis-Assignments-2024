package edu.library.repos;

import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import edu.library.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{


}