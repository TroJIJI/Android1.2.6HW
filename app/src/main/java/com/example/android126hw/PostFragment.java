package com.example.android126hw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PostFragment extends Fragment {
private ArrayList<PostImage> list;
private RecyclerView recyclerView;
private PostAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_post,null);
        list=new ArrayList<>();
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        list.add(new PostImage(R.drawable.post12));
        recyclerView=view.findViewById(R.id.post_rv);
        adapter= new PostAdapter(getContext(),list);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerView.setAdapter(adapter);
        return view;




    }
}