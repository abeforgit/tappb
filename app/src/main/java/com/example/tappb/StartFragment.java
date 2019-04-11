package com.example.tappb;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tappb.databinding.FragmentStartBinding;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartFragment extends Fragment {


    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentStartBinding binding = FragmentStartBinding.inflate(inflater, container, false);
        binding.setLifecycleOwner(this);

        View view = binding.getRoot();

        NavController navController = Navigation.findNavController(view.findViewById(R.id.nav_host_fragment));
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);

        return view;
    }
}
