package com.example.administrator.bottom.frag;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.bottom.R;

/**
 * Created by Administrator on 2017/10/29.
 */

public class FragMe extends Fragment {
    private String context;
    private TextView mTextView;
    private Button close_button;

    public FragMe(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_me,container,false);
        close_button = (Button) view.findViewById(R.id.close_btn);
        close_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        return view;
    }
}
