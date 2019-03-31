package com.rao.study.react.vo;

import java.io.Serializable;

public class ResponseVo<T> implements Serializable {
    private String msg;
    private String code;
    private T data;

    public ResponseVo() {
    }

    public ResponseVo(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
