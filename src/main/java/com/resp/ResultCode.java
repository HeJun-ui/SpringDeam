package com.resp;

public enum ResultCode {

    SUCCESS(200),//成功
    FAIL(400),//失败
    INTERNAL_SERVER_ERROR(500);//服务器内部错误

    public int code;
    ResultCode(int code) {
        this.code = code;
    }
}
