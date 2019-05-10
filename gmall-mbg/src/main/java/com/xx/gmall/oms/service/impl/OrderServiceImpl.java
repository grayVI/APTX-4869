package com.xx.gmall.oms.service.impl;

import com.xx.gmall.oms.bean.Order;
import com.xx.gmall.oms.mapper.OrderMapper;
import com.xx.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author xx
 * @since 2019-05-09
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
