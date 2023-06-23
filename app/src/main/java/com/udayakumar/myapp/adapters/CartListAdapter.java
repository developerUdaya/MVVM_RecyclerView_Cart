package com.udayakumar.myapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.udayakumar.myapp.databinding.CartRowBinding;
import com.udayakumar.myapp.models.CartItem;

import java.util.List;

public class CartListAdapter extends ListAdapter<CartItem,CartListAdapter.CartViewHolder> {


    protected CartListAdapter(@NonNull DiffUtil.ItemCallback<CartItem> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public CartListAdapter.CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CartListAdapter.CartViewHolder holder, int position) {

    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
