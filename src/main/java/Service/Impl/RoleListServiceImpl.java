package Service.Impl;

import POJO.Role;
import Service.RoleListService;
import Service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleListServiceImpl implements RoleListService {
    @Autowired
    private RoleService roleService = null;
    Logger log = Logger.getLogger(RoleListServiceImpl.class);
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public int insertRoleList(List<Role> roles) {
        int count = 0;
        System.out.println("卧槽？");
        for (Role role : roles)
        {
            try{
                count += roleService.insertRole(role);
            }catch (Exception e)
            {
                log.info(e);
            }
        }
        return count;
    }
}
