package com.udayakumar.myapp.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udayakumar.myapp.R;
import com.udayakumar.myapp.adapters.ShopListAdapter;
import com.udayakumar.myapp.databinding.FragmentShopBinding;
import com.udayakumar.myapp.models.CartItem;
import com.udayakumar.myapp.models.Product;
import com.udayakumar.myapp.viewmodels.ShopViewModel;

import java.util.List;


public class ShopFragment extends Fragment implements ShopListAdapter.ShopInterface {

    FragmentShopBinding fragmentShopBinding;
    private ShopListAdapter shopListAdapter;
    private ShopViewModel shopViewModel;
    private NavController navController;

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

        shopListAdapter = new ShopListAdapter(this);

        fragmentShopBinding.shopRecyclerView.setAdapter(shopListAdapter);
        fragmentShopBinding.shopRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),DividerItemDecoration.VERTICAL));
        fragmentShopBinding.shopRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),DividerItemDecoration.HORIZONTAL));

        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        shopViewModel.getProducts().observe(getViewLifecycleOwner(),new Observer<List<Product>>(){

            @Override
            public void onChanged(List<Product> products) {
                shopListAdapter.submitList(products);
            }
        });

        shopViewModel.getCart().observe(getViewLifecycleOwner(), new Observer<List<CartItem>>() {
            @Override
            public void onChanged(List<CartItem> cartItems) {

            }
        });

        navController = Navigation.findNavController(view);
    }

    @Override
    public void addItem(Product product) {
        boolean isAdded = shopViewModel.addItemToCart(product);
    }

    @Override
    public void onItemClick(Product product) {

        shopViewModel.setProduct(product);
        navController.navigate(R.id.action_shopFragment_to_productDetailFragment);

    }
}