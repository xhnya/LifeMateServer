package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.AccountEntity;
import com.xhn.auth.auth.mapper.AccountMapper;
import com.xhn.auth.auth.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountEntity> implements AccountService {

}
