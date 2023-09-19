package com.engineersmind.s3.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.engineersmind.s3.model.EventChat;
import com.engineersmind.s3.service.EventChatService;



@RestController
public class EventChatController {

    @Autowired
    private EventChatService eventChatService;

    @GetMapping("/eventChats")
    public List<EventChat> getAllEventChats() {
        return eventChatService.getAllEventChats();
    }
    
    @GetMapping("/eventChat/{id}")
    public ResponseEntity<EventChat> getEventChatById(@PathVariable Integer id) {
        Optional<EventChat> eventChat = eventChatService.getEventChatById(id);
        return eventChat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
  
   
    @GetMapping("/byLastUpdatedTimestamp")
    public ResponseEntity<List<EventChat>> getEventChatsByLastUpdatedTimestamp(
            @RequestParam(name = "lastUpdatedTimestamp") 
            @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS") LocalDateTime lastUpdatedTimestamp) {
        Timestamp timestamp = Timestamp.valueOf(lastUpdatedTimestamp);
        List<EventChat> eventChats = eventChatService.getEventChatsByLastUpdatedTimestamp(timestamp);
        return new ResponseEntity<>(eventChats, HttpStatus.OK);
    }

    
}
