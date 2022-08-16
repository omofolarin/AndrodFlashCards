package com.example.flashcards.ui.collections

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CollectionCard(label: String, summary: String, isPinned: Boolean) {
    Card(backgroundColor = Color.White, modifier = Modifier.defaultMinSize(minHeight = 100.dp, minWidth = 80.dp)) {
       IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Star, contentDescription = "is pinned", modifier = Modifier.size(20.dp))

       }

        Column(Modifier.padding(4.dp)) {
            Text(text = label)
            Text(text = summary, fontSize =8.sp)
        }

    }
}

@Preview(name="Flashcard collection")
@Composable
private  fun CollectionCardPreview() {
    CollectionCard(label = "Collection name", summary = "", isPinned = false)
}