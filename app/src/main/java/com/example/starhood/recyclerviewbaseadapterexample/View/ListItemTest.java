package com.example.starhood.recyclerviewbaseadapterexample.View;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.baseadapter.RecyclerViewView;
import com.example.starhood.recyclerviewbaseadapterexample.POJO.DataClass;
import com.example.starhood.recyclerviewbaseadapterexample.R;

/**
 * Created by starhood on 03/01/19.
 */

public class ListItemTest extends RelativeLayout implements RecyclerViewView<DataClass>{

    private TextView title,description;
    private Button btn;

    public ListItemTest(Context context) {
        super(context);
    }

    public ListItemTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListItemTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ListItemTest(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        title= findViewById(R.id.titlex);
        description=findViewById(R.id.seec);
        btn=findViewById(R.id.menu_btn);
    }


    @Override
    public void bindData(DataClass item) {
        title.setText(item.getTitle());
        description.setText(item.getDisc());
    }
}
