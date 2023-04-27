package com.example.app05;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private Button Button01;
//    private TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        //setContentView ( R.layout.fragment_dashboard );

        BottomNavigationView navView = findViewById ( R.id.nav_view );
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder (
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications )
                .build ();
        NavController navController = Navigation.findNavController ( this, R.id.nav_host_fragment );
        NavigationUI.setupActionBarWithNavController ( this, navController, appBarConfiguration );
        NavigationUI.setupWithNavController ( navView, navController );

//        Button01 = findViewById(R.id.button01);
//        TextView = findViewById(R.id.textView);                   // text1というIDのViewを取得しtext1変数に代入
//
//        Button01.setOnClickListener(new View.OnClickListener() {// btn1にクリックリスナーを設定（定義も同時に行っている）
//            @Override
//            public void onClick(View view) {	// 設定したViewがクリックされたら実行されるメソッド
//                TextView.setText("ok");     // text1のテキストを変更
//            }
//        });



    }



}
