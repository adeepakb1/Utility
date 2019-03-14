package com.example.springBootDemo.Model;


public class Pnv {

    private String otpPnv;
    private String otpPhoneRecovery;
    private String otpChangePhoneNumber;
    private String otpEmailRecovery;
    private String otpForgotPassword;
    private String otpRewardPoints;

    public String getOtpPnv() {
        return otpPnv;
    }

    public void setOtpPnv(String otpPnv) {
        this.otpPnv = otpPnv;
    }

    public String getOtpPhoneRecovery() {
        return otpPhoneRecovery;
    }

    public void setOtpPhoneRecovery(String otpPhoneRecovery) {
        this.otpPhoneRecovery = otpPhoneRecovery;
    }

    public String getOtpChangePhoneNumber() {
        return otpChangePhoneNumber;
    }

    public void setOtpChangePhoneNumber(String otpChangePhoneNumber) {
        this.otpChangePhoneNumber = otpChangePhoneNumber;
    }

    public String getOtpEmailRecovery() {
        return otpEmailRecovery;
    }

    public void setOtpEmailRecovery(String otpEmailRecovery) {
        this.otpEmailRecovery = otpEmailRecovery;
    }

    public String getOtpForgotPassword() {
        return otpForgotPassword;
    }

    public void setOtpForgotPassword(String otpForgotPassword) {
        this.otpForgotPassword = otpForgotPassword;
    }

    public String getOtpRewardPoints() {
        return otpRewardPoints;
    }

    public void setOtpRewardPoints(String otpRewardPoints) {
        this.otpRewardPoints = otpRewardPoints;
    }

    @Override
    public String toString() {
        return "Pnv{" +
                "otpPnv='" + otpPnv + '\'' +
                ", otpPhoneRecovery='" + otpPhoneRecovery + '\'' +
                ", otpChangePhoneNumber='" + otpChangePhoneNumber + '\'' +
                ", otpEmailRecovery='" + otpEmailRecovery + '\'' +
                ", otpForgotPassword='" + otpForgotPassword + '\'' +
                ", otpRewardPoints='" + otpRewardPoints + '\'' +
                '}';
    }
}
