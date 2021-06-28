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

/*TODO - 1 Si verifica che esiste il menù (icona) per nel caso di vittoria
    Si deve verificare anche la presenza della icona
    e che abbia anche ShowAsAction = "ifRoom"
 */

/*TODO - 2 SI IMPOSTA LA PRESENZA DEL MENU'
      setHasOptionsMenu(true) e deve andare dentro onCreate
 */

/* TODO - 3 Creare il menù
    si deve fare override di onCreateOptionsMenu e si fà inflater del menù desiderato
    // Showing the Share Menu Item Dynamically
    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.winner_menu, menu)
        // check if the activity resolves
        if (null == getShareIntent().resolveActivity(activity!!.packageManager)) {
       // hide the menu item if it doesn't resolve
       menu?.findItem(R.id.share)?.setVisible(false)
        }
    }
 */

/*TODO - 4 Si crea la funzione getShareIntent() e si inizializza args con bundle da gameWon, intento SEND, stringa apposita
    private fun getShareIntent() : Intent {
        val args = GameWonFragmentArgs.fromBundle(arguments)
        val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.setType("text/plain")
                .putExtra(Intent.EXTRA_TEXT, getString(R.string.share_success_text, args.numCorrect, args.numQuestions))
    return shareIntent
    }
 */

/*TODO - 5 Si crea la funzione che materialmente lancia l'intento (shareSuccess()) (e ha come argomento una funzione di callback per intento)
    startActivity(getShareIntent())

 */

/*TODO - 6 Si impostano le opzioni del menù
    e che lancia la funzione shareSuccess()
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    when (item!!.itemId) {
       R.id.share -> shareSuccess()
   }
    return super.onOptionsItemSelected(item)
    }
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
