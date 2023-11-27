package com.gshockv.simpledimplecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gshockv.simpledimplecalculator.ui.Calculator
import com.gshockv.simpledimplecalculator.ui.theme.SimpleDimpleCalcTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      SimpleDimpleCalcTheme {
        Calculator()
      }
    }
  }
}

@Composable
@Preview(showBackground = true)
fun PreviewApp() {
  SimpleDimpleCalcTheme {
    Calculator()
  }
}
