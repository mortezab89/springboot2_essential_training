package com.morteza;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ind;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String number;

    @Column(name = "BED_INFO")
    private String info;


}
