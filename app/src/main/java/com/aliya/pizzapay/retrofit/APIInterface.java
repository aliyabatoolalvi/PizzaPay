package com.aliya.pizzapay.retrofit;

import com.aliya.pizzapay.data.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("loadProducts.php")
    Call<List<Product>> loadProducts();

}