package com.example.HWJD_Module12_Spring_Boot.repository;

import com.example.HWJD_Module12_Spring_Boot.entities.Note;

import java.util.List;
import java.util.UUID;

public interface NoteDao {
    Note add(Note note);
    void update(Note note);
    Note getById(UUID id);
    List<Note> listAll();
    void deleteById(UUID id);
}