package com.asc.button.mq.module.service.impl;

import com.asc.button.mq.module.mqtt.MqttSender;
import com.asc.button.mq.module.service.LedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LedServiceImpl implements LedService {

    private final MqttSender mqttSender;

    @Override
    public void turnOnLed() {
        mqttSender.sendToMqtt("esp32/led", "ON");
    }

    @Override
    public void turnOffLed() {
        mqttSender.sendToMqtt("esp32/led", "OFF");
    }
}
