package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Property;
import lazizbek.uz.pcmarket_uz.projection.PropertyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "property", collectionResourceRel = "list",excerptProjection = PropertyProjection.class)
public interface PropertyRepository extends JpaRepository<Property, Integer> {
}
