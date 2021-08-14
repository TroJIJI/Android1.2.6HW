package com.example.android126hw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {
    private RecyclerView recyclerView;
    private SecondAdapter sAdapter;
    private ArrayList<Like> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initAction(view);
    }



    private void createList() {
        list=new ArrayList<>();
        list.add(new Like(R.drawable.ava,R.drawable.post,"1h.","argen2132113 liked your photo"));
        list.add(new Like(R.drawable.ava,R.drawable.post,"1h.","argen2132113 liked your photo"));
        list.add(new Like(R.drawable.ava,R.drawable.post,"1h.","argen2132113 liked your photo"));
        list.add(new Like(R.drawable.ava,R.drawable.post,"1h.","argen2132113 liked your photo"));
    }
    private void initAction(View view) {
        recyclerView=view.findViewById(R.id.rv_second);
        sAdapter= new SecondAdapter();
        sAdapter.setFile(list);
        recyclerView.setAdapter(sAdapter);
    }
}