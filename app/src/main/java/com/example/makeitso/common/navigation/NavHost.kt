package com.example.makeitso.common.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.makeitso.screens.edit_task.EditTaskScreen
import com.example.makeitso.screens.login.LoginScreen
import com.example.makeitso.screens.sign_up.SignUpScreen
import com.example.makeitso.screens.tasks.TasksScreen

const val LOGIN_SCREEN = "LoginScreen"
const val SIGN_UP_SCREEN = "SignUpScreen"
const val TASKS_SCREEN = "TasksScreen"
const val EDIT_TASK_SCREEN = "EditTaskScreen"

@Composable
fun NavHost(firstScreen: String) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = firstScreen) {
        composable(LOGIN_SCREEN) { LoginScreen(navController) }
        composable(SIGN_UP_SCREEN) { SignUpScreen(navController) }
        composable(TASKS_SCREEN) { TasksScreen(navController) }
        composable(EDIT_TASK_SCREEN) { EditTaskScreen(navController) }
    }
}