package inpt.sud.springbackend.dao


import inpt.sud.springbackend.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ProductRepository : JpaRepository<Product, Long>{

}