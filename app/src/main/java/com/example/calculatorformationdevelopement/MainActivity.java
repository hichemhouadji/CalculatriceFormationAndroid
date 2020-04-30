package com.example.calculatorformationdevelopement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmode,badd,bsub,bmul,bdiv,bdot,back,bequal,reset;
    TextView ans;
    double var1,var2;
    boolean add,sub,mul,div,mremainder,decimal;
    String processor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.btn_one);
        b2= (Button) findViewById(R.id.btn_two);
        b3= (Button) findViewById(R.id.btn_three);
        b4= (Button) findViewById(R.id.btn_foor);
        b5= (Button) findViewById(R.id.btn_five);
        b6= (Button) findViewById(R.id.btn_sexe);
        b7= (Button) findViewById(R.id.btn_seven);
        b8= (Button) findViewById(R.id.btn_eight);
        b9= (Button) findViewById(R.id.btn_nine);
        b0= (Button) findViewById(R.id.btn_zero);
        badd= (Button) findViewById(R.id.btn_add);
        bsub= (Button) findViewById(R.id.btn_substraction);
        bmul= (Button) findViewById(R.id.btn_multiple);
        bdiv= (Button) findViewById(R.id.btn_divisionn);
        bdot= (Button) findViewById(R.id.btn_dot);
        bmode= (Button) findViewById(R.id.btn_perce) ;
        bequal = (Button) findViewById(R.id.btn_equals);
        reset= (Button) findViewById(R.id.btn_delet);
        back= (Button) findViewById(R.id.btn_backk);

        ;

        ans = (TextView) findViewById(R.id.result_txt);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = ans.getText().toString();
                if (processor.length()>0) {
                    processor = processor.substring(0, processor.length() - 1);
                    ans.setText(processor);
                }
            }
        });
        bmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().length() != 0) {
                    var1 = Double.parseDouble(ans.getText() + "");
                    mremainder = true;
                    decimal = false;
                    ans.setText(null);
                }
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                decimal = false;
                ans.setText(null);

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                sub=true;
                decimal = false;

                ans.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                mul=true;
                decimal = false;

                ans.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(ans.getText()+"");
                div=true;
                decimal = false;
                ans.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 =  Double.parseDouble(ans.getText()+"");
                if(add==true)
                {
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    ans.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true)
                {
                    ans.setText(var1/var2+"");
                    div=false;
                }
                if (mremainder==true) {
                    ans.setText(var1 % var2 + "");
                    mremainder = false;}
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");

            }
        });
    }
}