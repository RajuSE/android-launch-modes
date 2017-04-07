package raju.dev.launchmode.singleTask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import raju.dev.launchmode.R;
import raju.dev.launchmode.Utils;

public class C_singleTask extends AppCompatActivity {

    @BindView(R.id.tvActivityStack)
    TextView tvActivityStack;

    @OnClick(R.id.btnCallActivity)
    void submit(){

        Intent intent=new Intent(this,D_singleTask.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        ButterKnife.bind(this);

        tvActivityStack.setText("A_singleInstance->B_singleInstance->D_singleInstance->C_singleInstance \n"+ Utils.getRunningActivity(this));
    }


}

