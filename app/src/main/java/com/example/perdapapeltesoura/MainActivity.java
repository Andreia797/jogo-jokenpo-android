package com.example.perdapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view) {
        this.opcaoSelecionado("pedra");
    }

    public void selecionarPapel(View view) {
        this.opcaoSelecionado("papel");
    }

    public void selecionarTesoura(View view) {
        this.opcaoSelecionado("tesoura");
    }

    public void opcaoSelecionado(String opcaoSelecionado) {

        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultdo);


        int numero = new Random().nextInt(3); //0 1 2
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp) {
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra2);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel2);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura2);
                break;
        }

        if ((opcaoApp == "tesoura" && opcaoSelecionado == "papel") ||
                (opcaoApp == "papel" && opcaoSelecionado == "pedra") ||
                (opcaoApp == "pedra" && opcaoSelecionado == "tesoura")) {

            textResultado.setText("Voce perdeu :( ");

        } else if ((opcaoSelecionado == "tesoura" && opcaoApp == "papel") ||
                (opcaoSelecionado == "papel" && opcaoApp == "pedra") ||
                (opcaoSelecionado == "pedra" && opcaoApp == "tesoura")) {

            textResultado.setText("Voce venceu :D ");

        } else {

            textResultado.setText("Empatamos ;)");

        }

    }

}