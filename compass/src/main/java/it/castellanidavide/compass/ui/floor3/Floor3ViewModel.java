package it.castellanidavide.compass.ui.floor3.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Floor3ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Floor3ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Floor 3");
    }

    public LiveData<String> getText() {
        return mText;
    }
}