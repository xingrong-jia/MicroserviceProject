package com.stylefeng.guns.rest.model;

import lombok.Data;

/**
 * @author Xingrong.Jia
 * @USER forever
 * @PROJECT_NAME: guns
 * @date 2020-01-07 21:02
 */
@Data
public class Result<T> {

    private Integer status;

    private String msg;

    private T data;

    public static Result ok(String msg){
        return new Result(0,msg);
    }

    public Result(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Result() {
    }
}
