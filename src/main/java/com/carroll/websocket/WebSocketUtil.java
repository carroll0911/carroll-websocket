package com.carroll.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @author: carroll.he
 * @date 2020/6/1
 */
@Component
public class WebSocketUtil {
    @Autowired
    private SimpMessagingTemplate template;

    public void send(String topic, String content) {
        template.convertAndSend(topic, content);
    }
}
