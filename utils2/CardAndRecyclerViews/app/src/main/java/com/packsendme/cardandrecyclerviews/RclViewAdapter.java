package com.packsendme.cardandrecyclerviews;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RclViewAdapter extends RecyclerView.Adapter<RclViewAdapter.PessoaViewHolder>{
    @NonNull
    @Override
    public PessoaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        PessoaViewHolder pessoaViewHolder=new PessoaViewHolder(view);
        return pessoaViewHolder;
    }

    @Override
    public void onBindViewHolder(PessoaViewHolder pessoaViewHolder, int i) {
        pessoaViewHolder.tvNome.setText(pessoas.get(i).nome);
        pessoaViewHolder.tvIdade.setText(pessoas.get(i).idade);
        pessoaViewHolder.imgPessoa.setImageResource(pessoas.get(i).idFoto);
    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PessoaViewHolder extends RecyclerView.ViewHolder{
        CardView cvPessoa;
        TextView tvNome,tvIdade;
        ImageView imgPessoa;

        PessoaViewHolder(View itemView){
            super(itemView);
            cvPessoa=itemView.findViewById(R.id.cvPessoa);
            imgPessoa=itemView.findViewById(R.id.imgPessoa);
            tvIdade=itemView.findViewById(R.id.tvIdade);
            tvNome=itemView.findViewById(R.id.tvNome);
        }
    }
    List<MainActivity.Pessoa> pessoas;

    RclViewAdapter(List<MainActivity.Pessoa> pessoas){
        this.pessoas=pessoas;
    }
}

