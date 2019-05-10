package com.xx.gmall.pms;

import com.xx.gmall.pms.bean.Product;
import com.xx.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GmallPmsApplicationTests {


    @Autowired
    private ProductService productService;

    @Test
    public void contextLoads() {

        Product product = productService.getById(1);
        log.info("张一郎");
        product.setName("银色星芒刺绣网纱底裤w");
        productService.updateById(product);
        System.out.println(product);
    }

}
