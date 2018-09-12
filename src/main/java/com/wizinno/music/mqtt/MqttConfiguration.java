package com.wizinno.music.mqtt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author LiuMei
 * @date 2018-09-05.
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "mqtt")
@Data
public class MqttConfiguration {

    private String host;
    private String clientId;
    private String username;
    private String password;
    private String topic;
    private int timeout;
    private int keepAlive;

    @Bean
    public MqttPushClient getMqttPushClient(){
        MqttPushClient mqttPushClient = new MqttPushClient();
        mqttPushClient.connect(host, clientId, username, password, timeout,keepAlive);
        return mqttPushClient;
    }
}
