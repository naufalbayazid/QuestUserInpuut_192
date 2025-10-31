package com.example.input

import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable

fun FormDataDiri(modifier: Modifier)
({
    //variabel-variabel untuk mengingat nilai masukan dari keyboard

    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    // variabel variabel untuk menyimpan data yang diperoleh dari komponen ui

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }

    val gender:List<String> = listOf("laki-laki", "Perempuan")
}

Column(modifier = Modifier.padding(top= 50.dp),
        verticalArrangement = Arrangement.Top,

        horizontalAligment = Aligment.Top,
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),

            label = {Text(text = "Nama Lengkap") },

            onValueChange = {
                textNama = it
            }
        )

        Row{

            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,

                    onClick = {textJK = item }
                ), verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = textJK == item,

                        onClick = {
                            textJK == item
                        }}
                        Text(item)

            }
}


}
OutlinedTextField(
    value = textAlamat,
    singleLine = true,
    modifier = Modifier.width(250.dp),

    label = { Text(text = "Alamat Lengkap")},

    onValueChange = {
        textAlamat = it
    }
)

Divider(
    modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium), top = dimensionResource(
        id = R.dimen.padding_medium
    )),
    thicknes = dimensionResource(R.dimen.divider_tipis),
    color = Color.DarkGray
)
Button(
    modifier = modifier.fillMaxWidth(if),
    // the button is ennabled
    enabled = textAlamat.isNotEmpty(),

    onClick = {
        nama=textNama
        jenis=textJK
        alamat=textAlamat
    }
)   {

}
