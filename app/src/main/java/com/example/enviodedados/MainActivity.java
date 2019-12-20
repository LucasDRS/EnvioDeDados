package com.example.enviodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText Nome;
    public EditText Email;
    public EditText Data;
    public EditText Telefone;
    public EditText Mensagem;
    public EditText Senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Enviar(View view){
        Nome = findViewById(R.id.Nome);
        Email = findViewById(R.id.Senha);
        Data = findViewById(R.id.Data);
        Telefone = findViewById(R.id.Telefone);
        Mensagem = findViewById(R.id.Mensagem);
        Senha = findViewById(R.id.Senha);

        String nomeTexto = Nome.getText().toString();
        String emailTexto = Email.getText().toString();
        String dataTexto = Data.getText().toString();
        String telefoneTexto = Telefone.getText().toString();
        String mensagemTexto = Mensagem.getText().toString();
        String senhaTexto = Senha.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("nome", nomeTexto);
        intent.putExtra("email", emailTexto);
        intent.putExtra("data", dataTexto);
        intent.putExtra("telefone", telefoneTexto);
        intent.putExtra("mensagem",mensagemTexto);
        intent.putExtra("senha", senhaTexto);
        startActivity(intent);
    }
}
