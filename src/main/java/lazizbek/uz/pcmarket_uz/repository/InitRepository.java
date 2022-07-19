package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Init;
import lazizbek.uz.pcmarket_uz.projection.InitProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "init", collectionResourceRel = "list",excerptProjection = InitProjection.class)
public interface InitRepository extends JpaRepository<Init, Integer> {
}
