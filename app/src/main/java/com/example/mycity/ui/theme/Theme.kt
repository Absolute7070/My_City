package com.example.mycity.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


/*{ Todo:  change appropriate color }*/
private val DarkColorPalette = darkColors(
)

private val LightColorPalette = lightColors(
    primary = md_theme_light_primary,
    surface = md_theme_light_surface,
    background = md_theme_light_background,
    secondary = md_theme_light_secondary,
    onSurface = md_theme_light_onSurface,
    onPrimary = md_theme_light_onPrimary

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MyCityTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}