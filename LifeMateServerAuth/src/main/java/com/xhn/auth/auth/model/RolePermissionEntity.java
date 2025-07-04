package com.xhn.auth.auth.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 角色与权限关联表
 * </p>
 *
 * @author xhn
 * @since 2025-07-04
 */
@Getter
@Setter
@ToString
@TableName("auth_role_permission")
public class RolePermissionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("role_id")
    private Long roleId;

    @TableId("permission_id")
    private Long permissionId;
}
