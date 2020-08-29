package it.castellanidavide.compass.ui.floorExtra.home;

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

public class FloorExtraFragment extends Fragment {

    private FloorExtraViewModel floorExtraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        floorExtraViewModel =
                ViewModelProviders.of(this).get(FloorExtraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_floor_extra, container, false);
        final TextView textView = root.findViewById(R.id.text_floor_extra);
        /*floorExtraViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/


        return root;
    }
}
