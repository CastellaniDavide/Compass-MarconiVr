package it.castellanidavide.compass.ui.floorExtra.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FloorExtraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FloorExtraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Palazzina");
    }

    public LiveData<String> getText() {
        return mText;
    }
}