package com.cis.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.*

  class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button next =(Button)clearFindViewById(R.id.bt);
        next.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View V ) {
                Intent i =new Intent(MainActivity.this ,Main2Activity.class);
                startActivity(i)
            }
        }


        )




    }



}
