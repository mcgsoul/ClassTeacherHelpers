package com.classteacherhelper.www.helper.bean;

/**
 * 统一返回结果类
 */
public class ReturnResult<T> {
    /**返回状态码，1成功，2失败，3未知错误*/
    private int code;

    /**返回信息*/
    private String message;

    /**返回数据集*/
    private T t;

    public ReturnResult(int code, String message, T t) {
        this.code = code;
        this.message = message;
        this.t = t;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }




}
