package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.BlacklistEntity;
import com.xhn.auth.auth.mapper.BlacklistMapper;
import com.xhn.auth.auth.service.BlacklistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * JWT 黑名单（用于强制下线） 服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class BlacklistServiceImpl extends ServiceImpl<BlacklistMapper, BlacklistEntity> implements BlacklistService {

}
