package raju.dev.launchmode.singleInstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import raju.dev.launchmode.R;

public class B_singleInstance extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        Intent intent=new Intent(this,C_singleInstance.class);
        startActivity(intent);

    }
}

