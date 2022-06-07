package com.example.mcgeesample.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mcgeesample.theme.McGeeSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            McGeeSampleTheme {
                MainScreen(message = "Hello World")
            }
        }
    }
}

@Composable
fun MainScreen(message: String) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Magenta)
                .weight(3f)
        ) {
            Text(
                text = message,
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = "0", onValueChange = {},
            modifier = Modifier
                .padding(4.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.weight(1f)) {
            Button(
                onClick = { },
                modifier = Modifier
                    .padding(4.dp)
                    .weight(1f)
            ) {
                Text(text = "Increase")
            }

            Button(
                onClick = { },
                modifier = Modifier
                    .padding(4.dp)
                    .weight(1f)
            ) {
                Text(text = "Decrease")
            }
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen("Hi")
}