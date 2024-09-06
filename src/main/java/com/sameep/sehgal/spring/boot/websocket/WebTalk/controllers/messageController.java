package com.sameep.sehgal.spring.boot.websocket.WebTalk.controllers;

import com.sameep.sehgal.spring.boot.websocket.WebTalk.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageController {


    @MessageMapping("/message")             //send msg at this url
    @SendTo("/topic/request-to")            //broadcast response at this url
    public Message getContent(@RequestBody Message message)
    {
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return message;
    }

}
