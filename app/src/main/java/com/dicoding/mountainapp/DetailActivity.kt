package com.dicoding.mountainapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.CollapsingToolbarLayout

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val MOUNTAIN_NAME = "name"
        const val MOUNTAIN_IMG = "img"
        const val MOUNTAIN_DETAIL = "detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(findViewById(R.id.toolbar_detail))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val imgDetail: ImageView = findViewById(R.id.img_detail)
        val btnSrchGmaps: Button = findViewById(R.id.btn_srch_gmaps)
        val titleDetail: CollapsingToolbarLayout = findViewById(R.id.title_detail)

        titleDetail.title = intent.getStringExtra(MOUNTAIN_NAME)

        tvName.text = intent.getStringExtra(MOUNTAIN_NAME)
        tvDetail.text = intent.getStringExtra(MOUNTAIN_DETAIL)
        imgDetail.setImageResource(intent.getIntExtra(MOUNTAIN_IMG, 0))
        btnSrchGmaps.setOnClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_srch_gmaps -> {
                val mapIntent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("geo:0,0?q=${intent.getStringExtra(MOUNTAIN_NAME)}"))
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }
        }
    }
}