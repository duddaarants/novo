package com.example.novo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
 EditText edtUsuario, edtSenha;
 Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

edtUsuario = findViewById(R.id.edtUsuario);
edtSenha = findViewById(R.id.edtSenha);

btnEntrar=findViewById(R.id.btnEntrar);



btnEntrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(),MainActivity2.class));
        finish();

        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);

        startActivity(intent);

        String usuario, senha;

        usuario = edtUsuario.getText().toString();
        senha = edtSenha.getText().toString();

        if (edtUsuario.equals("maria") && edtSenha.equals("etecia")){
            Toast.makeText(getApplicationContext(),
                    "Bem vindo!",
                    Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(getApplicationContext(),
                    "Usuário ou senha inválidos!",
                    Toast.LENGTH_SHORT).show();

            edtUsuario.setText("");
            edtSenha.setText("");
            edtUsuario.requestFocus();
        }

             

        }
});
    }
}




















