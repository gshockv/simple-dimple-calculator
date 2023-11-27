package com.gshockv.simpledimplecalculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gshockv.simpledimplecalculator.ui.theme.DisplayBackground

@Composable
fun DisplayView(valueToDisplay: String) {
  Text(
    text = valueToDisplay,
    textAlign = TextAlign.End,
    modifier = Modifier
      .fillMaxWidth()
      .background(color = DisplayBackground)
      .border(
        width = 1.dp,
        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
        shape = RoundedCornerShape(4.dp)
      )
      .padding(vertical = 32.dp, horizontal = 8.dp),
    fontWeight = FontWeight.Light,
    fontSize = 64.sp,
    maxLines = 1
  )
}

@Composable
@Preview
fun PreviewDisplay() {
  DisplayView(valueToDisplay = "12345670+")
}
