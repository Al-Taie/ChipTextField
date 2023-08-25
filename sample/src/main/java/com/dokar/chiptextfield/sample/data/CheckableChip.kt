package com.dokar.chiptextfield.sample.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.dokar.chiptextfield.common.Chip

class CheckableChip(text: String, isChecked: Boolean = false) : Chip(text) {
    var isChecked by mutableStateOf(isChecked)
}
