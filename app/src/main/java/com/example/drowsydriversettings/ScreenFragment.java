package com.example.drowsydriversettings;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ScreenFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.LogOut:
                NavHostFragment.findNavController(ScreenFragment.this).navigate(R.id.action_screen2_to_loginFragment);
                return true;
            case R.id.item1:
                return true;
            case R.id.sub_item1:
                return true;
            case R.id.sub_item2:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_screen, container, false);

        Toolbar toolbar = v.findViewById(R.id.toolbarMain);
        ((AppCompatActivity)(getActivity())).setSupportActionBar(toolbar);
        setHasOptionsMenu(true);


        ((AppCompatActivity)(getActivity())).getSupportActionBar().setTitle("Drowsy Driver Menu");

        FloatingActionButton fab = v.findViewById(R.id.settings_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScreenFragment.this).navigate(R.id.action_screen2_to_settingsFragment);
            }
        });

        return v;
    }






}