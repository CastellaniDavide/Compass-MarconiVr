package it.castellanidavide.compass.ui.floor1.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Floor1ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Floor1ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Floor 1");
    }

    public LiveData<String> getText() {
        return mText;
    }
}