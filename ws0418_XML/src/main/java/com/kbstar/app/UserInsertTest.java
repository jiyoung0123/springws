package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInsertTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service =
                (MyService<String, ProductDTO>)  factory.getBean("uservice");


        ProductDTO u = new ProductDTO("id01", "pencil",1000, 10);
        service.register(u);
    }

}
