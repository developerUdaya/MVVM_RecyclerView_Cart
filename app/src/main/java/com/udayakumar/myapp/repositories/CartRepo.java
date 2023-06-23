package com.udayakumar.myapp.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.udayakumar.myapp.models.CartItem;
import com.udayakumar.myapp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class CartRepo {

    MutableLiveData<List<CartItem>> mutableLiveData = new MutableLiveData<>();

    public LiveData<List<CartItem>> listLiveData(){
        if (mutableLiveData==null){
            initCart();
        }
        return mutableLiveData;
    }

    private void initCart() {
        mutableLiveData.setValue(new ArrayList<CartItem>());
    }

    public boolean addItemToCart(Product product){
        if (mutableLiveData.getValue()==null){
            initCart();
        }
        List<CartItem> cartItemList = new ArrayList<>(mutableLiveData.getValue());

        CartItem cartItem = new CartItem(product,1);
        cartItemList.add(cartItem);
        mutableLiveData.setValue(cartItemList);
        return true;
    }


}
