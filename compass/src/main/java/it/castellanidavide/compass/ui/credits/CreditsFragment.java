package it.castellanidavide.compass.ui.Credits.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import it.castellanidavide.compass.R;

public class CreditsFragment extends Fragment {

    private CreditsViewModel CreditsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CreditsViewModel = ViewModelProviders.of(this).get(CreditsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_credits, container, false);

        return root;
    }
}
