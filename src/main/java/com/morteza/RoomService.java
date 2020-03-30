package com.morteza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomsRepository;

    public List<Room> getAllRooms(){
        List<Room> rooms = new ArrayList<>();

    roomsRepository.findAll().forEach(rooms::add);
    return rooms;
    }

}
