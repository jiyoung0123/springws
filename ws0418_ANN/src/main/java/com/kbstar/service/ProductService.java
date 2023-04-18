package com.kbstar.service;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pservice")
public class ProductService implements MyService<String, ProductDTO> {


    @Autowired         //자동적으로 찾아서 주입시켜준다   //userMysql이랑 User랑 2개니깐,
                        // 뭘 가져올지를 모름  --> 밑에 qualifier를 넣고, 각 각 repository의 이름붙여주기
                        //아니면 다 지우고, Autowired 쓰고 밑에 userDAO dao;라고 써도 된다
    //@Autowired
    //@Qualifier("udao")
    //MyDao<String, UserDTO> dao;

    //@Autowired

    //UserDAO dao;
    @Qualifier("pdao")
    MyDao<String, ProductDTO> dao;


    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
        System.out.println("Send mail");

    }

    @Override
    public void remove(String s) {
        dao.delete(s);

    }

    @Override
    public void modify(ProductDTO productDTO) {
        dao.update(productDTO);
        System.out.println("Send mail");

    }

    @Override
    public ProductDTO get(String s) {
        return dao.select(s);
    }

    @Override
    public List<ProductDTO> get() {
        return dao.select();
    }
}
