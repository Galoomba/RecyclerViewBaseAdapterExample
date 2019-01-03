package com.example.baseadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by starhood on 03/01/19.
 */

public class BaseAdapter<T> extends RecyclerView.Adapter<BaseAdapter.ViewHolder> {
    private ArrayList<T> dataList;
    private OnRecyclerViewItemClickListener<T> deleget;
    private int layoutId;


    public BaseAdapter(ArrayList<T> dataList, OnRecyclerViewItemClickListener<T> deleget, int layoutId) {
        this.dataList = dataList;
        this.deleget = deleget;
        this.layoutId = layoutId;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewView<T> view = (RecyclerViewView<T>) LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.view.bindData(dataList.get(position));
        ((View) holder.view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (deleget != null) {
                    deleget.onClick(dataList.get(position));
                }
            }
        });
        ((View) holder.view).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(deleget!=null){
                    deleget.onLongPress(dataList.get(position));
                }
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewView view;
        public ViewHolder(RecyclerViewView itemView) {
            super((View)itemView);
            view=itemView;
        }
    }
}
