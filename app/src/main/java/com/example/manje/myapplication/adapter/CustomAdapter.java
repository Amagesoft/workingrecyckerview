package com.example.manje.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manje.myapplication.R;
import com.example.manje.myapplication.activity.MainActivity;

import java.util.zip.Inflater;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    Context context;
    String[] names;

    public CustomAdapter(MainActivity mainActivity, String[] names) {
    this.context = mainActivity;
    this.names = names;
    }
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adpter_custom,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, final int position) {
        holder.itemTV.setText(names[position]);
        holder.checkCB.setOnCheckedChangeListener(null);
        holder.checkCB.setChecked(Boolean.parseBoolean(names[position]));
        holder.checkCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(context, ""+names[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView itemTV;
        private final CheckBox checkCB;

        public ViewHolder(View itemView) {
            super(itemView);
            this.setIsRecyclable(false);
            itemTV = (TextView)itemView.findViewById(R.id.itemTV);
            checkCB = (CheckBox)itemView.findViewById(R.id.checkCB);
        }
    }
}
