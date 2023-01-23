package com.example.recycleviewactivity;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder {

    private RecyclerView.Adapter mAdapter;
    TextView wordItemView;
    public WordViewHolder(View itemView, WordListAdapter adapter) {
        super(itemView);
        wordItemView = (TextView) itemView.findViewById(R.id.word);
        this.mAdapter = adapter;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordItemView.setText ("Clicked! "+ wordItemView.getText());
            }
        });
    }

}
