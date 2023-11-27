package com.gshockv.simpledimplecalculator.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorControls() {
  val operations = calculatorOperations()

  Column(
    modifier = Modifier
      .padding(8.dp)
      .fillMaxSize(),
    verticalArrangement = Arrangement.Bottom,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    operations.map {
      CalculatorRow(it)
    }
  }
}

@Composable
fun CalculatorRow(operations: List<CalculatorOperationSpec>) {
  Row(
    modifier = Modifier
      .padding(4.dp)
      .fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceAround
  ) {
    operations.map { buttonSpec ->
      CalculatorButton(buttonSpec)
    }
  }
}

private fun calculatorOperations() = listOf(
  listOf(
    CalculatorOperationSpec("CE", ButtonColor.MAIN) {},
    CalculatorOperationSpec("(", ButtonColor.OPERATION) {},
    CalculatorOperationSpec(")", ButtonColor.OPERATION) {},
    CalculatorOperationSpec("/", ButtonColor.OPERATION) {}
  ),
  listOf(
    CalculatorOperationSpec("7", ButtonColor.MAIN) {},
    CalculatorOperationSpec("8", ButtonColor.MAIN) {},
    CalculatorOperationSpec("9", ButtonColor.MAIN) {},
    CalculatorOperationSpec("X", ButtonColor.OPERATION) {}
  ),
  listOf(
    CalculatorOperationSpec("4", ButtonColor.MAIN) {},
    CalculatorOperationSpec("5", ButtonColor.MAIN) {},
    CalculatorOperationSpec("6", ButtonColor.MAIN) {},
    CalculatorOperationSpec("-", ButtonColor.OPERATION) {}
  ),
  listOf(
    CalculatorOperationSpec("1", ButtonColor.MAIN) {},
    CalculatorOperationSpec("2", ButtonColor.MAIN) {},
    CalculatorOperationSpec("3", ButtonColor.MAIN) {},
    CalculatorOperationSpec("+", ButtonColor.OPERATION) {}
  ),
  listOf(
    CalculatorOperationSpec("0", ButtonColor.MAIN) {},
    CalculatorOperationSpec(".", ButtonColor.MAIN) {},
    CalculatorOperationSpec("Del", ButtonColor.OPERATION) {},
    CalculatorOperationSpec("=", ButtonColor.EQUAL_OPERATION) {}
  )
)

@Composable
@Preview(showSystemUi = true)
fun PreviewCalculatorControls() {
  CalculatorControls()
}
