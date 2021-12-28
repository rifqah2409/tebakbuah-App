package com.rifqah.tebakbuah;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {

    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;
    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        setInitalisasi();
        cekIntent();
        onClickSip();
    }

    private void onClickSip() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if
                (editText_jawabb.getText().toString().equals(jawaban)){
                    Toast.makeText(TebakActivity.this,
                            "Yeay! Jawaban kamu benar",Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(TebakActivity.this,"Yahh jawaban kamu salah.. ayo coba lagi",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() { Intent cek = getIntent(); String nama_icon =
            cek.getStringExtra("nama_icon");

        if (nama_icon.equals("apel")){

            imageView_tebak.setImageResource(R.drawable.apel); jawaban = "apel";

        } else if (nama_icon.equals("ceri")){

            imageView_tebak.setImageResource(R.drawable.ceri); jawaban = "ceri";
        } else if (nama_icon.equals("alpukat")){

            imageView_tebak.setImageResource(R.drawable.alpukat); jawaban = "alpukat";
        } else if (nama_icon.equals("stroberi")){

            imageView_tebak.setImageResource(R.drawable.strawberry); jawaban = "stroberi";
        } else if (nama_icon.equals("semangka")){

            imageView_tebak.setImageResource(R.drawable.semangka); jawaban = "semangka";
        } else {

            imageView_tebak.setImageResource(R.drawable.pisang); jawaban = "pisang";
        }

    }

    private void setInitalisasi() {
        imageView_tebak = (ImageView)findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText)findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);
    }
}