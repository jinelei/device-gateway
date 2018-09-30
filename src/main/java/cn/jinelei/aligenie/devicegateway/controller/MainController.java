package cn.jinelei.aligenie.devicegateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public String index(){
        LOGGER.debug("request index");
        return "index";
    }

    @RequestMapping("/gateway")
    public String gateway(){
        LOGGER.debug("request gateway");
        return "gateway";
    }

}
