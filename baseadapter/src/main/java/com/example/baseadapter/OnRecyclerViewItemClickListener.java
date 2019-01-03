package com.example.baseadapter;

/**
 * Created by starhood on 03/01/19.
 */

public interface OnRecyclerViewItemClickListener<T> {
        void onClick(T pos);
        void onLongPress(T pos);
}
