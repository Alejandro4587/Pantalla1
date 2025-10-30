package com.izv.pantalla3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    PantallaCuadrantes()
                }
            }
        }
    }
}

@Composable
fun PantallaCuadrantes() {

    Column(Modifier.fillMaxSize()) {

        Row(Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
        ) {
            CajasTexto(
                titulo = "Text composable",
                descripcion = "Displays text and follows the recommended Material Design guidelines.",
                colorDeFondo = Color(0xFFEADDFF),
                modifier = Modifier.fillMaxWidth(0.5f)
            )
            CajasTexto(
                titulo = "Image composable",
                descripcion = "Creates a composable that lays out and draws a given Painter class object",
                colorDeFondo = Color(0xFFD0BCFF),
                modifier = Modifier.fillMaxWidth()
            )
        }

        Row(Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        ) {
            CajasTexto(
                titulo = "Row composable",
                descripcion = "A layout composable that places its children in a horizontal sequence.",
                colorDeFondo = Color(0xFFB69DF8),
                modifier = Modifier.fillMaxWidth(0.5f)
            )
            CajasTexto(
                titulo = "Column composable",
                descripcion = "A layout composable that places its children in a vertical sequence.",
                colorDeFondo = Color(0xFFF6EDFF),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun CajasTexto(
    titulo: String,
    descripcion: String,
    colorDeFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(colorDeFondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = descripcion,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaCajas() {
    PantallaCuadrantes()
}