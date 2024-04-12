package com.palazzo.recebimentos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.palazzo.tela_recebimentos.R;

import java.util.ArrayList;

public class ProdutoListAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<Produto> produtos;

    public ProdutoListAdapter(Context context, ArrayList<Produto> produtos) {
        this.context = context;
        this.produtos = produtos;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int i) {
        return produtos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.list_produtos, viewGroup, false);

        }

        TextView name = view.findViewById(R.id.textViewName);
        name.setText(produtos.get(i).getName());

        TextView lote = view.findViewById(R.id.textViewLote);
        lote.setText(String.valueOf(produtos.get(i).getLote()));

        TextView qtd = view.findViewById(R.id.textViewQtd);
        qtd.setText(String.valueOf(produtos.get(i).getQtd()));

        return view;
    }
}
