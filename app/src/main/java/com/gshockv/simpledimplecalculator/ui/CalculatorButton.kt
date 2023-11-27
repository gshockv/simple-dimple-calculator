package com.gshockv.simpledimplecalculator.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class CalculatorOperationSpec(
  val symbol: String,
  val color: ButtonColor,
  val operation: (() -> Unit)
)

enum class ButtonColor {
  MAIN,
  OPERATION,
  EQUAL_OPERATION
}

private fun CalculatorOperationSpec.getTextColor(): Color {
  return when (color) {
    ButtonColor.MAIN -> {
      Color.hsl(0.99f, 0.29f, 0.47f)
    }

    ButtonColor.OPERATION -> Color(0xFF18678d)
    ButtonColor.EQUAL_OPERATION -> Color.White
  }
}

private fun CalculatorOperationSpec.getBackgroundColor(): Color {
  return when (color) {
    ButtonColor.MAIN,
    ButtonColor.OPERATION -> {
      Color.hsl(0.08f, 0.4f, 0.9f)
    }
    ButtonColor.EQUAL_OPERATION -> Color(0xFF18678d)
  }
}

@Composable
fun CalculatorButton(
  spec: CalculatorOperationSpec
) {
  OutlinedButton(
    onClick = spec.operation,
    shape = CircleShape,
    modifier = Modifier.size(84.dp),
    border = BorderStroke(
      1.dp, color = Color.Transparent
    ),
    contentPadding = PaddingValues(16.dp),
    colors = ButtonDefaults.outlinedButtonColors(
      containerColor = spec.getBackgroundColor().copy(alpha = 0.75f)
    )
  ) {
    Text(
      text = spec.symbol,
      color = spec.getTextColor(),
      fontSize = 22.sp,
      fontWeight = FontWeight.Light
    )
  }
}
