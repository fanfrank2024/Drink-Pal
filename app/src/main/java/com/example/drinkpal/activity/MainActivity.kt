/*
copyright 2024 - Jun Fan - All rights reserved
*/
package com.example.drinkpal.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.drinkpal.compose.WelcomeScreen
import com.example.drinkpal.ui.theme.DrinkPalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrinkPalTheme {
                WelcomeScreen()
            }
        }
    }
}