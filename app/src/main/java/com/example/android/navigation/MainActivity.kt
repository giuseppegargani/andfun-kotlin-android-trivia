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

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.ActivityMainBinding

/* TODO - 1 Verifica che la dipendenza per Safe-Args sia stata correttamente scritta
        prima si verifica che sia corretta la versione di safe-args nella build Gradle per il progetto
        "android.arch.navigation:navigation-safe-args-gradle-plugin:$version_navigation"
        e poi aggiungi il plugin nella build Gradle di App:
        apply plugin: 'kotlin-kapt'
        apply plugin: 'androidx.navigation.safeargs'
 */

/*TODO - 2 Sostituisci le righe di codice di navigazione tra frammenti con le corrispondenti istruzioni con SafeArgs
    Sia in Game-fragment che in Game-Over
    view.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGameWonFragment())
 */

/*TODO - 3 Nel frammento di destinazione inserisci i parametri desiderati per il controllo
    in questo caso il frammento di destinazione è gameWon e perciò si vanno ad inserire lì
    Si inseriscono da NavGraph
    Si può verificare il nome dei parametri non è importante?!?!?!?
 */

/* TODO - 4 Inseriamo i parametri all'interno della istruzione di navigazione
    view.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGameWonFragment(numQuestions, questionIndex))
 */

/*TODO - 5 Utilizza i parametri passati in Safe-args per lanciare un Toast con un messaggio
    val args = GameWonFragmentArgs.fromBundle(arguments!!)
    Toast.makeText(context, "NumCorrect: ${args.numCorrect}, NumQuestions: ${args.numQuestions}", Toast.LENGTH_LONG).show()
 */

/*TODO - 6 Correggi NavDirections in qualsiasi azione di navigazione

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }
}
