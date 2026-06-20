package com.codealpha.eventregistration.service;

import com.codealpha.eventregistration.model.Event;
import com.codealpha.eventregistration.repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }public Event updateEvent(Long id, Event updatedEvent) {

    Event event = eventRepository.findById(id).orElse(null);

    if (event != null) {
        event.setEventName(updatedEvent.getEventName());
        event.setEventDate(updatedEvent.getEventDate());
        event.setVenue(updatedEvent.getVenue());
        event.setDescription(updatedEvent.getDescription());

        return eventRepository.save(event);
    }

    return null;
}
}