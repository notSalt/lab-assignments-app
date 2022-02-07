package com.example.makeitso.screens.tasks

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.makeitso.common.composable.ActionToolbar
import com.example.makeitso.common.navigation.EDIT_TASK_SCREEN
import com.example.makeitso.R.drawable as AppIcon
import com.example.makeitso.R.string as AppText
import com.example.makeitso.theme.BrightOrange

@Composable
fun TasksScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        ActionToolbar(
            title = AppText.tasks,
            endActionIcon = AppIcon.ic_exit,
            endAction = {} //Call ViewModel (clear database, clear backstack, back to login)
        )

        Spacer(modifier = Modifier.fillMaxWidth().height(8.dp))

        Scaffold(floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(EDIT_TASK_SCREEN) },
                backgroundColor = BrightOrange,
                contentColor = Color.White,
                modifier = Modifier.padding(16.dp)
            ){
                Icon(Icons.Filled.Add,"Add")
            }
        }) {
//            LazyColumn {
//                items(state.tasks) { task ->
//                    TaskItem(
//                        task = task,
//                        onChecked = { /* Call ViewModel */ },
//                        onEdit = { /* Call ViewModel */ }
//                    )
//                }
//            }
        }
    }
}
