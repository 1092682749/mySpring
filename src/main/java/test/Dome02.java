package test;

import POJO.Role;
import Service.Impl.RoleListServiceImpl;
import Service.RoleListService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/* *
测试事物注解
 */
public class Dome02 {
    @Test
    public void test()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        RoleListService roleListService = applicationContext.getBean(RoleListService.class);
        List<Role> roles = new ArrayList<Role>();
        for (int i = 1; i<=2; i++)
        {
            Role role = new Role();
            role.setNote("asdasd"+i);
            role.setRoleName("asdaxczdert"+i);
            role.setUid(1);
            roles.add(role);
        }
        int count = roleListService.insertRoleList(roles);
        System.out.println(count);
    }
}
