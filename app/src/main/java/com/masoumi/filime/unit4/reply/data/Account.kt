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

package com.masoumi.filime.unit4.reply.data

import androidx.annotation.DrawableRes

/**
 * A class which represents an account
 */
data class Account(
    /** Unique ID of a user **/
    val id: Int,
    /** User's first name **/
    val firstName: String,
    /** User's last name **/
    val lastName: String,
    /** User's email address **/
    val email: String,
    /** User's avatar image resource id **/
    @DrawableRes val avatar: Int
) {
    /** User's full name **/
    val fullName: String = "$firstName $lastName"
}
