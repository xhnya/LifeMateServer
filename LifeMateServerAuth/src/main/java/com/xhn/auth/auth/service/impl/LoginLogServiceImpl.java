package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.LoginLogEntity;
import com.xhn.auth.auth.mapper.LoginLogMapper;
import com.xhn.auth.auth.service.LoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLogEntity> implements LoginLogService {

}
