package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.TokenEntity;
import com.xhn.auth.auth.mapper.TokenMapper;
import com.xhn.auth.auth.service.TokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录令牌或刷新令牌记录表（用于多端/自动登录） 服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class TokenServiceImpl extends ServiceImpl<TokenMapper, TokenEntity> implements TokenService {

}
