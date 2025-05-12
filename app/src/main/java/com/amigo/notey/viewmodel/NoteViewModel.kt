package com.amigo.notey.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amigo.notey.repository.NotesRepository
import com.amigo.notey.roomdb.Note
import kotlinx.coroutines.launch

class NoteViewModel(private val repository: NotesRepository) : ViewModel() {

    val allNotes: LiveData<List<Note>> = repository.allNotes

    fun insertNote(note: Note) = viewModelScope.launch {
        repository.insertNote(note)
    }
}