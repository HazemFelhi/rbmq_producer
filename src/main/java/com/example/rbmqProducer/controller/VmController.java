package com.example.rbmqProducer.controller;

import com.example.rbmqProducer.model.Vm;
import com.example.rbmqProducer.producer.RabbitMQMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VmController {

    private final RabbitMQMessageProducer messageProducer;

    @Autowired
    public VmController(RabbitMQMessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @PostMapping("/publish")
    public String publishObjectMessage(@RequestBody Vm vm) {
        messageProducer.sendObjectMessage(vm);
        return "Vm published";
    }
}
