package com.dokar.chiptextfield.material3

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ContentAlpha
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dokar.chiptextfield.common.ChipStyle
import com.dokar.chiptextfield.common.DefaultChipStyle


object ChipTextFieldDefaults {
    @Composable
    fun chipStyle(
        shape: Shape = CircleShape,
        cursorColor: Color = MaterialTheme.colorScheme.primary,
        focusedBorderWidth: Dp = 1.dp,
        unfocusedBorderWidth: Dp = 1.dp,
        disabledBorderWidth: Dp = 1.dp,
        focusedBorderColor: Color = MaterialTheme.colorScheme.onBackground,
        unfocusedBorderColor: Color = focusedBorderColor,
        disabledBorderColor: Color = focusedBorderColor.copy(alpha = ContentAlpha.disabled),
        focusedTextColor: Color = MaterialTheme.colorScheme.onBackground,
        unfocusedTextColor: Color = focusedTextColor,
        disabledTextColor: Color = focusedTextColor.copy(alpha = ContentAlpha.disabled),
        focusedBackgroundColor: Color = Color.Transparent,
        unfocusedBackgroundColor: Color = focusedBackgroundColor,
        disabledBackgroundColor: Color = focusedBackgroundColor,
    ): ChipStyle {
        return DefaultChipStyle(
            shape = shape,
            cursorColor = cursorColor,
            focusedBorderWidth = focusedBorderWidth,
            unfocusedBorderWidth = unfocusedBorderWidth,
            disabledBorderWidth = disabledBorderWidth,
            focusedBorderColor = focusedBorderColor,
            unfocusedBorderColor = unfocusedBorderColor,
            disabledBorderColor = disabledBorderColor,
            focusedTextColor = focusedTextColor,
            unfocusedTextColor = unfocusedTextColor,
            disabledTextColor = disabledTextColor,
            focusedBackgroundColor = focusedBackgroundColor,
            unfocusedBackgroundColor = unfocusedBackgroundColor,
            disabledBackgroundColor = disabledBackgroundColor,
        )
    }
}
