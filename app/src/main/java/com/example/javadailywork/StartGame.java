package com.example.javadailywork;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class StartGame extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_start_game);
//    }
//}
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StartGame extends AppCompatActivity {


    // Declare a TextView for showing Timer
    TextView tvTimer;
    // A TextView for showing Result
    TextView tvResult;
    // An ImageView for showing an image in question
    ImageView ivShowImage;
    // Instantiate a HashMap to store technology names and corresponding image resource ids
    HashMap<String, Integer> map = new HashMap<>();
    // An ArrayList for storing technology names only
    ArrayList<String> wordsList = new ArrayList<>();
    // Declare an index variable. We'll keep incrementing it as the quiz proceeds to
    // the next questions.
    int index;
    // Declare four button object references for displaying four options to choose from
    Button btn1, btn2, btn3, btn4;
    // A TextView for displaying points
    TextView tvPoints;
    // An integer variable to store points
    int points;
    // A CountDownTimer object reference
    CountDownTimer countDownTimer;
    // And a long integer to store the time limit for each question to be used
    // with the CountDownTimer.
    long millisUntilFinished;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        // Set the content view with a layout file.
        tvTimer = findViewById(R.id.tvTimer);
        // Get the handles for the Views
        tvResult = findViewById(R.id.tvResult);
        ivShowImage = findViewById(R.id.ivShowImage);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tvPoints = findViewById(R.id.tvPoints);
        // Initialize index with 0
        index = 0;
        // Populate wordsList with all the technology names
        wordsList.add("A");
        wordsList.add("B");
        wordsList.add("C");
        wordsList.add("D");
        wordsList.add("E");
        wordsList.add("F");
        wordsList.add("G");
        wordsList.add("H");
        wordsList.add("I");
        wordsList.add("J");
        wordsList.add("K");
        wordsList.add("L");
        wordsList.add("M");
        wordsList.add("N");
        wordsList.add("O");
        wordsList.add("P");
        // Put all the technology names with technology image resource ids in map.
        map.put(wordsList.get(0), R.drawable.apple);
        map.put(wordsList.get(1), R.drawable.banana);
        map.put(wordsList.get(2), R.drawable.cat);
        map.put(wordsList.get(3), R.drawable.dog);
        map.put(wordsList.get(4), R.drawable.egg);
        map.put(wordsList.get(5), R.drawable.fish);
        map.put(wordsList.get(6), R.drawable.glue);
        map.put(wordsList.get(7), R.drawable.hat);
        map.put(wordsList.get(8), R.drawable.ice);
        map.put(wordsList.get(9), R.drawable.jug);
        map.put(wordsList.get(10), R.drawable.key);
        map.put(wordsList.get(11), R.drawable.lion);
        map.put(wordsList.get(12), R.drawable.monkey);
        map.put(wordsList.get(13), R.drawable.nose);
        map.put(wordsList.get(14), R.drawable.orange);
        map.put(wordsList.get(15), R.drawable.pen);
        // Shuffle wordsList so that each time we open the app it starts with
        // a random question
        Collections.shuffle(wordsList);
        // Initialize millisUntilFinished. Set 10 thousand milliseconds or
        // 10 seconds time limit for each question (or as per your need).
        millisUntilFinished = 10000;
        // Initialize points to 0
        points = 0;
        // Call startGame() method that is responsible for starting the quiz.
        startGame();
    }

    private void startGame() {
        // Initialize millisUntilFinished with 10 seconds.
        millisUntilFinished = 10000;
        // Set the TextView for Timer.
        tvTimer.setText("" + (millisUntilFinished / 1000) + "s");
        // Set the TextView for points.
        tvPoints.setText(points + " / " + wordsList.size());
        // To generate a question, call generateQuestions() method and pass
        // index as parameter.
        generateQuestions(index);
        countDownTimer = new CountDownTimer(millisUntilFinished, 1000) {
            // In our case, onTick() callback method is fired on regular intervals of
            // 1000 milliseconds or 1 second and onFinish() callback method is fired
            // when the timer finishes.
            @Override
            public void onTick(long millisUntilFinished) {
                // Update tvTimer every 1 second to show the number of seconds remaining.
                tvTimer.setText("" + (millisUntilFinished / 1000) + "s");
            }

            @Override
            public void onFinish() {
                // Increment index by 1 so that the next question can be presented
                // automatically when the user is unable to select his/her answer.
                index++;
                // When timer is finished check if all questions are being asked.
                if (index > wordsList.size() - 1){
                    // If true, hide the ImageView and Buttons.
                    ivShowImage.setVisibility(View.GONE);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    btn3.setVisibility(View.GONE);
                    btn4.setVisibility(View.GONE);
                    // Go to GameOver screen with points using an Intent
                    Intent intent = new Intent(StartGame.this, GameOver.class);
                    intent.putExtra("points", points);
                    startActivity(intent);
                    // Finish StartGame Activity
                    finish();
                } else {
                    // In the else part, that is, if all questions are not being asked,
                    // initialize countDownTimer with null and call startGame() again.
                    // And this is the case, when no answer is selected before the
                    // time limit is over. So, the player will be presented with the
                    // next question and no points will be granted. If you want
                    // you can also decrement the points here for skipping a question
                    // and that'll make the quiz a bit harder.
                    countDownTimer = null;
                    startGame();
                }
            }
        }.start(); // Call start() method to start the timer.
    }

    private void generateQuestions(int index) {
        // Clone wordsList to a new ArrayList called wordsListTemp.
        ArrayList<String> wordsListTemp = (ArrayList<String>) wordsList.clone();
        // Get the correct answer for the current question from wordsList using index.
        String correctAnswer = wordsList.get(index);
        // You need to find three non-repeated incorrect answers randomly.
        // So, delete the correct answer from wordsListTemp.
        // Shuffle it and get first three elements from it.
        wordsListTemp.remove(correctAnswer);
        Collections.shuffle(wordsListTemp);
        // Create a temporary ArrayList for storing three non-repeated random answers
        // from wordsListTemp and one correct answer.
        ArrayList<String> newList = new ArrayList<>();
        // Get first three elements from wordsListTemp and add into newList.
        newList.add(wordsListTemp.get(0));
        newList.add(wordsListTemp.get(1));
        newList.add(wordsListTemp.get(2));
        // Also add the correct answer into newList
        newList.add(correctAnswer);
        // Shuffle newList so that the correct answer can be placed in one of the four
        // buttons, randomly.
        Collections.shuffle(newList);
        // Once you shuffle newList, set all four Button's text with the elements
        // from newList.
        btn1.setText(newList.get(0));
        btn2.setText(newList.get(1));
        btn3.setText(newList.get(2));
        btn4.setText(newList.get(3));
        // Also, set the ImageView with current image from map
        ivShowImage.setImageResource(map.get(wordsList.get(index)));
    }

    public void nextQuestion(View view) {
        // This method is called because the user has tapped the Next button,
        // so, set the background color of all the buttons to the color that we used in start_game.xml.
        btn1.setBackgroundColor(Color.parseColor("#2196f3"));
        btn2.setBackgroundColor(Color.parseColor("#2196f3"));
        btn3.setBackgroundColor(Color.parseColor("#2196f3"));
        btn4.setBackgroundColor(Color.parseColor("#2196f3"));
        // Enable the buttons
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        // Cancel the countDownTimer
        countDownTimer.cancel();
        index++;
        // Check if all questions have been asked.
        if (index > wordsList.size() - 1){
            // If true, hide the ImageView and Buttons.
            ivShowImage.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE);
            btn2.setVisibility(View.GONE);
            btn3.setVisibility(View.GONE);
            btn4.setVisibility(View.GONE);
            // Go to GameOver screen with points
            Intent intent = new Intent(StartGame.this, GameOver.class);
            intent.putExtra("points", points);
            startActivity(intent);
            // Finish StartGame Activity
            finish();
        } else {
            // Till there is at least one question left, initialize countDownTimer with null and
            // call startGame()
            countDownTimer = null;
            startGame();
        }
    }

    public void answerSelected(View view) {
        // Change the clicked Button's background color
        view.setBackgroundColor(Color.parseColor("#17243e"));
        // Disable all four Buttons
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        // The user has selected an answer, so, cancel the countDownTimer
        countDownTimer.cancel();
        // Get clicked button's text for user answer
        String answer = ((Button) view).getText().toString().trim();
        // And, get the correct answer for the current question from wordsList using index
        // as position.
        String correctAnswer = wordsList.get(index);
        // Compare answer and correctAnswer, that is, the answer selected by the user
        // and the correct answer for this question.
        if(answer.equals(correctAnswer)){
            // If true, the user has selected the right answer. So, increment points.
            points++;
            // Here we are incrementing points by 1 here, but, you can increment by any number
            // you want.
            // Update the TextViews for points and result
            tvPoints.setText(points + " / " + wordsList.size());
            tvResult.setText("Correct");
        } else {
            // In else, that is, when the user answer is incorrect, show "Wrong" in tvResult.
            tvResult.setText("Wrong");
        }
    }
}