package com.example.hunger;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.example.hunger.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import javax.net.ssl.SSLSessionBindingEvent;

public class Home extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    Dialog mydialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        mydialog = new Dialog(this);
        bottomNavigationView=findViewById(R.id.nav_bar);
        bottomNavigationView.setBackground(null);


    }
    public void popup(View v){
        TextView close;
        mydialog.setContentView(R.layout.userpop_up);
        close =(TextView) mydialog.findViewById(R.id.closebtn);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }

}