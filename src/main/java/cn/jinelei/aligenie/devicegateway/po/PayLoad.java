package cn.jinelei.aligenie.devicegateway.po;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PayLoad {
    @JsonProperty(required = true)
    private List<PayloadDevice> devices;
    @JsonProperty(required = true)
    private List<PlayloadProperty> properties;
    @JsonProperty(required = true)
    private List<String> actions;
    @JsonProperty(required = false)
    private String extensions;

    public List<PayloadDevice> getDevices() {
        return devices;
    }

    public void setDevices(List<PayloadDevice> devices) {
        this.devices = devices;
    }

    public List<PlayloadProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<PlayloadProperty> properties) {
        this.properties = properties;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getExtensions() {
        return extensions;
    }

    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }

    public PayLoad() {
    }

    public PayLoad(List<PayloadDevice> devices, List<PlayloadProperty> properties, List<String> actions, String extensions) {

        this.devices = devices;
        this.properties = properties;
        this.actions = actions;
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return "PayLoad{" +
                "devices=" + devices +
                ", properties=" + properties +
                ", actions=" + actions +
                ", extensions='" + extensions + '\'' +
                '}';
    }
}
