package com.anugrah.prj3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Halaman2 extends AppCompatActivity {
    @BindView(R.id.txrnama)
    TextView txtnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        ButterKnife.bind(this);

        Intent i = getIntent();
        String nama = i.getStringExtra("nama");
        txtnama.setText(nama);
    }
}