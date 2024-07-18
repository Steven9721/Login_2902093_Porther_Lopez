package co.sena.edu.login2902093.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.sena.edu.login2902093.R
import co.sena.edu.login2902093.components.NormalTextComponent

@Composable
fun SignUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(28.dp)

    ) {
        NormalTextComponent(value = stringResource(id = R.string.hello))
    } //Surface
} //SignUpScreen


@Preview
@Composable
fun DefaultSignUpScreen() {
    SignUpScreen()
}