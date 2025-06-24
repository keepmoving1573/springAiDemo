package com.example.demo;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 詹欢欢
 * @since 2025/6/24-9:56
 */
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatModel chatModel;

    public ChatController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/test")
    public String test() {
        return "hello world!";
    }

    @GetMapping("/conversation")
    public String conversation(@RequestParam("message") String message) {
        return chatModel.call(message);
    }

}
