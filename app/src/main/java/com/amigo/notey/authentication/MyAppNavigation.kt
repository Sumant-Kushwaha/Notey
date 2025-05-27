package com.amigo.notey.authentication

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.amigo.firebase.AuthViewModel
import com.amigo.notey.authentication.pages.LoginPage
import com.amigo.notey.authentication.pages.SignUpPage
import com.amigo.notey.screens.NoteAppScreen
import com.amigo.notey.viewmodel.NoteViewModel


@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel,viewModel: NoteViewModel) {
    val navController=rememberNavController()

    NavHost(navController=navController,startDestination="login",builder={
        composable ("login"){
            LoginPage(modifier,navController,authViewModel)
        }
        composable ("signup"){
            SignUpPage(modifier,navController,authViewModel)
        }
        composable ("home"){
            NoteAppScreen(modifier,navController,authViewModel,viewModel)
        }
    })
}