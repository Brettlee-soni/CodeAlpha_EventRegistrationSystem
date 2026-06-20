package com.codealpha.eventregistration.controller;

import com.codealpha.eventregistration.model.Event;
import com.codealpha.eventregistration.service.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getEvent(@PathVariable Long id) {
        return eventService.getEventById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return "Event Deleted Successfully";
    }@PutMapping("/{id}")
public Event updateEvent(@PathVariable Long id,
                         @RequestBody Event event) {

    return eventService.updateEvent(id, event);
}
}