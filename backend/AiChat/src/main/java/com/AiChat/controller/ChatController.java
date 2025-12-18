package com.AiChat.controller;

import com.AiChat.model.ChatRoom;
import com.AiChat.service.ChatService;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Resource
    private ChatService chatService;

    @PostMapping("/doChat")
    public String doChat(
            @RequestParam long roomId,
            @RequestParam String prompt
    ) {
        return chatService.doChat(roomId, prompt);
    }

    @GetMapping("/rooms")
    public List<ChatRoom> getChatRooms() {
        return chatService.getChatRoomList();
    }
}