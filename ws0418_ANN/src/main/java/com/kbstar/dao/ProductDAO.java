package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("pdao")
public class ProductDAO implements MyDao<String, ProductDTO> {

    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle:" +productDTO);

    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted Oracle:" +s);

    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle:" +productDTO);

    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO(s, "pencil", 1000, 10 );
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("id01", "pencil",1000, 10));
        list.add(new ProductDTO("id02", "pen",2000, 20));
        list.add(new ProductDTO("id03", "pen1",3000, 30));
        return list;
    }
}
