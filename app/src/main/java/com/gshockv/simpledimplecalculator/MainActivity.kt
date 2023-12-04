package com.gshockv.simpledimplecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gshockv.simpledimplecalculator.ui.Calculator
import com.gshockv.simpledimplecalculator.ui.theme.SimpleDimpleCalcTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  val viewModel: CalculatorViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      SimpleDimpleCalcTheme {
        Calculator(viewModel)
      }
    }
  }
}

@Composable
@Preview(showBackground = true)
fun PreviewApp() {
  SimpleDimpleCalcTheme {
    Calculator(CalculatorViewModel())
  }
}
