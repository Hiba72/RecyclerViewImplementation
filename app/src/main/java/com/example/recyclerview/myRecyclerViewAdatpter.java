package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdatpter extends RecyclerView.Adapter<myRecyclerViewAdatpter.MyViewHolder> {
    List<friends> friendsList;
    public myRecyclerViewAdatpter(List<friends> friendsList) {
        this.friendsList = friendsList;
    }

    @NonNull
    @Override
    public myRecyclerViewAdatpter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singlerecorddesign, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myRecyclerViewAdatpter.MyViewHolder holder, int position) {
        holder.data=friendsList.get(position);
        holder.textViewFriendName.setText(holder.data.getName());
        holder.textViewdateFriend.setText(String.valueOf(holder.data.getDob()));
        holder.imageViewFriend.setImageResource(R.drawable.a);
        holder.textViewCity.setText(holder.data.getCity());
    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewFriend;
        TextView textViewFriendName;
        TextView textViewdateFriend;
        TextView textViewCity;
        friends data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFriend = itemView.findViewById(R.id.imageViewFriendPicture);
            textViewFriendName = itemView.findViewById(R.id.textViewFriendName);
            textViewdateFriend = itemView.findViewById(R.id.textViewDate);
            textViewCity = itemView.findViewById(R.id.textViewCity);
        }
    }
}
