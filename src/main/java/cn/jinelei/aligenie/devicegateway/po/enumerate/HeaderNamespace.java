package cn.jinelei.aligenie.devicegateway.po.enumerate;

public enum HeaderNamespace {
    ALIGENIE_IOT_DEVICE_DISCOVERY("AliGenie.Iot.PayloadDevice.Discovery"),
    ALIGENIE_IOT_DEVICE_CONTROL("AliGenie.Iot.PayloadDevice.Control"),
    ALIGENIE_IOT_DEVICE_QUERY("AliGenie.Iot.PayloadDevice.Query");

    private String descript;

    HeaderNamespace(String descript) {
        this.descript = descript;
    }

    public String getDescript() {
        return descript;
    }
}
