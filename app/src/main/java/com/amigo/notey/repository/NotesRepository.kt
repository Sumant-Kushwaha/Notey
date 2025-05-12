// Repository that combine data from local and online sources

package com.amigo.notey.repository

import androidx.lifecycle.LiveData
import com.amigo.notey.roomdb.Note
import com.amigo.notey.roomdb.NoteDao

class NotesRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insertNote(note: Note) {
        return noteDao.insert(note)
    }

    suspend fun deleteNote(noteId: Int) {
        return noteDao.deleteNote(noteId)
    }
}
