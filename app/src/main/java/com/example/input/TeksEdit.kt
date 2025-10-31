package com.example.input

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
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