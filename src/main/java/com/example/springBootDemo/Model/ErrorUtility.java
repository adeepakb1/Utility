package com.example.springBootDemo.Model;

public class ErrorUtility extends Pnv {

    private String status;
    private String error;
    private String erroMessage;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErroMessage() {
        return erroMessage;
    }

    public void setErroMessage(String erroMessage) {
        this.erroMessage = erroMessage;
    }


    @Override
    public String toString() {
        return "Error{" +
                "status='" + status + '\'' +
                ", error='" + error + '\'' +
                ", erroMessage='" + erroMessage + '\'' +
                '}';
    }
}
