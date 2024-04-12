package com.palazzo.recebimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.palazzo.tela_recebimentos.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listaProduto;
    private ListView listaProduto2;
    private ProdutoListAdapter produtosListAdapter;
    private ProdutoListAdapter produtosListAdapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaProduto = findViewById(R.id.listViewTabela);

        listaProduto2 = findViewById(R.id.listViewTabela2);


        ArrayList<Produto> produtos = new ArrayList<>();
        Produto teste1 = new Produto("Uva", 333, 5);

        Produto teste2 = new Produto("Uva", 4333, 10);



        produtos.add(teste1);

        produtos.add(teste2);

        ArrayList<Produto> produtos2 = new ArrayList<>();
        Produto teste3 = new Produto("Embalagem", 1333, 25);

        produtos2.add(teste3);

        produtosListAdapter = new ProdutoListAdapter(this, produtos);

        produtosListAdapter2 = new ProdutoListAdapter(this, produtos2);

        listaProduto.setAdapter(produtosListAdapter);

        listaProduto2.setAdapter(produtosListAdapter2);

    }
}