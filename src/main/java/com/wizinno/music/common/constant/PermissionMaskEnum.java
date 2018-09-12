package com.wizinno.music.common.constant;

import lombok.Getter;

/**
 * @author LiuMei
 * @date 2018-06-25.
 */
@Getter
public enum PermissionMaskEnum {

    //System management
    SystemConfiguration(0x80000000, 0, "系统配置"),
//    SystemFunctionManagement(0x40000000, 0, "系统功能管理"),
    RoleManagement(0x20000000, 0, "角色管理"),
    OrganizationManagement(0x10000000, 0, "医院管理"),
    UserManagement(0x08000000, 0, "用户管理"),

    //Data Management
//    DataImportExport(0x00000100, 1, "数据导入导出"),
//    DataModification(0x00000200, 1, "数据高级修改"),
//    DataCheck(0x00000400, 1, "数据一致性检查"),
//    DataRecovery(0x00000800, 1, "数据修复"),
//    DataBackup(0x00001000, 1, "数据备份"),

    //Organization management
//    UserManagementInOrg(0x00100000, 10, "管理院内用户"),

    //RoleManagementInOrg(0x00200000, 10),
//    RemoteDiagnosisManagementInOrg(0x00200000, 10, "远程会诊授权管理"),
//    DiagnosisSuiteManagementInOrg(0x00400000, 10, "诊断列表维护"),
    ChangePassword(0x01000000, 10, "允许修改密码"),

    //ECG wave query management
    QueryECGWave(0x00000001, 10, "心电图查询"),
//    ReadECGText(0x00000002, 10, "心电图文字报告阅读"),
//    ReadECGWave(0x00000004, 10, "心电图形报告阅览"),
//    GenerateECGReport(0x00000008, 10, "心电图报告在线打印"),

    //ECG Diagnosis
//    ECGRemoteCollect(0x00000010, 10, "心电图远程采集"),
//    ECGDiagnosis(0x00000020, 10, "心电图在线诊断"),
//    ECGAudit(0x00000040, 10, "心电图在线审核"),

    //Statistics
    EffortStatistic(0x00000080, 10, "工作量统计"),;

    int mask;

    int level;

    private String desc;

    PermissionMaskEnum(int mask, int level, String desc) {
        this.mask = mask;
        this.level = level;
        this.desc = desc;
    }

    static public PermissionMaskEnum valueOf(int mask) {
        for (PermissionMaskEnum item : values()) {
            if (item.mask == mask) {
                return item;
            }
        }
        return null;
    }

}
