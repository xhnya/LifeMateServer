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
 * JWT 黑名单（用于强制下线）
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Getter
@Setter
@ToString
@TableName("auth_blacklist")
public class BlacklistEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("token")
    private String token;

    @TableField("account_id")
    private Long accountId;

    @TableField("reason")
    private String reason;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("expire_time")
    private LocalDateTime expireTime;
}
