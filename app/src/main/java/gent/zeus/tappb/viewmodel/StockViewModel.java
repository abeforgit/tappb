package gent.zeus.tappb.viewmodel;

import android.util.Log;

import gent.zeus.tappb.api.APIException;
import gent.zeus.tappb.api.TapAPI;
import gent.zeus.tappb.entity.Product;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import gent.zeus.tappb.entity.StockProduct;

public class StockViewModel extends ViewModel {
    //TODO: implement TAP api

    private LiveData<List<StockProduct>> stock;

    public void init() {
        initializeStock();
    }

    public MutableLiveData<Boolean> fetchError;

    public LiveData<List<StockProduct>> getStock() {
        return stock;
    }
    public MutableLiveData<Boolean> getFetchError() {
        return fetchError;
    }

    public void initializeStock() {
        stock = new MutableLiveData<>();
        fetchError = new MutableLiveData<>();
        List<StockProduct> productList;

        try {
            productList = TapAPI.getStockProducts();
            fetchError.setValue(false);
        } catch (APIException ex) {
            fetchError.setValue(true);
            productList = new ArrayList<>();
            productList.add(new StockProduct(new Product(0, "Cola", 1.20), 5));
            productList.add(new StockProduct(new Product(1, "Ice-Tea", 1.20), 5));
            productList.add(new StockProduct(new Product(2, "Bier", 1.20), 5));
            productList.add(new StockProduct(new Product(3, "Mate", 1.20), 5));
            productList.add(new StockProduct(new Product(4, "Chips", 1.20), 5));
            productList.add(new StockProduct(new Product(5, "Bueno", 1.20), 5));
            productList.add(new StockProduct(new Product(6, "Sapje", 1.20), 5));
            productList.add(new StockProduct(new Product(7, "Foo", 1.20), 5));
            productList.add(new StockProduct(new Product(8, "Bar", 1.20), 5));
            productList.add(new StockProduct(new Product(9, "Kip", 1.20), 5));
        }

        ((MutableLiveData<List<StockProduct>>) stock).setValue(productList);
    }
}
