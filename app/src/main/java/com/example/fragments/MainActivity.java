package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_section, new Fragmento())  // Load default fragment
                    .commit();
        }
    }
    // method for displaying the appropriate
    // fragment according to the clicked button
    public void selectFragment(View view) {

        // creating object for Fragment
        Fragment fr;

        // displaying first fragment
        // if button1 is clicked
        System.out.println(view);

        if(view == findViewById(R.id.button)) {
            System.out.println("if");
            fr = new Fragmento();
        }

        // displaying second fragment
        // if button2 is clicked
        else {
            System.out.println("else");

            fr = new FragmentoDos();
        }

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_section, fr);
        fragmentTransaction.commit();    }
}