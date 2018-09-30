package cn.jinelei.aligenie.devicegateway.po;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PayloadDevice {
    @JsonProperty(required = true)
    private String deviceId;
    @JsonProperty(required = true)
    private String deviceName;
    @JsonProperty(required = true)
    private String deviceType;
    @JsonProperty(required = true)
    private String icon;
    @JsonProperty(required = false, defaultValue = "")
    private String zone;
    @JsonProperty(required = false, defaultValue = "")
    private String brand;
    @JsonProperty(required = false, defaultValue = "")
    private String model;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PayloadDevice() {
    }

    public PayloadDevice(String deviceId, String deviceName, String deviceType, String icon, String zone, String brand, String model) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.icon = icon;
        this.zone = zone;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "PayloadDevice{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", icon='" + icon + '\'' +
                ", zone='" + zone + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
