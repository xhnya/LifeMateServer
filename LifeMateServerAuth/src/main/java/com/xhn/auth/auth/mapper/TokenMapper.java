package com.xhn.auth.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhn.auth.auth.model.TokenEntity;

/**
 * <p>
 * 登录令牌或刷新令牌记录表（用于多端/自动登录） Mapper 接口
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
public interface TokenMapper extends BaseMapper<TokenEntity> {

}
