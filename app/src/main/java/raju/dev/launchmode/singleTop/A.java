package raju.dev.launchmode.singleTop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import raju.dev.launchmode.R;

public class A extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        Intent intent=new Intent(this,B.class);
        startActivity(intent);

    }
}

