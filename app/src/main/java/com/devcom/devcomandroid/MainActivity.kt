package com.devcom.devcomandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devcom.devcomandroid.ui.theme.DevcomAndroidTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      DevcomAndroidTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          Column(
            modifier = Modifier.padding(16.dp)
          ) {
            Logo()
            HeroText()
            Button(
              modifier = Modifier.fillMaxWidth(),
              colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3A3637)),
              onClick = {
                Log.d("TEST", "Button about us clicked")
              }
            ) {
              Text("About Us", color = Color(0xFFFFD51E))
            }
          }
        }
      }
    }
  }
}

@Composable
fun Logo() {
  Image(
    painter = painterResource(id = R.drawable.logo_devcom),
    contentDescription = null,
    modifier = Modifier.padding(48.dp)
      .padding(bottom = 32.dp)
      .size(266.dp),
  )
}

@Composable
fun HeroText() {
  Column(
    modifier = Modifier.fillMaxWidth().padding(bottom = 66.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Text("Devcom 2023", fontSize = 28.sp, fontWeight = FontWeight.Bold)
    Text(
      "Developer Community\n" +
        "Himatif FMIPA Unpad"
    )
  }
}