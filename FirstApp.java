package sample.first_app;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import static android.view.animation.Animation.REVERSE;

public class FirstApp extends AppCompatActivity {

    private TextView txt;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_app);
        txt = (TextView) findViewById(R.id.txt);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       blinkingeffect();
                                   }
                               }

        );
    }

    private void blinkingeffect(){
        ObjectAnimator animator = ObjectAnimator.ofInt(txt, "backgroundColor", Color.WHITE, Color.RED, Color.WHITE);
        animator.setDuration(800);
        animator.setEvaluator(new ArgbEvaluator());
        animator.setRepeatMode(Animation.REVERSE);
        animator.setRepeatCount(Animation.INFINITE);
        animator.start();

    }

}
