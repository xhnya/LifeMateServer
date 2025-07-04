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
 * 客户端信息（用于 OAuth 或第三方调用）
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Getter
@Setter
@ToString
@TableName("auth_client")
public class ClientEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("client_id")
    private String clientId;

    @TableField("client_secret")
    private String clientSecret;

    @TableField("name")
    private String name;

    @TableField("grant_types")
    private String grantTypes;

    @TableField("redirect_uris")
    private String redirectUris;

    @TableField("scopes")
    private String scopes;

    @TableField("access_token_validity")
    private Integer accessTokenValidity;

    @TableField("refresh_token_validity")
    private Integer refreshTokenValidity;

    @TableField("create_time")
    private LocalDateTime createTime;
}
