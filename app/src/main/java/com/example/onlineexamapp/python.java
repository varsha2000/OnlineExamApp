package com.example.onlineexamapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class python extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;

    Button b5;
    TextView t1_questions;

    int correct=0;
    DatabaseReference reference;
    int wrong=0;
    int total=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b5=(Button)findViewById(R.id.button5);
        t1_questions=( TextView)findViewById(R.id.questionsTxt);
        updateQuestions();

    }
    public void updateQuestions()
    {


        total++;
        if(total>5)
        {

            Intent i=new Intent(python.this,Cppquizresult.class);

            i.putExtra("correct",String.valueOf(correct));

            startActivity(i);
        }
        else{
            reference= FirebaseDatabase.getInstance().getReference().child("pythonQuestions").child(String.valueOf(total));
            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    Questions question;
                    question = snapshot.getValue(Questions.class);
                    assert question != null;
                    t1_questions.setText(question.getQuestion());
                    b1.setText(question.getOption1());
                    b2.setText(question.getOption2());
                    b3.setText(question.getOption3());
                    b5.setText(question.getOption5());


                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (b1.getText().toString().equals(question.getAnswer())) {
                                b1.setBackgroundColor(Color.GREEN);
                                correct++;
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b1.setBackgroundColor(Color.parseColor("#03A9f4"));
                                        updateQuestions();
                                    }
                                }, 500);
                            } else {
                                //answer wrong
                                wrong++;

                                b1.setBackgroundColor(Color.RED);

                                if (b2.getText().toString().equals((question.getAnswer()))) {
                                    b2.setBackgroundColor(Color.GREEN);

                                } else if (b3.getText().toString().equals(question.getAnswer())) {
                                    b3.setBackgroundColor(Color.GREEN);

                                }
                                else if (b5.getText().toString().equals(question.getAnswer())) {
                                    b5.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b1.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b2.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b3.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b5.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        updateQuestions();

                                    }
                                }, 500);




                            }
                        }
                    });



                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (b2.getText().toString().equals(question.getAnswer())) {
                                b2.setBackgroundColor(Color.GREEN);
                                correct++;
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b2.setBackgroundColor(Color.parseColor("#03A9f4"));
                                        updateQuestions();
                                    }
                                }, 500);
                            } else {
                                //answer wrong
                                wrong++;

                                b2.setBackgroundColor(Color.RED);

                                if (b1.getText().toString().equals((question.getAnswer()))) {
                                    b1.setBackgroundColor(Color.GREEN);

                                } else if (b3.getText().toString().equals(question.getAnswer())) {
                                    b3.setBackgroundColor(Color.GREEN);

                                }
                                else if (b5.getText().toString().equals(question.getAnswer())) {
                                    b5.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b1.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b2.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b3.setBackgroundColor(Color.parseColor("#03A9F4"));

                                        b5.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        updateQuestions();

                                    }
                                }, 500);




                            }
                        }
                    });

                    b3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (b3.getText().toString().equals(question.getAnswer())) {
                                b3.setBackgroundColor(Color.GREEN);
                                correct++;
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b3.setBackgroundColor(Color.parseColor("#03A9f4"));
                                        updateQuestions();
                                    }
                                }, 500);
                            } else {
                                //answer wrong
                                wrong++;

                                b3.setBackgroundColor(Color.RED);

                                if (b2.getText().toString().equals((question.getAnswer()))) {
                                    b2.setBackgroundColor(Color.GREEN);

                                } else if (b1.getText().toString().equals(question.getAnswer())) {
                                    b1.setBackgroundColor(Color.GREEN);

                                }
                                else if (b5.getText().toString().equals(question.getAnswer())) {
                                    b5.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b1.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b2.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b3.setBackgroundColor(Color.parseColor("#03A9F4"));

                                        b5.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        updateQuestions();

                                    }
                                }, 500);




                            }
                        }
                    });


                    b5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (b5.getText().toString().equals(question.getAnswer())) {
                                b5.setBackgroundColor(Color.GREEN);
                                correct++;
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b5.setBackgroundColor(Color.parseColor("#03A9f4"));
                                        updateQuestions();
                                    }
                                }, 500);
                            } else {
                                //answer wrong
                                wrong++;

                                b5.setBackgroundColor(Color.RED);

                                if (b2.getText().toString().equals((question.getAnswer()))) {
                                    b2.setBackgroundColor(Color.GREEN);

                                } else if (b3.getText().toString().equals(question.getAnswer())) {
                                    b3.setBackgroundColor(Color.GREEN);

                                }
                                else if (b1.getText().toString().equals(question.getAnswer())) {
                                    b1.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        b1.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b2.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        b3.setBackgroundColor(Color.parseColor("#03A9F4"));

                                        b5.setBackgroundColor(Color.parseColor("#03A9F4"));
                                        updateQuestions();

                                    }
                                }, 500);




                            }
                        }
                    });




                }

                @Override
                public void onCancelled(@NonNull  DatabaseError error) {

                }
            });
        }
    }





}