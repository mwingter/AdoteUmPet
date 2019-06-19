package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaMenu extends AppCompatActivity {

    private Button MEUS_PETS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        MEUS_PETS = findViewById(R.id.myPetsParaDoar);

        MEUS_PETS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaMenu.this, meusPets.class);
                startActivity(intent);
            }
        });
    }
}
