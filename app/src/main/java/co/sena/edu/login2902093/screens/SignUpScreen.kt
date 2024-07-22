package co.sena.edu.login2902093.screens

import androidx.compose.foundation.background
<<<<<<< HEAD
import androidx.compose.foundation.layout.Column
=======
>>>>>>> 39eee528ccd42a4954fb8367618593bf32323429
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
<<<<<<< HEAD
import co.sena.edu.login2902093.components.HeadingTextComponent
=======
>>>>>>> 39eee528ccd42a4954fb8367618593bf32323429
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
<<<<<<< HEAD
       Column (modifier= Modifier.fillMaxSize()){
           NormalTextComponent(value = stringResource(id = R.string.hello))
           HeadingTextComponent(value = stringResource(id = R.string.create_account))
       }

=======
        NormalTextComponent(value = stringResource(id = R.string.hello))
>>>>>>> 39eee528ccd42a4954fb8367618593bf32323429
    } //Surface
} //SignUpScreen


@Preview
@Composable
fun DefaultSignUpScreen() {
    SignUpScreen()
}