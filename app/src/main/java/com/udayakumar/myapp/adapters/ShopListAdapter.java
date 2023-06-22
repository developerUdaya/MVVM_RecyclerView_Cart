package com.udayakumar.myapp.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.udayakumar.myapp.databinding.ProductItemBinding;
import com.udayakumar.myapp.models.Product;

public class ShopListAdapter extends ListAdapter<Product, ShopListAdapter.ShopViewHolder> {

    public ShopListAdapter() {
        super(Product.itemCallback);
    }

    protected ShopListAdapter(@NonNull AsyncDifferConfig<Product> config) {
        super(config);
    }

    @NonNull
    @Override
    public ShopListAdapter.ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ProductItemBinding productItemBinding = ProductItemBinding.inflate(layoutInflater,parent,false);
        return new ShopViewHolder(productItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopListAdapter.ShopViewHolder holder, int position) {

        Product product = getItem(position);
        holder.productItemBinding.setProduct(product);

    }

    public class ShopViewHolder extends RecyclerView.ViewHolder{

        ProductItemBinding productItemBinding;
        public ShopViewHolder(@NonNull ProductItemBinding binding) {
            super(binding.getRoot());
            this.productItemBinding = binding;
        }
    }

    public interface ShopInterface{
        void addItem(Product product);
        void onItemClick(Product product);
    }
}
