package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class SmurfsRecyclerAdapter extends RecyclerView.Adapter<SmurfsRecyclerAdapter.ViewHolder> {
    private List<SmurfsModel> models;
    private OnItemClickCallback onItemClickCallback;

    public SmurfsRecyclerAdapter(List<SmurfsModel> models) {
        this.models = models;

    }


    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false );

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SmurfsModel model = models.get(position);
        holder.ivSmurfsPhoto.setBackgroundResource(model.getPhoto());
        holder.tvSmurfsName.setText(model.getName());
        holder.tvSmurfsSum.setText(model.getSummary());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(models.get(position));

            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivSmurfsPhoto;
        TextView tvSmurfsName;
        TextView tvSmurfsSum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivSmurfsPhoto = itemView.findViewById(R.id.iv_smurfs);
            tvSmurfsName = itemView.findViewById(R.id.tv1_SmurfsName);
            tvSmurfsSum = itemView.findViewById(R.id.tv2_summary);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(SmurfsModel data);
    }
}
