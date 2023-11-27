package com.gshockv.simpledimplecalculator.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calculator() {
  Scaffold(
    topBar = { AppToolBar() }
  ) { contentPadding ->
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(contentPadding)
        .padding(all = 4.dp),
      verticalArrangement = Arrangement.Bottom
    ) {
      DisplayView(valueToDisplay = "12345678")
      Divider(
        modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 8.dp)
      )
      CalculatorControls()
    }
  }
}

@Composable
@Preview(showSystemUi = true)
fun PreviewCalculator() {
  Calculator()
}
