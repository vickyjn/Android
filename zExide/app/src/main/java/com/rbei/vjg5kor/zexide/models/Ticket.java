package com.rbei.vjg5kor.zexide.models;

import java.io.Serializable;

public class Ticket implements Serializable {

    public Ticket(String alertType, String ticketNo, String ticketDue, String ticketType, String customerName, String customerMobileNo, String customerEmail, String customerBuildingNo, String customerStreet, String customerCity, String customerState, String customerPinCode, String batteryModel, String batteryType, String batteryAH, String customerAddress, Double lattitude, Double longitude) {
        this.alertType = alertType;
        this.ticketNo = ticketNo;
        this.ticketDue = ticketDue;
        this.ticketType = ticketType;
        this.customerName = customerName;
        this.customerMobileNo = customerMobileNo;
        this.customerEmail = customerEmail;
        this.customerBuildingNo = customerBuildingNo;
        this.customerStreet = customerStreet;
        this.customerCity = customerCity;
        this.customerState = customerState;
        this.customerPinCode = customerPinCode;
        this.batteryModel = batteryModel;
        this.batteryType = batteryType;
        this.batteryAH = batteryAH;
        this.customerAddress = customerAddress;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    String alertType;
    String ticketNo;
    String ticketDue;
    String ticketType;
    String customerName;
    String customerMobileNo;
    String customerEmail;
    String customerBuildingNo;
    String customerStreet;
    String customerCity;
    String customerState;
    String customerPinCode;
    String batteryModel;
    String batteryType;
    String batteryAH;
    String customerAddress;
    Double lattitude;
    Double longitude;

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getTicketDue() {
        return ticketDue;
    }

    public void setTicketDue(String ticketDue) {
        this.ticketDue = ticketDue;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerBuildingNo() {
        return customerBuildingNo;
    }

    public void setCustomerBuildingNo(String customerBuildingNo) {
        this.customerBuildingNo = customerBuildingNo;
    }

    public String getCustomerStreet() {
        return customerStreet;
    }

    public void setCustomerStreet(String customerStreet) {
        this.customerStreet = customerStreet;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerPinCode() {
        return customerPinCode;
    }

    public void setCustomerPinCode(String customerPinCode) {
        this.customerPinCode = customerPinCode;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getBatteryAH() {
        return batteryAH;
    }

    public void setBatteryAH(String batteryAH) {
        this.batteryAH = batteryAH;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Double getLattitude() {
        return lattitude;
    }

    public void setLattitude(Double lattitude) {
        this.lattitude = lattitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}