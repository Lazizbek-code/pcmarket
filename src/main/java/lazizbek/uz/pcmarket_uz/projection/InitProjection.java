package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Init;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Init.class)
public interface InitProjection {
    Integer getId();
    String getName();
    String getShortName();
    Boolean getActive();
}
