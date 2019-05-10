package com.xx.gmall.pms.service.impl;

import com.xx.gmall.pms.bean.Product;
import com.xx.gmall.pms.mapper.ProductMapper;
import com.xx.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author xx
 * @since 2019-05-09
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
