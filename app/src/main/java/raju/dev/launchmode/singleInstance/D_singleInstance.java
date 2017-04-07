package raju.dev.launchmode.singleInstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import raju.dev.launchmode.R;
import raju.dev.launchmode.Utils;

public class D_singleInstance extends AppCompatActivity {


    @BindView(R.id.tvActivityStack)
    TextView tvActivityStack;

    @OnClick(R.id.btnCallActivity)
    void submit(){

        Intent intent=new Intent(this,D_singleInstance.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        ButterKnife.bind(this);

        tvActivityStack.setText("A_singleInstance->B_singleInstance->C_sinstance-> || NewStack: D_singleInstance"+" Activity\n" + Utils.getRunningActivity(this)
                +"\n Now BackPress to Experience that new Stack");



    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        tvActivityStack.setText(" onNewIntent  Activity\n" + Utils.getRunningActivity(this));
    }

}

