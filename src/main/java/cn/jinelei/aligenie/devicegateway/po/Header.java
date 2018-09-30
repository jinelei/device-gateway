package cn.jinelei.aligenie.devicegateway.po;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Header {
    @JsonProperty(required = true, index = 1)
    private String namespace;
    @JsonProperty(required = true, index = 2)
    private String name;
    @JsonProperty(required = true, index = 3)
    private String messageId;
    @JsonProperty(required = true, index = 4)
    private String payLoadVersion;

    public Header() {
    }

    public Header(String namespace, String name, String messageId, String payLoadVersion) {

        this.namespace = namespace;
        this.name = name;
        this.messageId = messageId;
        this.payLoadVersion = payLoadVersion;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getPayLoadVersion() {
        return payLoadVersion;
    }

    public void setPayLoadVersion(String payLoadVersion) {
        this.payLoadVersion = payLoadVersion;
    }

    @Override
    public String toString() {
        return "Header{" +
                "namespace='" + namespace + '\'' +
                ", name='" + name + '\'' +
                ", messageId='" + messageId + '\'' +
                ", payLoadVersion='" + payLoadVersion + '\'' +
                '}';
    }
}
