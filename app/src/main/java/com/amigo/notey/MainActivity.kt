package com.amigo.notey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amigo.notey.screens.NoteAppScreen
import com.amigo.notey.ui.theme.NoteyTheme
import com.amigo.notey.viewmodel.provideNoteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val noteViewModel = provideNoteViewModel(this) // ← Clean 1-line init

        setContent {
            NoteyTheme {
                NoteAppScreen(viewModel = noteViewModel)
            }
        }
    }
}