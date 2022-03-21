package com.byandev.meclock.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.byandev.meclock.R

@Composable
fun AlarmScreen() {
    val iconAdd : Painter = painterResource(id = R.drawable.ic_baseline_add_24)
    val iconMore : Painter = painterResource(id = R.drawable.ic_baseline_more_vert_24)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(MaterialTheme.colors.onPrimary)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(14.dp)
        ) {
            Text(
                text = "Alarm",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left,
                fontSize = 24.sp,
                modifier = Modifier
                    .weight(1f)


            )
            IconButton(
                modifier = Modifier.then(Modifier.size(24.dp)),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = iconAdd,
                    contentDescription = "Add Alarm"
                )
            }
            Spacer(modifier = Modifier.size(8.dp))
            IconButton(
                modifier = Modifier.then(Modifier.size(24.dp)),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = iconMore,
                    contentDescription = "Add Alarm"
                )
            }

        }
    }

}

@Preview
@Composable
fun PreviewAlarmScreen() {
    AlarmScreen()
}