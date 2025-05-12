package com.amigo.notey.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {


    @Insert
    suspend fun insert(note: Note)

    @Query("Select * from notes_table")
    fun getAllNotes(): LiveData<List<Note>>

    @Query("DELETE FROM notes_table WHERE id = :noteId")
    suspend fun deleteNote(noteId: Int)
}