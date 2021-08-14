package com.example.android126hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.HomeHolder> {
    private ArrayList<Post>list;
    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.first_item,parent,false);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    public void setList(ArrayList<Post> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeHolder extends RecyclerView.ViewHolder {

        private TextView date,comment;
        private ImageView img;
        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            date=itemView.findViewById(R.id.date);
            img=itemView.findViewById(R.id.img);
            comment=itemView.findViewById(R.id.comment);
        }

        public void onBind(Post post) {
            date.setText(post.getDate());
            comment.setText(post.getComment());
            img.setImageResource(post.getImg());

        }
    }
}
