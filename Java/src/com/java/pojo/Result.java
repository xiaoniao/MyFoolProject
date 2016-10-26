package com.java.pojo;

/**
 * 杩斿洖缁撴灉
 */
public class Result<T> {


    /**
     * 閿欒缂栫爜
     */
    private String errorCode;

    /**
     * 杩斿洖璇存槑
     */
    private String reason;

    /**
     * 杩斿洖鏁版嵁闆�
     */
    private T result;

    public Result() {

    }

    public Result(String errorCode, String reason, T result) {
        this.errorCode = errorCode;
        this.reason = reason;
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
