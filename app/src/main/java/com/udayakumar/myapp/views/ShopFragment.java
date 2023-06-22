package com.udayakumar.myapp.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udayakumar.myapp.R;
import com.udayakumar.myapp.adapters.ShopListAdapter;
import com.udayakumar.myapp.databinding.FragmentShopBinding;
import com.udayakumar.myapp.models.Product;
import com.udayakumar.myapp.viewmodels.ShopViewModel;

import java.util.List;


public class ShopFragment extends Fragment implements ShopListAdapter.ShopInterface {


    FragmentShopBinding fragmentShopBinding;
    private ShopListAdapter shopListAdapter;
    private ShopViewModel shopViewModel;




    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentShopBinding = FragmentShopBinding.inflate(inflater,container,false);
        return fragmentShopBinding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view,@NonNull Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        shopListAdapter = new ShopListAdapter();
        fragmentShopBinding.shopRecyclerView.setAdapter(shopListAdapter);

        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        shopViewModel.getProducts().observe(getViewLifecycleOwner(),new Observer<List<Product>>(){

            @Override
            public void onChanged(List<Product> products) {
                shopListAdapter.submitList(products);
            }
        });
    }

    @Override
    public void addItem(Product product) {

    }

    @Override
    public void onItemClick(Product product) {

    }
}