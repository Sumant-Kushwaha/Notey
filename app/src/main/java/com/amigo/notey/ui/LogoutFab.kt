package com.amigo.notey.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun LogoutFab(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = onClick,
        containerColor = Color.Red,
        contentColor = Color.White
    ) {
        Icon(Icons.AutoMirrored.Filled.ExitToApp, contentDescription = "Logout")
    }
}
