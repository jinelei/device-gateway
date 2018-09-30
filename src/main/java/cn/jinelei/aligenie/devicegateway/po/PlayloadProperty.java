package cn.jinelei.aligenie.devicegateway.po;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayloadProperty {
    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = true)
    private String value;

    public PlayloadProperty() {
    }

    public PlayloadProperty(String name, String value) {

        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PlayloadProperty{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
