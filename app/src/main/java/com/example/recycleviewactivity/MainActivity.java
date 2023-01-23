package com.example.recycleviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recycleviewactivity.databinding.ActivityMainBinding;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        LinkedList<String> wordlist = new LinkedList<>();
        wordlist.add("pepe");
        wordlist.add("pepo");
        wordlist.add("pepp");
        wordlist.add("pepl");
        WordListAdapter mAdapter = new WordListAdapter(this, wordlist);
        binding.recycleview.setAdapter(mAdapter);
        binding.recycleview.setLayoutManager(new LinearLayoutManager(this));

    }
}