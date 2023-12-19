package com.example.projecttask1i;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;


public class FragmentDashBoard extends Fragment {
    public FragmentDashBoard() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dash_board, container, false);

        // Initialize and set click listeners for the cards in the dashboard
        view.findViewById(R.id.card1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for card 1
                // You may replace the code below with your desired action
                ((MainActivity) requireActivity()).replaceFragment(new Menu1Fragment());
            }
        });

        view.findViewById(R.id.card2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for card 2
                // You may replace the code below with your desired action
                ((MainActivity) requireActivity()).replaceFragment(new Menu2Fragment());
            }
        });

        view.findViewById(R.id.card3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for card 2
                // You may replace the code below with your desired action
                ((MainActivity) requireActivity()).replaceFragment(new Menu3Fragment());
            }
        });
        view.findViewById(R.id.card4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for card 2
                // You may replace the code below with your desired action
                ((MainActivity) requireActivity()).replaceFragment(new Menu4Fragment());
            }
        });
        view.findViewById(R.id.card5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for card 2
                // You may replace the code below with your desired action
                ((MainActivity) requireActivity()).replaceFragment(new Menu5Fragment());
            }
        });
        view.findViewById(R.id.card6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for card 2
                // You may replace the code below with your desired action
                ((MainActivity) requireActivity()).replaceFragment(new Menu6Fragment());
            }
        });

        return view;
    }


    public void onBackPressed() {
        // Handle back press in DashboardFragment
        // Start the login activity
        Intent intent = new Intent(requireContext(), LoginActivity.class);
        startActivity(intent);
        new LoginActivity().finish();
    }

}