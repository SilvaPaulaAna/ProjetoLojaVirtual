package com.example.projetolojavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logar(View v){

        EditText tusuario = (EditText) findViewById(R.id.edtTextUsuario);
        EditText tsenha = (EditText) findViewById(R.id.edtTextSenha);

        String usuario = tusuario.getText().toString();
        String senha = tsenha.getText().toString();

        if(usuario.equals("admin") && senha.equals("admin")){
            alert("Login realizado com sucesso!");
        }
        else{
            alert("Usuário ou senha incorretos");
        }

    }
    public void alert(String s){
        Toast.makeText(this, "s", Toast.LENGTH_SHORT).show();
    }

}