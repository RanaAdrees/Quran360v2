package com.example.quran360v2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quran360v2.GenericListItem;
import com.example.quran360v2.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<GenericListItem> genericListItems;

    public RecyclerViewAdapter(Context context, ArrayList<GenericListItem> genericListItems) {
        this.context = context;
        this.genericListItems = genericListItems;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_custom_surah_view,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        GenericListItem genericListItem=genericListItems.get(position);
        holder.surahA.setText(genericListItem.getFirstEntity());
        holder.surahE.setText(genericListItem.getSecendEntity());
    }

    @Override
    public int getItemCount() {
        return genericListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView suraha;
        TextView surahe;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            suraha=itemView.findViewById(R.id.surahA);
            surahe=itemView.findViewById(R.id.surahE);
        }

        @Override
        public void onClick(View view) {
            TextView name= view.findViewById(R.id.contactName);
            Toast.makeText(context, "ContactName:"+name.getText(), Toast.LENGTH_SHORT).show();

        }
    }
}
