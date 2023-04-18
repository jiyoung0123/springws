package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements MyDao<String, ProductDTO> {
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle:" +productDTO);

    }

    public void delete(String s) {
        System.out.println("Deleted Oracle:" +s);

    }

    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle:" +productDTO);

    }

    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO(s, "pencil", 1000, 10 );
        return product;
    }

    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("id01", "pencil",1000, 10));
        list.add(new ProductDTO("id02", "pen",2000, 20));
        list.add(new ProductDTO("id03", "pen1",3000, 30));
        return list;
    }
}
