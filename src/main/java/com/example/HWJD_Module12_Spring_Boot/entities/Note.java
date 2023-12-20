package com.example.HWJD_Module12_Spring_Boot.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class Note {
    private UUID id;
    private String title;
    private String context;
}
