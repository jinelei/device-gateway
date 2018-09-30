package cn.jinelei.aligenie.devicegateway.po.enumerate;

public enum HeaderNamespace {
    ALIGENIE_IOT_DEVICE_DISCOVERY("AliGenie.Iot.Device.Discovery"),
    ALIGENIE_IOT_DEVICE_CONTROL("AliGenie.Iot.Device.Control"),
    ALIGENIE_IOT_DEVICE_QUERY("AliGenie.Iot.Device.Query");

    private String descript;

    HeaderNamespace(String descript) {
        this.descript = descript;
    }

    public String getDescript() {
        return descript;
    }
}
