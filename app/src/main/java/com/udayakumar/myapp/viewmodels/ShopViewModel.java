package com.udayakumar.myapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.udayakumar.myapp.models.CartItem;
import com.udayakumar.myapp.models.Product;
import com.udayakumar.myapp.repositories.CartRepo;
import com.udayakumar.myapp.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();
    CartRepo cartRepo = new CartRepo();


    MutableLiveData<Product> mutableProduct = new MutableLiveData<>();
    public LiveData<List<Product>> getProducts(){
        return shopRepo.getMutableLiveData();
    }

    public void setProduct(Product product) {
        mutableProduct.setValue(product);
    }

    public LiveData<Product> getProduct(){
        return mutableProduct;
    }

    public LiveData<List<CartItem>> getCart(){
        return cartRepo.listLiveData();
    }

    public boolean addItemToCart(Product product){
        return cartRepo.addItemToCart(product);
    }

}
