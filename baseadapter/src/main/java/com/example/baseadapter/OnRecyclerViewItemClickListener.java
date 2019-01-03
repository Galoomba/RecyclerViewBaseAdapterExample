package com.example.baseadapter;

/**
 * Created by starhood on 03/01/19.
 */

public interface OnRecyclerViewItemClickListener<T> {
        void onClick(int pos);
        void onLongPress(int pos);
}
