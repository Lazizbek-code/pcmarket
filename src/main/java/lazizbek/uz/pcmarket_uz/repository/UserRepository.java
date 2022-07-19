package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Users;
import lazizbek.uz.pcmarket_uz.projection.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list",excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<Users, Integer> {
}
