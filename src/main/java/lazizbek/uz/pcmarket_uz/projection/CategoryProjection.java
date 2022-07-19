package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryProjection {
    Integer getId();
    String getName();
    Boolean getActive();
}
