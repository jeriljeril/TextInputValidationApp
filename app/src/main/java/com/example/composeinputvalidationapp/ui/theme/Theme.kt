package com.example.composeinputvalidationapp.ui.theme

import androidx.compose.material3.* // Import Material3 components
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

// Define color scheme values
val Purple400 = Color(0xFF6200EE) // Primary color
val Teal300 = Color(0xFF03DAC5)   // Secondary color

@Composable
fun ComposeInputValidationAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Purple400,
            secondary = Teal300
        ),
        typography = Typography, // Use the default Typography from Material3
        content = content
    )
}

@Composable
@Preview(showBackground = true)
fun PreviewTheme() {
    ComposeInputValidationAppTheme {
        // Preview content goes here
    }
}
