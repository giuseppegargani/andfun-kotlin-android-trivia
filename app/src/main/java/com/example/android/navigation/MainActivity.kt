/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.ActivityMainBinding

/*TODO - 1 Creare un nuovo frammento
    Si possono anche caricare Fragment anche non blank
 */

/*TODO - 2 Pulisci il frammento lasciando solo la parte onCreateView
 */

/*
TODO - 3
    DOPO AVER CONTROLLATO CHE SI SIA CREATO IL LAYOUT DI BINDING NELLA VIEW IN XML CARICA LA VIEW
    con DataBindingUtil
    val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
    return binding.root
    SE ci dovessero essere problemi di collegamento con la classe appena create fai Invalidate e restart()
 */

/*TODO - 4 Carica il frammento nel layout della Activity
    O dove vuoi che sia caricato
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}
