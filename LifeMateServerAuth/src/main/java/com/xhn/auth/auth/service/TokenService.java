package com.xhn.auth.auth.service;

import com.xhn.auth.auth.model.TokenEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 登录令牌或刷新令牌记录表（用于多端/自动登录） 服务类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
public interface TokenService extends IService<TokenEntity> {

}
