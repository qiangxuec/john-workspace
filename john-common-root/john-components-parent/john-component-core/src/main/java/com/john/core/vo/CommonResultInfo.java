package com.john.core.vo;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author john
 * @description 通用返回类
 * @date 2020/6/10 21:08
 */
public class CommonResultInfo<T> implements Serializable {

    public static final int SUCCESS = 1;
    public static final String MSG_SUCCESS = "success";

    public static final int FAILURE = 0;
    public static final String MSG_FAILED = "failed";

    public static CommonResultInfo<String> _instanceForFailure = new CommonResultInfo<>(FAILURE,MSG_FAILED);

    public static CommonResultInfo<String> _instanceForSuccess = new CommonResultInfo<>(SUCCESS,MSG_SUCCESS);

    private int status;

    private String message;

    private String errorCode;

    protected T data;

    private Date sysDate;

    private List<AbstractMap.SimpleEntry<String,String>> validations = Collections.emptyList();


    public CommonResultInfo(){
        this.sysDate = new Date();
    }

    public CommonResultInfo(T data){
        this();
        this.data = data;
    }

    public CommonResultInfo(int status,String message){
        this();
        this.status = status;
        this.message = message;
    }

    public CommonResultInfo(int status,String message,String errorCode){
        this();
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
    }

    public CommonResultInfo(int status,String message,T data){
        this();
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public CommonResultInfo(int status, String message, T data, List<AbstractMap.SimpleEntry<String,String>> validations){
        this();
        this.status = status;
        this.message = message;
        this.data = data;
        this.validations = validations;
    }

    public static CommonResultInfo<String> buildFailure(){
        return  _instanceForFailure;
    }
    public static CommonResultInfo<String> buildSuccess(){
        return  _instanceForSuccess;
    }

    public static<T> CommonResultInfo<T> buildFailure(String msg){
        return new CommonResultInfo<>(FAILURE,msg);
    }

    public static<T> CommonResultInfo<T> buildSuccess(T data){
        return new CommonResultInfo<>(SUCCESS,MSG_SUCCESS,data);
    }

    public static<T> CommonResultInfo<List<T>> buildSuccess(List<T> data){
        return new CommonResultInfo<>(SUCCESS,MSG_SUCCESS,data);
    }

    public static<T> CommonResultInfo<T> buildFailure(String errorCode,String msg){
        return new CommonResultInfo<>(FAILURE,msg,errorCode);
    }

//    public static<T> CommonResultInfo<T> buildValidation(FieldError fieldError){
//        return new CommonResultInfo<>(FAILURE,fieldError.getDefaultMessage(),fieldError.getCode());
//    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<AbstractMap.SimpleEntry<String, String>> getValidations() {
        return validations;
    }

    public void setValidations(List<AbstractMap.SimpleEntry<String, String>> validations) {
        this.validations = validations;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
