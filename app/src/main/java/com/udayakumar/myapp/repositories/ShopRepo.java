package com.udayakumar.myapp.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.udayakumar.myapp.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableLiveData;


    public LiveData<List<Product>> getMutableLiveData(){

        if(mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
            loadProducts();
        }

        return mutableLiveData;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://firebasestorage.googleapis.com/v0/b/catapult-369.appspot.com/o/salad%20(2).jpg?alt=media&token=59561bf6-5d5e-47fe-be7d-ba6baa24045b",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Mango","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Apple","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Grapes","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));


        mutableLiveData.setValue(productList);
    }


//
//    private MutableLiveData<List<Product>> mutableLiveData;
//
//    public LiveData<List<Product>> getMutableLiveData() {
//        if (mutableLiveData == null){
//            mutableLiveData = new MutableLiveData<>();
//            loadProducts();
//        }
//        return mutableLiveData;
//    }
//
//    private void loadProducts() {
//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://firebasestorage.googleapis.com/v0/b/catapult-369.appspot.com/o/salad%20(2).jpg?alt=media&token=59561bf6-5d5e-47fe-be7d-ba6baa24045b",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Mango","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Apple","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Grapes","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        productList.add(new Product(UUID.randomUUID().toString(),"Carrot","https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Carrots_at_Ljubljana_Central_Market.JPG/1024px-Carrots_at_Ljubljana_Central_Market.JPG",50,true));
//        mutableLiveData.setValue(productList);
//
//    }



}
