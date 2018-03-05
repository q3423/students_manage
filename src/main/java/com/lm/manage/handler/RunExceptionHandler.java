package com.lm.manage.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@Title: RunExceptionHandler
 *@Author:LiMan
 *@Date:2018/3/5 10:35
 *@Description: 
 */
@ControllerAdvice
public class RunExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionRequest(Exception e){
        e.printStackTrace();
        e.getMessage();
        return "请联系管理员";
    }
}
