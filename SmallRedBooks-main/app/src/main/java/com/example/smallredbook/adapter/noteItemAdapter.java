package com.example.smallredbook.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smallredbook.CircleImageView;
import com.example.smallredbook.R;

public class noteItemAdapter extends RecyclerView.Adapter<noteItemAdapter.noteItemHolder> {

    ImageView imageView;
    @NonNull
    @Override
    public noteItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_note_item, parent, false);
        noteItemHolder holder = new noteItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull noteItemHolder holder, int position) {
        Log.d("Here", "onBindViewHolder:111 ");

        if(position == 5){
            holder.notePicture.setImageResource(R.drawable.picture);
        }

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class noteItemHolder extends RecyclerView.ViewHolder {
    ImageView notePicture;
    TextView noteTitle;
    CircleImageView noteHeadProfile;
    TextView noteId;
    ImageView noteLike;

        public noteItemHolder(@NonNull View itemView) {
            super(itemView);
            notePicture = (ImageView) itemView.findViewById(R.id.note_picture);
            noteTitle = (TextView) itemView.findViewById(R.id.note_title);
            noteHeadProfile = (CircleImageView) itemView.findViewById(R.id.note_head_profile);
            noteId = (TextView) itemView.findViewById(R.id.note_id);
            noteLike = (ImageView) itemView.findViewById(R.id.note_like);
        }
    }
}
