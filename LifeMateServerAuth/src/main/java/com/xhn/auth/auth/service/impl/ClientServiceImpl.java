package com.xhn.auth.auth.service.impl;

import com.xhn.auth.auth.model.ClientEntity;
import com.xhn.auth.auth.mapper.ClientMapper;
import com.xhn.auth.auth.service.ClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户端信息（用于 OAuth 或第三方调用） 服务实现类
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, ClientEntity> implements ClientService {

}
