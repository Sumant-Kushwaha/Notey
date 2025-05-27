package com.amigo.notey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.amigo.firebase.AuthViewModel
import com.amigo.notey.authentication.MyAppNavigation
import com.amigo.notey.screens.NoteAppScreen
import com.amigo.notey.ui.theme.NoteyTheme
import com.amigo.notey.viewmodel.provideNoteViewModel
import kotlin.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val noteViewModel = provideNoteViewModel(this) // ← Clean 1-line init

        val authViewModel: AuthViewModel by viewModels()

        setContent {
            NoteyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyAppNavigation(
                        modifier = Modifier.padding(innerPadding),
                        authViewModel = authViewModel,
                        viewModel = noteViewModel
                    )
                }
            }
        }
    }
}