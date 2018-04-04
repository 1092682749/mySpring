package test;

import POJO.Role;
import mapper.RoleMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

public class Dome01 {
    @Test
    public void test()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        RoleMapper roleMapper = applicationContext.getBean(RoleMapper.class);
        Role role = roleMapper.findRole(1L);
        System.out.println(role.toString());
    }
}
