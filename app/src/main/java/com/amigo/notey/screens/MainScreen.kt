package com.amigo.notey.screens

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.amigo.notey.ui.MyFab
import com.amigo.notey.viewmodel.NoteViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NoteAppScreen(viewModel: NoteViewModel) {
    var showDialog by remember { mutableStateOf(false) }

    DisplayDialog(
        viewModel = viewModel,
        showDialog = showDialog,
        onDismiss = { showDialog = false }
    )

    Scaffold(
        floatingActionButton = {
            MyFab(onClick = { showDialog = true })
        }
    ) {
        val notes by viewModel.allNotes.observeAsState(emptyList())
        DisplayNoteList(
            notes = notes,
            onDeleteNote = { noteId -> viewModel.deleteNote(noteId) }
        )
    }
}
