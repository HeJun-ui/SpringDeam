package com.resp;

import org.springframework.stereotype.Service;

@Service
public class ResultResponse {

    private final static String SUCCESS = "success";
    private final static String FAIL = "field";

    public static Result getSuccessnotMessage(Object data) {
        return new Result().setCode(ResultCode.SUCCESS).setData(data).setMessage(SUCCESS);
    }

    public static Result getFailResult(String message) {
        return new Result().setCode(ResultCode.FAIL).setMessage(message);
    }

    public static Result getSuccessnotMessage() {
        return new Result().setCode(ResultCode.SUCCESS).setMessage(SUCCESS);
    }

    public static Result getFailnotMessage() {
        return new Result().setCode(ResultCode.FAIL);
    }

    public static Result getSuccessandMessage(Object data, String message) {
        return new Result().setCode(ResultCode.SUCCESS).setMessage(message).setData(data);
    }

    public static Result getSuccessandPage(Object data, String message, Integer page) {
        return new Result().setCode(ResultCode.SUCCESS).setMessage(message).setData(data).setPage(page);
    }

    public static Result getFailnotMessageandData(Object data, String message) {
        return new Result().setCode(ResultCode.FAIL).setData(data).setMessage(message);
    }

}
