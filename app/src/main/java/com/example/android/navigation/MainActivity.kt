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

/*TODO - 1 Controlla la dipendenza
    Ultima dipendenza è
    version_navigation = '1.0.0'
    ____________________________________________________________________________________________
    implementation "android.arch.navigation:navigation-fragment-ktx:$version_navigation"
    implementation "android.arch.navigation:navigation-ui-ktx:$version_navigation"
    ____________________________________________________________________________________________
 */

/* TODO - 2 Aggiungi il NavGraph e dagli il nome di navigation
 */

/*TODO - 3 inserisci il navhost al posto del frammento nella activity principale
        metti come nome "myNavHost
        come name metti "android:name="androidx.navigation.fragment.NavHostFragment"
        come defaultNavHost metti true
 */

/*TODO - 4 Aggiungi il title e il GameFragment al navGraph
 */

/*TODO - 5 Aggiungi il bottone e fai il binding del bottone
        binding.playButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))
        oppure la versione semplificata è:
        Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))
 */

/*TODO - SINTESI:
    La cosa più importante è come collegare con un eventListener su un pulsante delle istruzioni di navigazione
    ma non toglie che gli eventi possano essere anche altri
 */

/*TODO - APPROFONDIMENTI:
    EVENTO DI DRAG: https://developer.android.com/guide/topics/ui/drag-drop

 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
    // TODO (02) Add the Navigation Graph to the Project
    // Right click on the res directory and select New > Android resource file
    // Select Navigation as the resource type and give it the file name navigation
}
