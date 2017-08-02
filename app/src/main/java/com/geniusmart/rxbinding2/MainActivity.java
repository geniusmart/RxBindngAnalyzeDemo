package com.geniusmart.rxbinding2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.jakewharton.rxbinding2.view.RxView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.button)
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RxView.clicks(button).subscribe(new Consumer<Object>() {
            @Override
            public void accept(Object o) throws Exception {
                Toast.makeText(MainActivity.this,"button",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
