package com.wizinno.music.controller;

import com.wizinno.music.mqtt.MqttPushClient;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuMei
 * @date 2018-09-05.
 */
@Slf4j
@RestController
@Api(description = "Mqtt测试接口")
@RequestMapping("/api/mqtt")
public class MqttController {

    @Autowired
    private MqttPushClient mqttPushClient;

    @GetMapping("/sendMq")
    public String sendMqtt(String sendData) {
        mqttPushClient.publish("hello", sendData);
        return "send success";
    }

    @GetMapping("/receiveMq")
    public String receiveMqtt() {
        mqttPushClient.subscribe("test_topic");
        return "subscribe success";
    }
}
