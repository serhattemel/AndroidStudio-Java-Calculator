package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kotlin.jvm.internal.Ref;

public class MainActivity extends AppCompatActivity {

    String first="";
    String second="";

    Float x;
    Float y;
    Float z;


    TextView calculate;
    String symbol= null;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate= (TextView) findViewById(R.id.calculate);
        Button equal = findViewById(R.id.equal);
        Button dot = findViewById(R.id.bdot);
        Button plus = findViewById(R.id.bplus);
        Button minus = findViewById(R.id.bminus);
        Button divide = findViewById(R.id.bdevide);
        Button multi = findViewById(R.id.bx);
        Button zero = findViewById(R.id.b0);
        Button one = findViewById(R.id.b1);
        Button two = findViewById(R.id.b2);
        Button three = findViewById(R.id.b3);
        Button four = findViewById(R.id.b4);
        Button five = findViewById(R.id.b5);
        Button six = findViewById(R.id.b6);
        Button seven = findViewById(R.id.b7);
        Button eight = findViewById(R.id.b8);
        Button nine = findViewById(R.id.b9);
        Button clear = findViewById(R.id.clear);

        calculate.setText("0");

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y = Float.parseFloat(first);
                Hesap();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator(".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(symbol==null) {
                    calculate.setText("0");
                    second = first;
                    x = Float.parseFloat(second);
                    first="";
                    symbol="+";
                }

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(symbol!=null&&first=="")
                {
                    if(symbol=="-")
                    {
                        symbol="+";
                    }
                    if(symbol=="+"||symbol=="x"||symbol=="/")
                    {
                        first="-";
                    }
                }
                if(symbol==null&&first!="") {
                    calculate.setText("0");
                    second = first;
                    x = Float.parseFloat(second);
                    first="";
                    symbol="-";

                }
                if(symbol==null&&first=="")
                {
                    first = "-";
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(symbol==null&&first!="") {
                    calculate.setText("0");
                    second = first;
                    x = Float.parseFloat(second);
                    first="";
                    symbol="/";
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(symbol==null) {
                    calculate.setText("0");
                    second = first;
                    x = Float.parseFloat(second);
                    first="";
                    symbol="x";
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator("9");
            }
        });

    }
    public void calculator(String value) {
        if(value == "0")
        {
            if(first=="")
            {
                return;
            }
            else
                first = first + value;
        }
        if(value == "1")
        {
            first = first + value;
        }
        if(value == "2")
        {
            first = first + value;
        }
        if(value == "3")
        {
            first = first + value;
        }
        if(value == "4")
        {
            first = first + value;
        }
        if(value == "5")
        {
            first = first + value;
        }
        if(value == "6")
        {
            first = first + value;
        }
        if(value == "7")
        {
            first = first + value;
        }
        if(value == "8")
        {
            first = first + value;
        }
        if(value == "9")
        {
            first = first + value;
        }
        if(value == ".")
        {
            first = first + value;
        }

        calculate.setText(first);
    }
    public void Clear()
    {
        first="";
        second="";
        calculate.setText("0");
        symbol=null;
    }
    @SuppressLint("SuspiciousIndentation")
    public void Hesap()
    {
        if(symbol=="+")
        {
            z=x+y;
            if(z-Math.floor(z)==0)
            {
                int v =Math.round(z);
                calculate.setText(""+v);

            }
            else
            calculate.setText(""+z);

        }
        if(symbol=="-")
        {
            z=x-y;
            if(z-Math.floor(z)==0)
            {
                int v =Math.round(z);
                calculate.setText(""+v);

            }
            else
                calculate.setText(""+z);
        }
        if(symbol=="x")
        {
            z=x*y;
            if(z-Math.floor(z)==0)
            {
                int v =Math.round(z);
                calculate.setText(""+v);

            }
            else
                calculate.setText(""+z);
        }
        if(symbol=="/")
        {
            z=x/y;
            if(z-Math.floor(z)==0)
            {
                int v =Math.round(z);
                calculate.setText(""+v);

            }
            else
                calculate.setText(""+z);
        }
    }

}