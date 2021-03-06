package com.xx.gmall.ums.service.impl;

import com.xx.gmall.ums.bean.AdminPermissionRelation;
import com.xx.gmall.ums.mapper.AdminPermissionRelationMapper;
import com.xx.gmall.ums.service.AdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author xx
 * @since 2019-05-09
 */
@Service
public class AdminPermissionRelationServiceImpl extends ServiceImpl<AdminPermissionRelationMapper, AdminPermissionRelation> implements AdminPermissionRelationService {

}
