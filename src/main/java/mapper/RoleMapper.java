package mapper;

import POJO.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    public Role findRole(Long id);
}
