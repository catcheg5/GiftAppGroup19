package com.example.thegiftapp.ui.product;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class productViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public productViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is product fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}