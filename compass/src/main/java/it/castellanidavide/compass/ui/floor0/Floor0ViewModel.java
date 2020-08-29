package it.castellanidavide.compass.ui.floor0.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Floor0ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Floor0ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Floor 0");
    }

    public LiveData<String> getText() {
        return mText;
    }
}