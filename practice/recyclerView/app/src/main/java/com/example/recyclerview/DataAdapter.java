package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private List<recyclerItem> recyclerItems;
    private Context context;

    public DataAdapter(List<recyclerItem> recyclerItems, Context context) {
        this.recyclerItems = recyclerItems;
        this.context = context;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {
        recyclerItem recycleritem = recyclerItems.get(position);
        holder.infoHead.setText(recycleritem.getInfo());
    }

    @Override
    public int getItemCount() {
        return recyclerItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView infoHead;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            infoHead = itemView.findViewById(R.id.textView);

        }
    }
}
