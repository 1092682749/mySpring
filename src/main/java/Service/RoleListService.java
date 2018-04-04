package Service;

import POJO.Role;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoleListService {
    public int insertRoleList(List<Role> roles);
}
