package com.amigo.notey.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.amigo.notey.repository.NotesRepository
import com.amigo.notey.roomdb.NotesDB

class NoteViewModelFactory(private val repository: NotesRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(NoteViewModel::class.java)) {

            @file:Suppress("UNCHECKED_CAST")
            return NoteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }
}


fun provideNoteViewModel(context: Context): NoteViewModel {
    val database = NotesDB.getInstance(context)
    val repository = NotesRepository(database.notesDao)
    val factory = NoteViewModelFactory(repository)
    return ViewModelProvider(context as ViewModelStoreOwner, factory)
        .get(NoteViewModel::class.java)

}