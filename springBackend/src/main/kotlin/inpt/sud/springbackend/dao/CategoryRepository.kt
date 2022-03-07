package inpt.sud.springbackend.dao

import inpt.sud.springbackend.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface CategoryRepository : JpaRepository<Category, Long> {

}