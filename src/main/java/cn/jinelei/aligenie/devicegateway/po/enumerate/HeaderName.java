package cn.jinelei.aligenie.devicegateway.po.enumerate;

import javax.management.Query;

public enum HeaderName {
    /**
     * 设备发现类（与AliGenie.Iot.PayloadDevice.Discovery对应）
     */
    DiscoveryDevices("DiscoveryDevices", "设备发现（获取设备列表）"),

    /**
     * 操作类（与AliGenie.Iot.PayloadDevice.Control对应）
     */
    TurnOn("TurnOn", "打开"),
    TurnOff("TurnOff", "关闭"),
    SelectChannel("SelectChannel", "频道切换"),
    AdjustUpChannel("AdjustUpChannel", "频道增加"),
    AdjustDownChannel("AdjustDownChannel", "频道减少"),
    AdjustUpVolume("AdjustUpVolume", "声音按照步长调大"),
    AdjustDownVolume("AdjustDownVolume", "声音按照步长调小"),
    SetVolume("SetVolume", "声音调到某个值"),
    SetMute("SetMute", "设置静音"),
    CancelMute("CancelMute", "取消静音"),
    Play("Play", "播放"),
    Pause("Pause", "暂停"),
    Continue("Continue", "继续"),
    Next("Next", "下一首或下一台"),
    Previous("Previous", "上一首或上一台"),
    SetBrightness("SetBrightness", "设置亮度"),
    AdjustUpBrightness("AdjustUpBrightness", "调大亮度"),
    AdjustDownBrightness("AdjustDownBrightness", "调小亮度"),
    SetTemperature("SetTemperature", "设置温度"),
    AdjustUpTemperature("AdjustUpTemperature", "调高温度"),
    AdjustDownTemperature("AdjustDownTemperature", "调低温度"),
    SetWindSpeed("SetWindSpeed", "设置风速"),
    AdjustUpWindSpeed("AdjustUpWindSpeed", "调大风速"),
    AdjustDownWindSpeed("AdjustDownWindSpeed", "调小风速"),
    SetMode("SetMode", "模式的切换"),
    SetColor("SetColor", "设置颜色"),
    OpenFunction("OpenFunction", "打开功能"),
    CloseFunction("CloseFunction", "关闭功能"),
    Cancel("Cancel", "取消"),
    CancelMode("CancelMode", "取消模式(退出模式)"),

    /**
     * 查询类（与AliGenie.Iot.PayloadDevice.Query对应）
     */
    Query("Query", "查询所有标准属性"),
    QueryColor("QueryColor", "查询颜色"),
    QueryPowerState("QueryPowerState", "查询电源开关"),
    QueryTemperature("QueryTemperature", "查询温度"),
    QueryHumidity("QueryHumidity", "查询湿度"),
    QueryWindSpeed("QueryWindSpeed", "查询风速"),
    QueryBrightness("QueryBrightness", "查询亮度"),
    QueryFog("QueryFog", "查询雾量"),
    QueryMode("QueryMode", "查询模式"),
    QueryPM25("QueryPM25", "查询pm2.5 含量"),
    QueryDirection("QueryDirection", "查询方向"),
    QueryAngle("QueryAngle", "查询角度");

    private String name;
    private String descript;

    HeaderName(String name, String descript) {
        this.name = name;
        this.descript = descript;
    }

    public String getName() {
        return name;
    }

    public String getDescript() {
        return descript;
    }
}
