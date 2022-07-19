package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Characteristic;
import lazizbek.uz.pcmarket_uz.projection.CharacteristicProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "characteristic", collectionResourceRel = "list",excerptProjection = CharacteristicProjection.class)
public interface CharacteristicRepository extends JpaRepository<Characteristic, Integer> {
}
