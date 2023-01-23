package com.example.recycleviewactivity;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {
    private LinkedList<String> wordlist;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> list) {
        this.wordlist=list;
        mInflater = LayoutInflater.from(context);
    }



    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = mInflater.inflate(R.layout.recycleview_item,viewGroup,false);
        return new WordViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String current=wordlist.get(position);
        holder.wordItemView.setText(current);
    }



    @Override
    public int getItemCount() {
        return wordlist.size();
    }
}
