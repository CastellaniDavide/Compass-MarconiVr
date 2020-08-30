package it.castellanidavide.compass.ui.floor3.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import it.castellanidavide.compass.R;

public class Floor3Fragment extends Fragment {

    private Floor3ViewModel floor3ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        floor3ViewModel = ViewModelProviders.of(this).get(Floor3ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_floor3, container, false);

        return root;
    }
}
