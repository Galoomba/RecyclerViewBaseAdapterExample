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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(RecyclerViewView itemView) {
            super((View)itemView);
        }
    }
}
