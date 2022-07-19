package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Brand;
import lazizbek.uz.pcmarket_uz.projection.BrandProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "brand", collectionResourceRel = "list",excerptProjection = BrandProjection.class)
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
