package it.castellanidavide.compass.ui.floor2.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Floor2ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Floor2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Floor 2");
    }

    public LiveData<String> getText() {
        return mText;
    }
}