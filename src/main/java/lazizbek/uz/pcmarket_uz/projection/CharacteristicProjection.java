package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Characteristic;
import lazizbek.uz.pcmarket_uz.entity.Product;
import lazizbek.uz.pcmarket_uz.entity.Property;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Characteristic.class)
public interface CharacteristicProjection {
    Integer getId();
    String getName();
    Boolean getActive();
    Product getProduct();
    Property getProperty();
}
