package kz.example.finalproject.ui.test_obsh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import kz.example.finalproject.R;

public class TestFragment extends Fragment {

    View view;
    Button test_ata, test_apa, test_ake, test_ana;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_test, container, false);
        return view;


    }
}