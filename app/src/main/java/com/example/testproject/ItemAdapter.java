package com.example.testproject;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ItemAdapter extends ArrayAdapter<Integer> {

    private Context context;
    private int layout;
    private Integer[] data;
    private int numberColor = 4;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull Integer[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.data = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View item = convertView;

        if (item == null) {
            item = LayoutInflater.from(context).inflate(layout, null);
        }

        ((TextView) item.findViewById(R.id.txt_position)).setText(String.valueOf(position));
        LinearLayout layout = item.findViewById(R.id.layout);
        switch (position % numberColor) {
            case 0:
                layout.setBackgroundColor((int)R.color.purple_200);
                break;
            case 1:
                layout.setBackgroundColor((int)R.color.teal_200);
                break;
            case 2:
                layout.setBackgroundColor(Color.parseColor("#4CAF50"));
                break;
            case 3:
                layout.setBackgroundColor(Color.parseColor("#FF9800"));
                break;
        }

        TextView text = item.findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });

        return item;
    }
}
