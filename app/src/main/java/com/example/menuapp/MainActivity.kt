package com.example.menuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import com.example.menuapp.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        supportActionBar?.title = "Main Menu"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)

        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //if(item.itemId == android.R.id.home)
        //{

        //}
        when(item.itemId)
        {
            android.R.id.home -> finish()
            R.id.mOpen -> {
                showToast(1, "Open File")
            }

            R.id.mClose -> {
                showToast(1, "Close File")
            }

            R.id.mSave -> {
                showToast(1, "Save File")
            }
        }
        return true
    }

    fun showToast(id: Int, text:String){
        var toast:Toast
        var image: ImageView
        when(id){
            1 -> {
                Toast.makeText(this, text, Toast.LENGTH_LONG).show()
            }

            2-> {
                toast = Toast.makeText(this, text, Toast.LENGTH_LONG)
                toast.setGravity(Gravity.CENTER, 1, 30)
                toast.show()
            }
        }
    }

}