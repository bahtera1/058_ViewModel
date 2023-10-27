package com.example.sampleaja.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.sampleaja.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("") //revised
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    var alamat: String by mutableStateOf("")
        private set
    var status: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp:String, jk: String, al: String, st: String){
        namaUsr = nm;
        noTlp = tlp;
        jenisKl = jk;
        alamat = al;
        status= st;
    }

    fun setJenisK(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK)}
    }
}