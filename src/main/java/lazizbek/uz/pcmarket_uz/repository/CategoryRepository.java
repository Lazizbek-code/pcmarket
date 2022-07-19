package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Category;
import lazizbek.uz.pcmarket_uz.projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list",excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
