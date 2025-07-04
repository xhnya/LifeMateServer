package com.xhn.auth.auth.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 登录令牌或刷新令牌记录表（用于多端/自动登录）
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Getter
@Setter
@ToString
@TableName("auth_token")
public class TokenEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("account_id")
    private Long accountId;

    @TableField("client_id")
    private String clientId;

    @TableField("access_token")
    private String accessToken;

    @TableField("refresh_token")
    private String refreshToken;

    @TableField("ip_address")
    private String ipAddress;

    @TableField("user_agent")
    private String userAgent;

    @TableField("expires_at")
    private LocalDateTime expiresAt;

    @TableField("create_time")
    private LocalDateTime createTime;
}
