package com.example.nurfauzanhalim.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nurfauzanhalim.Model.FriendlistModel;
import com.example.nurfauzanhalim.R;

import java.util.ArrayList;

/*
    Dikerjakan pada tanggal : 6 Mei 2022
    Dibuat oleh :
    NIM   : 10119226
    Nama  : Nur Fauzan Halim
    Kelas : IF-6
*/

public class FriendlistAdapter extends RecyclerView.Adapter<FriendlistAdapter.myviewholder> {

    ArrayList<FriendlistModel> friendlistModel;

    public FriendlistAdapter(ArrayList<FriendlistModel> friendlistModel) {
        this.friendlistModel = friendlistModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_friendlist, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivFriendlist.setImageResource(friendlistModel.get(position).getImage());
        holder.tvNama.setText(friendlistModel.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return friendlistModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivFriendlist;
        TextView tvNama;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivFriendlist = itemView.findViewById(R.id.iv_friendlist);
            tvNama = itemView.findViewById(R.id.tv_nama);
        }
    }
}
