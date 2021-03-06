package com.morteza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}
