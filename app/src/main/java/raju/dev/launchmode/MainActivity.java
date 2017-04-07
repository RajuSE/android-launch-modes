package raju.dev.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import raju.dev.launchmode.singleInstance.A_singleInstance;
import raju.dev.launchmode.singleTask.A_singleTask;
import raju.dev.launchmode.singleTop.A;

public class MainActivity extends AppCompatActivity {


    @OnClick(R.id.singleTopBtn)
    void submit_singleTopBtn() {
        Intent intent=new Intent(this,A.class);
        startActivity(intent);
    }

    @OnClick(R.id.singleTaskBtn)
    void submit_singleTaskBtn() {
        Intent intent=new Intent(this,A_singleTask.class);
        startActivity(intent);
    }

    @OnClick(R.id.singleInstanceBtn)
    void submit_singleInstanceBtn() {
        Intent intent=new Intent(this,A_singleInstance.class);
        startActivity(intent);
    }

    @OnClick(R.id.standardBtn)
    void submit_standardBtn() {
        Toast.makeText(this,"standard mode ALWAYS calls NEW activity & NEVER calls onNewIntent() ",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
