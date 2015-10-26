package main.materialdesign.spm.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import main.materialdesign.recycle.CardActivity;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{
//widgets declaration
    private Button buttonRecycler;
    private Button buttonCardview;
    private Button buttonShadowClipping;
    private Button buttonDrawable;
    private Button buttonAnimation;
    private Button buttonCompatible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //initialize layout widgets
        findviewbyid();
    }

    private void findviewbyid(){
        buttonRecycler = (Button)findViewById(R.id.buttonRecycle);
        buttonCardview = (Button)findViewById(R.id.buttonCardview);;
        buttonShadowClipping = (Button)findViewById(R.id.buttonShadowClipview);
        buttonDrawable = (Button)findViewById(R.id.buttonDrawable);
        buttonAnimation = (Button)findViewById(R.id.buttonCustomAnimation);
        buttonCompatible = (Button)findViewById(R.id.buttonBackwardCompatible);

        buttonRecycler.setOnClickListener(this);
        buttonCardview.setOnClickListener(this);
        buttonShadowClipping.setOnClickListener(this);
        buttonDrawable.setOnClickListener(this);
        buttonAnimation.setOnClickListener(this);
        buttonCompatible.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonRecycle :
                Intent intentRecycler = new Intent(WelcomeActivity.this,RecyclerViewActivity.class);
                startActivity(intentRecycler);
                break;
            case R.id.buttonCardview :
                Intent intentCard = new Intent(WelcomeActivity.this,CardActivity.class);
                startActivity(intentCard);
                break;
            case R.id.buttonShadowClipview :

                break;
            case R.id.buttonDrawable :

                break;
            case R.id.buttonCustomAnimation :

                break;
            case R.id.buttonBackwardCompatible :

                break;
        }
    }
}
