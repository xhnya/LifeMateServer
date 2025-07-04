package com.xhn.auth.utils;

/**
 * @author xhn
 * @date 2025/7/4 9:54
 * @description
 */
public class demo {
    public static void main(String[] args) {
        String path = demo.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        java.io.File file = new java.io.File(path);
        String moduleRoot = file.getParentFile().getParent();
        System.out.println("模块根目录: " + moduleRoot);
    }
}
