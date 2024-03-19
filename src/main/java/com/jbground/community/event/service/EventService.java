package com.jbground.community.event.service;

import com.jbground.community.event.repository.EventRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Resource
    private EventRepository eventRepository;

    public void findEvents(){
        eventRepository.findAll();
    }

    public void findEvents(int id){
        eventRepository.findById((long) id);
    }
}
