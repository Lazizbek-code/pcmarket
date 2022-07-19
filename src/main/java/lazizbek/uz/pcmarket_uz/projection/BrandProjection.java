package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Brand;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Brand.class)
public interface BrandProjection {
    Integer getId();
    String getName();
    Boolean getActive();
}
