package mapper;

import POJO.Role;
import org.springframework.stereotype.Repository;

@Repository("roleMapper")
public interface RoleMapper {
    public Role findRole(Long id);
    public int insertRole(Role role);
}
