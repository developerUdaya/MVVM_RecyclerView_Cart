package com.udayakumar.myapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.udayakumar.myapp.models.Product;
import com.udayakumar.myapp.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();

    public LiveData<List<Product>> getProducts(){
        return shopRepo.getMutableLiveData();
    }
}
