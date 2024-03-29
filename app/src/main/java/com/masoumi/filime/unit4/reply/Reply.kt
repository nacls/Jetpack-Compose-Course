/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.masoumi.filime.unit4.reply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.masoumi.filime.ui.theme.FilimeTheme
import com.masoumi.filime.unit4.reply.ui.ReplyApp

/**
 * Activity for Reply app
 */
class Reply : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FilimeTheme {
                val windowSize = calculateWindowSizeClass(this)
                ReplyApp(windowSize = windowSize.widthSizeClass)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReplyAppPreview() {
    FilimeTheme {
        ReplyApp(windowSize = WindowWidthSizeClass.Compact)
    }
}

@Preview(showBackground = true, widthDp = 700)
@Composable
fun ReplyAppMediumPreview() {
    FilimeTheme {
        ReplyApp(windowSize = WindowWidthSizeClass.Medium)
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun ReplyAppExpandedPreview() {
    FilimeTheme {
        ReplyApp(windowSize = WindowWidthSizeClass.Expanded)
    }
}