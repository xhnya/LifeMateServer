package com.xhn.auth.auth.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 账号与角色关联表
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Getter
@Setter
@ToString
@TableName("auth_account_role")
public class AccountRoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("account_id")
    private Long accountId;

    @TableId("role_id")
    private Long roleId;
}
