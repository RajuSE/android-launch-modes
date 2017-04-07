package raju.dev.launchmode.singleTop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import raju.dev.launchmode.R;
import raju.dev.launchmode.Utils;

public class D extends AppCompatActivity {

    @BindView(R.id.tvActivityStack)
    TextView tvActivityStack;

    @OnClick(R.id.btnCallActivity)
    void submit(){

        Intent intent=new Intent(this,D.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        ButterKnife.bind(this);

        tvActivityStack.setText("A->B->C->D \n"+ Utils.getRunningActivity(this));

    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        tvActivityStack.setText("A->B->C->D"+" onNewIntent\n" + Utils.getRunningActivity(this));

    }
}

