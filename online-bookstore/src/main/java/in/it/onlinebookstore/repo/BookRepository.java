package in.it.onlinebookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.it.onlinebookstore.model.Book;
@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Integer>{

}
