package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.PermissionEntity;
import com.xhn.auth.auth.mapper.PermissionMapper;
import com.xhn.auth.auth.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表（菜单/按钮/接口） 服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, PermissionEntity> implements PermissionService {

}
