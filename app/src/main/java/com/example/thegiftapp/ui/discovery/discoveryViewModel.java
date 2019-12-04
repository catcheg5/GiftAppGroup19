package com.example.thegiftapp.ui.discovery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class discoveryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public discoveryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is discovery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}