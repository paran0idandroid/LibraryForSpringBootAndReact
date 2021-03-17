package com.herb.lib.api.model;

import com.herb.lib.api.enums.ValidFlagEnum;
import lombok.Data;

import java.util.Date;

/**
 * 实体类父类
 */
@Data
public class BaseDTO{
    /**
     数据ID
     */
    private int id;

    /**
     * 临时字段1
     */
    private String tmp1;

    /**
     * 临时字段2
     */
    private String tmp2;

    /**
     * 入库时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;



    /**
     * 数据有效性
     */
    private ValidFlagEnum validFlag;

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setValidFlag(ValidFlagEnum validFlag) {
        this.validFlag = validFlag;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setTmp1(String tmp1) {
        this.tmp1 = tmp1;
    }

    public void setTmp2(String tmp2) {
        this.tmp2 = tmp2;
    }

    public String getTmp1() {
        return tmp1;
    }

    public String getTmp2() {
        return tmp2;
    }
}
