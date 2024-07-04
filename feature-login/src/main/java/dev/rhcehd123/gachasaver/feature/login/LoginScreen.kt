package dev.rhcehd123.gachasaver.feature.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import dev.rhcehd123.gachasaver.core.designsystem.theme.GachaSaverTheme

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel()
) {

    LoginScreen(
        onClickLogin = viewModel::onClickLogin,
    )
}

@Composable
private fun LoginScreen(
    onClickLogin: (String, String) -> Unit,

) {
    var id by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column {
        GachaSaverTextField(
            value = id,
            onValueChange = {
                id = it
            },
            label = "아이디"
        )
        GachaSaverTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = "비밀번호"
        )
        Button(
            onClick = {
                onClickLogin(id, password)
            }
        ) {
            Text(
                text = "로그인"
            )
        }
    }
}

@Composable
fun GachaSaverTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "",
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label
            )
        },
        singleLine = true
    )
}

@Composable
@Preview
fun LoginScreenPreview() {
    GachaSaverTheme {
        LoginScreen(
            onClickLogin = { _, _ -> }
        )
    }
}