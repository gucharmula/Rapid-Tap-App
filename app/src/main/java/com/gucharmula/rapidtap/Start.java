package com.gucharmula.rapidtap;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class Start extends AppCompatActivity {

    //Instance Variables Go Here
    private Random randGen = new Random ();
    private int randNum;
    private Button startBtn;
    private TextView scoreDisplay;
    private int score;
    private String scoreSTRING;
    private ArrayList<Button> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        startBtn = (Button) findViewById(R.id.startButton);
        scoreDisplay = (TextView) findViewById(R.id.textView3);
        buttons = new ArrayList <Button>();


        final Activity activity = this;
        startBtn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                setContentView(R.layout.activity_rapid_tap);
            }

        });
        //Add buttons to an Array List
        buttons.add((Button) findViewById(R.id.button));
        buttons.add((Button) findViewById(R.id.button2));
        buttons.add((Button) findViewById(R.id.button3));
        buttons.add((Button) findViewById(R.id.button7));
        buttons.add((Button) findViewById(R.id.button5));
        buttons.add((Button) findViewById(R.id.button6));
        buttons.add((Button) findViewById(R.id.button8));
        buttons.add((Button) findViewById(R.id.button9));
        buttons.add((Button) findViewById(R.id.button10));
        buttons.add((Button) findViewById(R.id.button11));
        buttons.add((Button) findViewById(R.id.button12));
        buttons.add((Button) findViewById(R.id.button13));
        buttons.add((Button) findViewById(R.id.button14));
        buttons.add((Button) findViewById(R.id.button15));
        buttons.add((Button) findViewById(R.id.button18));
        buttons.add((Button) findViewById(R.id.button19));
        buttons.add((Button) findViewById(R.id.button20));
        buttons.add((Button) findViewById(R.id.button21));
        buttons.add((Button) findViewById(R.id.button22));
        buttons.add((Button) findViewById(R.id.button23));
        buttons.add((Button) findViewById(R.id.button24));
        buttons.add((Button) findViewById(R.id.button25));
        buttons.add((Button) findViewById(R.id.button26));
        buttons.add((Button) findViewById(R.id.button27));
        buttons.add((Button) findViewById(R.id.button28));
        buttons.add((Button) findViewById(R.id.button29));
        buttons.add((Button) findViewById(R.id.button30));
        buttons.add((Button) findViewById(R.id.button31));
        buttons.add((Button) findViewById(R.id.button32));
        buttons.add((Button) findViewById(R.id.button33));
        buttons.add((Button) findViewById(R.id.button34));
        buttons.add((Button) findViewById(R.id.button35));
        buttons.add((Button) findViewById(R.id.button38));
        buttons.add((Button) findViewById(R.id.button39));
        buttons.add((Button) findViewById(R.id.button40));
        buttons.add((Button) findViewById(R.id.button41));
        buttons.add((Button) findViewById(R.id.button42));
        buttons.add((Button) findViewById(R.id.button43));
        buttons.add((Button) findViewById(R.id.button44));
        buttons.add((Button) findViewById(R.id.button45));
        buttons.add((Button) findViewById(R.id.button46));
        buttons.add((Button) findViewById(R.id.button47));
        buttons.add((Button) findViewById(R.id.button48));
        buttons.add((Button) findViewById(R.id.button51));
        buttons.add((Button) findViewById(R.id.button52));
        buttons.add((Button) findViewById(R.id.button53));
        buttons.add((Button) findViewById(R.id.button54));
        buttons.add((Button) findViewById(R.id.button55));
        buttons.add((Button) findViewById(R.id.button56));
        buttons.add((Button) findViewById(R.id.button57));
        buttons.add((Button) findViewById(R.id.button58));
        buttons.add((Button) findViewById(R.id.button59));
        buttons.add((Button) findViewById(R.id.button60));
        buttons.add((Button) findViewById(R.id.button61));
        buttons.add((Button) findViewById(R.id.button62));
        buttons.add((Button) findViewById(R.id.button63));
        buttons.add((Button) findViewById(R.id.button64));
        buttons.add((Button) findViewById(R.id.button65));
        buttons.add((Button) findViewById(R.id.button66));
        buttons.add((Button) findViewById(R.id.button67));
        buttons.add((Button) findViewById(R.id.button68));
        buttons.add((Button) findViewById(R.id.button69));
        buttons.add((Button) findViewById(R.id.button70));
        buttons.add((Button) findViewById(R.id.button71));
        buttons.add((Button) findViewById(R.id.button72));
        buttons.add((Button) findViewById(R.id.button73));
        buttons.add((Button) findViewById(R.id.button74));
        buttons.add((Button) findViewById(R.id.button75));
        buttons.add((Button) findViewById(R.id.button76));
        buttons.add((Button) findViewById(R.id.button77));
        buttons.add((Button) findViewById(R.id.button78));
        buttons.add((Button) findViewById(R.id.button79));
        buttons.add((Button) findViewById(R.id.button80));
        buttons.add((Button) findViewById(R.id.button81));
        buttons.add((Button) findViewById(R.id.button82));
        buttons.add((Button) findViewById(R.id.button83));
        buttons.add((Button) findViewById(R.id.button84));
        buttons.add((Button) findViewById(R.id.button85));
        buttons.add((Button) findViewById(R.id.button86));
        buttons.add((Button) findViewById(R.id.button87));
        buttons.add((Button) findViewById(R.id.button88));
        buttons.add((Button) findViewById(R.id.button89));
        buttons.add((Button) findViewById(R.id.button90));
        buttons.add((Button) findViewById(R.id.button91));

        score = 0;

        scoreDisplay.setText(score);

        for (Button x : buttons) {
            x.setVisibility(View.INVISIBLE);
            x.setText("CLICK ME");
        }

        run(buttons, scoreDisplay);

    }

    private boolean buttonIsClicked(Button buttonToClick) {
        for (int i = 0; i < 1500; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            if(buttonToClick.isPressed()){
                return true;
            }
        }
        return false;
    }

    private boolean step(ArrayList<Button> buttons, TextView scoreDisplay) {

        randNum = randGen.nextInt(84);
        Button randButton = buttons.get(randNum);
        randButton.setVisibility(View.VISIBLE);
        boolean returnBool = buttonIsClicked(randButton);
        return returnBool;
    }

    private void run(ArrayList<Button> buttons, TextView scoreDisplay){

        while(step(buttons, scoreDisplay)){
            score++;
            scoreDisplay.setText(score);
        }
        setContentView(R.layout.activity_start);


    }


}