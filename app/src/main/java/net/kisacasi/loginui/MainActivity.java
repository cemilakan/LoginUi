package net.kisacasi.loginui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Animation frombottom,fromtop;
        CardView cardViewLogin;
        LinearLayout linearLayoutTop;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewLogin=findViewById(R.id.cardViewLog);
        linearLayoutTop=findViewById(R.id.linearLayoutTop);

        frombottom= AnimationUtils.loadAnimation(this,R.anim.zoom_out);
        fromtop= AnimationUtils.loadAnimation(this,R.anim.fromtop);

        linearLayoutTop.startAnimation(fromtop);
        cardViewLogin.startAnimation(frombottom);
    }
}
