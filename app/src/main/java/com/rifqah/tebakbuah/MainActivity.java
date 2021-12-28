package com.rifqah.tebakbuah;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_apel, imageView_ceri,
            imageView_alpukat, imageView_strawberry, imageView_semangka, imageView_pisang ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickOK();
    }

    private void onClickOK(){
        imageView_apel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent b = new
                    Intent(MainActivity.this,TebakActivity.class);
                b.putExtra("nama_icon","apel"); startActivity(b);
            }
        });

        imageView_ceri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent c = new
                    Intent(MainActivity.this,TebakActivity.class);
                c.putExtra("nama_icon","ceri"); startActivity(c);
            }
        });

        imageView_alpukat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent d = new
                    Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("nama_icon","alpukat"); startActivity(d);
            }
        });

        imageView_strawberry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent a = new
                    Intent(MainActivity.this,TebakActivity.class);
                a.putExtra("nama_icon","stroberi"); startActivity(a);
            }
        });

        imageView_semangka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent e = new
                    Intent(MainActivity.this,TebakActivity.class);
                e.putExtra("nama_icon","semangka"); startActivity(e);
            }
        });

        imageView_pisang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ Intent al = new
                    Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_icon","pisang"); startActivity(al);
            }
        });
    }
    private void setInisialisasi() {
        imageView_apel= (ImageView)findViewById(R.id.imageView_apel);
        imageView_ceri = (ImageView)findViewById(R.id.imageView_ceri);
        imageView_alpukat = (ImageView)findViewById(R.id.imageView_alpukat);
        imageView_strawberry= (ImageView)findViewById(R.id.imageView_stroberi);
        imageView_semangka= (ImageView)findViewById(R.id.imageView_semangka);
        imageView_pisang = (ImageView)findViewById(R.id.imageView_pisang);
    }

}