package com.asc.button.mq.module.controller;

import com.asc.button.mq.module.service.LedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/led")
public class LedController {

    private final LedService ledService;

    @PostMapping("/on")
    public ResponseEntity<String> turnOn() {
        ledService.turnOnLed();
        return ResponseEntity.ok("LED turned ON");
    }

    @PostMapping("/off")
    public ResponseEntity<String> turnOff() {
        ledService.turnOffLed();
        return ResponseEntity.ok("LED turned OFF");
    }

}