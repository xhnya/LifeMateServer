package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.RolePermissionEntity;
import com.xhn.auth.auth.mapper.RolePermissionMapper;
import com.xhn.auth.auth.service.RolePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与权限关联表 服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermissionEntity> implements RolePermissionService {

}
