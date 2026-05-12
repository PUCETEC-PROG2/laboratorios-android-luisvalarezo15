package ec.edu.puce.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ec.edu.puce.githubclient.ui.components.RepoItem


@Composable
fun RepoList() {

    Column(
        modifier = Modifier
            .padding(horizontal = 4.dp, vertical = 5.dp)
    ) {

        RepoItem(
            name = "Repositorio de Luis",
            description = "Mi aplicación de prueba",
            avatarImg = "https://avatars.githubusercontent.com/u/9919?v=4",
            language = "Kotlin"
        )

        RepoItem(
            name = "Repositorio de Luis",
            description = "Mi aplicación de prueba",
            avatarImg = "https://avatars.githubusercontent.com/u/9919?v=4",
            language = "Kotlin"
        )

        RepoItem(
            name = "Repositorio de Luis",
            description = "Mi aplicación de prueba",
            avatarImg = "https://avatars.githubusercontent.com/u/9919?v=4",
            language = "Kotlin"
        )
    }
}

@Preview(showBackground =true)
@Composable
fun RepoListPreview(){
    RepoList()
}