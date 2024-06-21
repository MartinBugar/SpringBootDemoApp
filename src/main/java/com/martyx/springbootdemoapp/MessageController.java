package com.martyx.springbootdemoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") Long id) {
        return messageRepository.findById(id);
    }
}
