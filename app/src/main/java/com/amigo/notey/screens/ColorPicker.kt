package com.amigo.notey.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt

@Composable
fun MyColorPicker(
    selectedColor: Color,
    onColorSelected: (Color) -> Unit
) {
    val colorsList = listOf(
        Color("#f59597".toColorInt()),
        Color("#abcdef".toColorInt()),
        Color("#123456".toColorInt()),
        Color("#fedcba".toColorInt()),
        Color("#987654".toColorInt()),
        Color("#34a853".toColorInt()), // Google Green
        Color("#fbbc05".toColorInt()), // Google Yellow
        Color("#ea4335".toColorInt()), // Google Red
        Color("#4285f4".toColorInt()), // Google Blue
        Color("#ff0000".toColorInt()), // Red
        Color("#00ff00".toColorInt()), // Green
        Color("#0000ff".toColorInt()), // Blue
        Color("#ffff00".toColorInt()), // Yellow
        Color("#ff00ff".toColorInt()), // Magenta
        Color("#00ffff".toColorInt()), // Cyan
        Color("#ffffff".toColorInt()), // White
        Color("#000000".toColorInt()), // Black
        Color("#800000".toColorInt()), // Maroon
        Color("#008000".toColorInt()), // Olive
        Color("#000080".toColorInt()), // Navy
        Color("#808000".toColorInt()), // Teal
        Color("#800080".toColorInt()), // Purple
        Color("#008080".toColorInt()), // Gray
        Color("#c0c0c0".toColorInt()), // Silver
        Color("#808080".toColorInt()), // Dark Gray
        Color("#ffa500".toColorInt()), // Orange
        Color("#ffc0cb".toColorInt()), // Pink
        Color("#a52a2a".toColorInt()), // Brown
        Color("#e6e6fa".toColorInt()), // Lavender
    )

    LazyRow(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        items(colorsList) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .padding(4.dp)
                    .clip(CircleShape)
                    .background(it)
                    .border(
                        width = if (it == selectedColor) 4.dp else 0.dp,
                        color = if (it == selectedColor) Color.Black else Color.Transparent,
                        shape = CircleShape
                    )
                    .clickable {
                        onColorSelected(it)
                    }
            )
        }
    }
}