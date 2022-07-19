package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Brand;
import lazizbek.uz.pcmarket_uz.entity.Category;
import lazizbek.uz.pcmarket_uz.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductProjection {
    Integer getId();
    Category getCategory();
    Brand getBrand();
    Boolean getActive();
}
