package com.example.thegiftapp.ui.preference;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class preferenceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public preferenceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is preference fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}