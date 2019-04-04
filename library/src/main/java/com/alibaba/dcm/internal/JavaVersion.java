package com.alibaba.dcm.internal;

/**
 * @author dzg
 * @date 2019/4/4
 */
public enum JavaVersion {
    /**
     * jdk版本
     */
    JDK6(1.6D),
    JDK7(1.7D),
    JDK8(1.8D),
    JDK9(9.0D),
    JDK10(10.0D),
    JDK11(11.0D),
    JDK12(12.0D);
    private final double versionNum;

    JavaVersion(double versionNum) {
        this.versionNum = versionNum;
    }

    public boolean isLessThenOrEqual(double otherVersionNum) {
        return this.versionNum <= otherVersionNum;
    }
}