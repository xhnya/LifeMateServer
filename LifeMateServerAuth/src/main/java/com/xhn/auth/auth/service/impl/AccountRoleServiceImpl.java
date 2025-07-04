package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.AccountRoleEntity;
import com.xhn.auth.auth.mapper.AccountRoleMapper;
import com.xhn.auth.auth.service.AccountRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账号与角色关联表 服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class AccountRoleServiceImpl extends ServiceImpl<AccountRoleMapper, AccountRoleEntity> implements AccountRoleService {

}
