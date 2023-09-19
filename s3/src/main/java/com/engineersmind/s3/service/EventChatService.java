package com.engineersmind.s3.service;

import com.engineersmind.s3.model.EventChat;
import com.engineersmind.s3.repository.EventChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;


@Service
public class EventChatService {

    @Autowired
    private EventChatRepository eventChatRepository;

    public List<EventChat> getAllEventChats() {
        return eventChatRepository.findAll();
    }

    public Optional<EventChat> getEventChatById(Integer id) {
        return eventChatRepository.findById(id);
    }
    
    public List<EventChat> getEventChatsByLastUpdatedTimestamp(Timestamp LastDateUpdated_UTC) {
        return eventChatRepository.findByLastDateUpdated_UTC(LastDateUpdated_UTC);
    }

    

}
