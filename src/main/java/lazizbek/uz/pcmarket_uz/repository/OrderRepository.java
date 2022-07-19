package lazizbek.uz.pcmarket_uz.repository;

import lazizbek.uz.pcmarket_uz.entity.Order;
import lazizbek.uz.pcmarket_uz.projection.OrderProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order", collectionResourceRel = "list",excerptProjection = OrderProjection.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
