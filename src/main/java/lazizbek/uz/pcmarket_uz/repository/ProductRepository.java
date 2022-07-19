package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Product;
import lazizbek.uz.pcmarket_uz.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "list",excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
