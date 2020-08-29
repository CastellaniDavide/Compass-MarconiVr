package it.castellanidavide.compass.ui.floor0.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import it.castellanidavide.compass.R;

public class Floor0Fragment extends Fragment {

    private Floor0ViewModel floor0ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        floor0ViewModel =
                ViewModelProviders.of(this).get(Floor0ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_floor0, container, false);
        final TextView textView = root.findViewById(R.id.text_floor0);
        floor0ViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });


        return root;
    }
}
