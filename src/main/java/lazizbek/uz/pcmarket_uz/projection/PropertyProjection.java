package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Init;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = PropertyProjection.class)
public interface PropertyProjection {
    Integer getId();
    String getValue();
    Init getInit();
    Boolean getActive();
}
