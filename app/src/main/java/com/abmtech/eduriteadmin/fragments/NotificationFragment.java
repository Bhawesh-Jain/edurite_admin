package com.abmtech.eduriteadmin.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.abmtech.eduriteadmin.adapters.NotificationListAdapter;
import com.abmtech.eduriteadmin.databinding.FragmentHomeBinding;
import com.abmtech.eduriteadmin.databinding.FragmentNotificationBinding;


public class NotificationFragment extends Fragment {


    private Activity activity;
    private FragmentNotificationBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNotificationBinding.inflate(inflater, container, false);
        activity = requireActivity();

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        binding.recyclerView.setAdapter(new NotificationListAdapter());

        return binding.getRoot();
    }
}
