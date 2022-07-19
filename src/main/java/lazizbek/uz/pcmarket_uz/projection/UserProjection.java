package lazizbek.uz.pcmarket_uz.projection;

import lazizbek.uz.pcmarket_uz.entity.Users;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Users.class)
public interface UserProjection {
    Integer getId();
    String getFullName();
    String getEmail();
    String getPhoneNumber();
    Boolean getActive();
}
