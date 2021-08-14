package com.example.android126hw;

import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {
    private ArrayList<Like> list;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_second,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.onBind(list.get(position));
    }

    public void setFile(ArrayList<Like> list) {
        this.list = new ArrayList<>();
        this.list=list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ava,post;
        private TextView userName,time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ava=itemView.findViewById(R.id.ava);
            post=itemView.findViewById(R.id.post);
            time=itemView.findViewById(R.id.time);
            userName=itemView.findViewById(R.id.users_name);
        }

        public void onBind(Like like) {
            ava.setImageResource(like.getAva());
            post.setImageResource(like.getPost());
            time.setText((like.getTime()));
            userName.setText(like.getUserName());

        }
    }
}
