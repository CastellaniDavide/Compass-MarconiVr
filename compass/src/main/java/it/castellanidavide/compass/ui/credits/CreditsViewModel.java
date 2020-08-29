package it.castellanidavide.compass.ui.Credits.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CreditsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CreditsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Credits");
    }

    public LiveData<String> getText() {
        return mText;
    }
}