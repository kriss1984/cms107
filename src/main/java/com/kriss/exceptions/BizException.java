package com.kriss.exceptions;

public class BizException extends RuntimeException {
   private String excetionCode;
    private  String excetionMessage;

    public BizException(String excetionCode,String excetionMessage){
        super(excetionMessage);
        this.excetionCode = excetionCode;
        this.excetionMessage = excetionMessage;

    }

    public BizException(){}

    public String getExcetionCode() {
        return excetionCode;
    }

    public void setExcetionCode(String excetionCode) {
        this.excetionCode = excetionCode;
    }

    public String getExcetionMessage() {
        return excetionMessage;
    }

    public void setExcetionMessage(String excetionMessage) {
        this.excetionMessage = excetionMessage;
    }
}
