package com.amigo.notey.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.amigo.firebase.AuthViewModel
import com.amigo.notey.ui.LogoutFab
import com.amigo.notey.ui.MyFab
import com.amigo.notey.viewmodel.NoteViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NoteAppScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    authViewModel: AuthViewModel,
    viewModel: NoteViewModel
) {
    var showDialog by remember { mutableStateOf(false) }

    DisplayDialog(
        viewModel = viewModel,
        showDialog = showDialog,
        onDismiss = { showDialog = false }
    )

    Scaffold(
        floatingActionButton = {
            Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Bottom) {
                LogoutFab(onClick = { authViewModel.signout() })
                Spacer(modifier = Modifier.height(16.dp))
                MyFab(onClick = { showDialog = true })
            }
        },
    ) {
        val notes by viewModel.allNotes.observeAsState(emptyList())
        DisplayNoteList(
            notes = notes,
            onDeleteNote = { noteId -> viewModel.deleteNote(noteId) },
            navController = navController,
            authViewModel = authViewModel
        )
    }
}
