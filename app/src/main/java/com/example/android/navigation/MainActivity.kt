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
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.ActivityMainBinding

/*TODO - 1 Aggiungi il frammento con le regole dentro il NavGraph
 */
/*TODO - 2 Crea il menù per il cassetto laterale (navdrawer_menu) - rules e about (che ha come icona android)
 */
/*TODO - 3 Aggiungi il cassetto nel Layout
    Si mette nel layout principale (ma credo si possa mettere dove si vuole)
    e dove c'è il NavHostFragment!!!!!!
 */
/*TODO - 4 Aggiungi la NavigationView in fondo all DrawerLayout
 */
/*TODO - 5 in Main Activity si inizializzano le variabili DrawerLayout e AppBarConfiguration
        e il DrawerLayout si inizializza con le la variabile binding di drawerLayout
 */
/*TODO - 6 Aggiungi il DrawerLayout come terzo parametro di setupActionBarWithNavController
    Si deve anche dichiarare e inizializzare una variabile con NavController
 */

/*TODO - 7 Crea una appBarConfiguration
    Che abbia come parametri il navController.graph e il drawerLayout
 */

/*TODO - 8  Aggancia il NavigatioUI con la navigationView
 */

/*TODO - 9 Fai override di onSupportNavigateUp
    override fun onSupportNavigateUp(): Boolean {
    val navController = this.findNavController(R.id.myNavHostFragment)
    return NavigationUI.navigateUp(drawerLayout, navController)
    }
 */
/*TODO - 10 Metti Header
    app:headerLayout="@layout/nav_header"
 */


class MainActivity : AppCompatActivity() {
    // TODO (05) Add private lateinit vars drawerLayout and appBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        // TODO (06) Initialize drawerLayout var from binding

        val navController = this.findNavController(R.id.myNavHostFragment)
        // TODO (07) Add the DrawerLayout as the second parameter to setupActionBarWithNavController
        NavigationUI.setupActionBarWithNavController(this, navController)
        // TODO (08) Create appBarConfiguration with the navController.graph and drawerLayout
        // TODO (09) Hook the navigation UI up to the navigation view. (navView)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        // TODO (10) Replace navController.navigateUp with NavigationUI.navigateUp with drawerLayout param
        return navController.navigateUp()
    }
}
