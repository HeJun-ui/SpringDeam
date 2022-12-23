package com.resp;


import lombok.Data;

@Data

public class Result {

    private int code;


    private String message;


    private Object data;

    private Integer page;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public Result setPage(Integer page) {
        this.page = page;
        return this;
    }
}
