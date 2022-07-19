package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Order;
import lazizbek.uz.pcmarket_uz.entity.Product;
import lazizbek.uz.pcmarket_uz.entity.Users;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Order.class)
public interface OrderProjection {
    Integer getId();
    Users getUser();
    List<Product> getProducts();
}
