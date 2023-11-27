package com.gshockv.simpledimplecalculator.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.gshockv.simpledimplecalculator.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppToolBar() {
  TopAppBar(
    title = {
      Text(text = stringResource(id = R.string.main_screen_title))
    },
    actions = {
      IconButton(
        onClick = { /*TODO*/ }
      ) {
        Icon(imageVector = Icons.Outlined.Info, contentDescription = "App Info")
      }
    },
//    colors = TopAppBarDefaults.smallTopAppBarColors(
//      containerColor = MaterialTheme.colorScheme.primary,
//      titleContentColor = MaterialTheme.colorScheme.onPrimary
//    )
  )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showSystemUi = true)
fun PreviewAppToolBar() {
  Scaffold(
    topBar = {
      AppToolBar()
    }
  ) {
    Surface(
      modifier = Modifier.padding(it),
    ) {

    }
  }
}
