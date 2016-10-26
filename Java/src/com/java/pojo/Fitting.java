package com.java.pojo;


/**
 * 商品
 */
public class Fitting {

    private Integer FittingID;// 主键
    private String FittingName;// 名字
    private String FittingCode;// 编码
    private String Pattern;// 规格

    public Integer getFittingID() {
        return FittingID;
    }

    public void setFittingID(Integer fittingID) {
        FittingID = fittingID;
    }

    public String getFittingName() {
        return FittingName;
    }

    public void setFittingName(String fittingName) {
        FittingName = fittingName;
    }

    public String getFittingCode() {
        return FittingCode;
    }

    public void setFittingCode(String fittingCode) {
        FittingCode = fittingCode;
    }

    public String getPattern() {
        return Pattern;
    }

    public void setPattern(String pattern) {
        Pattern = pattern;
    }

}
