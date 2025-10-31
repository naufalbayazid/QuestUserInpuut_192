package com.example.input

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.input.ui.theme.InputTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InputTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF7B68EE) // Background ungu seperti di gambar
                ) {
                    FormulirPendaftaran()
                }
            }
        }
    }
}