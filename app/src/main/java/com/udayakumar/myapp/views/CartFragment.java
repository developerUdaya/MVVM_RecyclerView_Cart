package com.udayakumar.myapp.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udayakumar.myapp.R;
import com.udayakumar.myapp.databinding.FragmentCartBinding;
import com.udayakumar.myapp.models.Product;
import com.udayakumar.myapp.viewmodels.ShopViewModel;

import java.util.List;

public class CartFragment extends Fragment {

    FragmentCartBinding fragmentCartBinding;

    ShopViewModel shopViewModel;


    public CartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        fragmentCartBinding = FragmentCartBinding.inflate(inflater,container,false);
        return fragmentCartBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view,@NonNull Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        fragmentCartBinding.cartRecycler.setAdapter();

        fragmentCartBinding.cartRecycler.addItemDecoration(new DividerItemDecoration(requireContext(),DividerItemDecoration.HORIZONTAL));

        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        shopViewModel.getProducts().observe(getViewLifecycleOwner(), new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> products) {

            }
        });
    }
}