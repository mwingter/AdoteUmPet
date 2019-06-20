package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Nome;
    private EditText Senha;
    private Button Entrar;
    private Button Cadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Nome = findViewById(R.id.loginUsuario);
        Senha = findViewById(R.id.loginSenha);
        Entrar = findViewById(R.id.loginBotao);
        Cadastrar = findViewById(R.id.cadastroBotao);

        Entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valida_login(Nome.getText().toString(), Senha.getText().toString());
            }
        });

        Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrar_usuario();
            }
        });

    }

    //funcao que valida o login e senha
    private void valida_login(String usuarioLog, String senhaLog){


        if(usuarioLog.equals("a") && senhaLog.equals("a")){
            Intent intent = new Intent(MainActivity.this, telaMenu.class); //SecondActivity será a pagina que abrirá ao logar
                                                                                // pra adicionar uma nova activity, clicar em com.example.login -> new -> Activity -> empty
            startActivity(intent);
        }
        else{
            System.out.println("Usuário não cadastrado");
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);
            alerta.setTitle("Aviso:");
            alerta.setMessage("Há campos inválidos ou em branco.");
            alerta.setNeutralButton("Ok.", null);
            alerta.show();
        }
    }

    private void cadastrar_usuario(){
        Intent intent = new Intent(MainActivity.this, telaCadastroPessoaFisica.class);
        startActivity(intent);

    }
}
