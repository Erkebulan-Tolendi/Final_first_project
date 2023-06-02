package kz.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class TestAke extends AppCompatActivity {
    TextView tv_surak1,tv_surak2,tv_surak3,tv_surak4, tv_surak5, tv_surak6, tv_surak7, tv_surak8, tv_surak9, tv_surak10;

    RadioButton rb_s1_jauap1,rb_s1_jauap2,rb_s1_jauap3,rb_s1_jauap4;
    RadioButton rb_s2_jauap1,rb_s2_jauap2,rb_s2_jauap3,rb_s2_jauap4;
    RadioButton rb_s3_jauap1,rb_s3_jauap2,rb_s3_jauap3,rb_s3_jauap4;
    RadioButton rb_s4_jauap1,rb_s4_jauap2,rb_s4_jauap3,rb_s4_jauap4;
    RadioButton rb_s5_jauap1,rb_s5_jauap2,rb_s5_jauap3,rb_s5_jauap4;
    RadioButton rb_s6_jauap1,rb_s6_jauap2,rb_s6_jauap3,rb_s6_jauap4;
    RadioButton rb_s7_jauap1,rb_s7_jauap2,rb_s7_jauap3,rb_s7_jauap4;
    RadioButton rb_s8_jauap1,rb_s8_jauap2,rb_s8_jauap3,rb_s8_jauap4;
    RadioButton rb_s9_jauap1,rb_s9_jauap2,rb_s9_jauap3,rb_s9_jauap4;
    RadioButton rb_s10_jauap1,rb_s10_jauap2,rb_s10_jauap3,rb_s10_jauap4;


    Button btn_check, btn_bal;
    String [] suraktar ={"Jaksy koretin tys ?","Jasy kanshada ?","Anasinin ati ?", "Kai jerde jumis jasagan ?", "Favorite car ?", "Aielinin ati kim ?", "Kansha Balasi bar ?", "Nagashisinin ati ? ", "Akesinin ati ?", "Turatin jeri ?"};
    String [][] variant={
            {"blue", "red", "yellow", "black"},
            {"22" , "70", "79", "90"},
            {"Nagima", "Katish", "Apa", "Daria"},
            {"Factory", "Milk farm", "Driver","Farm"},
            {"Bmw", "M Benz", "Daf","Fiat"},
            {"Jasko", "Daria", "Maria","Fatima"},
            {"7", "3", "9","15"},
            {"Jasko", "Daria", "Maksat","Asan"},
            {"Saginbai", "Berden", "Berdesh","Faizulla"},
            {"Taraz", "Shiely", "Dikhan","Burnoe"},


    };
    String answer[] ={"blue","90","Katish","Farm", "M Benz", "Maria", "9", "Asan", "Berden", "Dikhan"};
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_ake);

        tv_surak1 = findViewById(R.id.tv_surak1);
        tv_surak2 = findViewById(R.id.tv_surak2);
        tv_surak3 = findViewById(R.id.tv_surak3);
        tv_surak4 = findViewById(R.id.tv_surak4);
        tv_surak5 = findViewById(R.id.tv_surak5);
        tv_surak6 = findViewById(R.id.tv_surak6);
        tv_surak7 = findViewById(R.id.tv_surak7);
        tv_surak8 = findViewById(R.id.tv_surak8);
        tv_surak9 = findViewById(R.id.tv_surak9);
        tv_surak10 = findViewById(R.id.tv_surak10);

        rb_s1_jauap1 = findViewById(R.id.rb_s1_jauap1);
        rb_s1_jauap2 = findViewById(R.id.rb_s1_jauap2);
        rb_s1_jauap3 = findViewById(R.id.rb_s1_jauap3);
        rb_s1_jauap4 = findViewById(R.id.rb_s1_jauap4);

        rb_s2_jauap1 = findViewById(R.id.rb_s2_jauap1);
        rb_s2_jauap2 = findViewById(R.id.rb_s2_jauap2);
        rb_s2_jauap3 = findViewById(R.id.rb_s2_jauap3);
        rb_s2_jauap4 = findViewById(R.id.rb_s2_jauap4);

        rb_s3_jauap1 = findViewById(R.id.rb_s3_jauap1);
        rb_s3_jauap2 = findViewById(R.id.rb_s3_jauap2);
        rb_s3_jauap3 = findViewById(R.id.rb_s3_jauap3);
        rb_s3_jauap4 = findViewById(R.id.rb_s3_jauap4);

        rb_s4_jauap1 = findViewById(R.id.rb_s4_jauap1);
        rb_s4_jauap2 = findViewById(R.id.rb_s4_jauap2);
        rb_s4_jauap3 = findViewById(R.id.rb_s4_jauap3);
        rb_s4_jauap4 = findViewById(R.id.rb_s4_jauap4);

        rb_s5_jauap1 = findViewById(R.id.rb_s5_jauap1);
        rb_s5_jauap2 = findViewById(R.id.rb_s5_jauap2);
        rb_s5_jauap3 = findViewById(R.id.rb_s5_jauap3);
        rb_s5_jauap4 = findViewById(R.id.rb_s5_jauap4);

        rb_s6_jauap1 = findViewById(R.id.rb_s6_jauap1);
        rb_s6_jauap2 = findViewById(R.id.rb_s6_jauap2);
        rb_s6_jauap3 = findViewById(R.id.rb_s6_jauap3);
        rb_s6_jauap4 = findViewById(R.id.rb_s6_jauap4);

        rb_s7_jauap1 = findViewById(R.id.rb_s7_jauap1);
        rb_s7_jauap2 = findViewById(R.id.rb_s7_jauap2);
        rb_s7_jauap3 = findViewById(R.id.rb_s7_jauap3);
        rb_s7_jauap4 = findViewById(R.id.rb_s7_jauap4);

        rb_s8_jauap1 = findViewById(R.id.rb_s8_jauap1);
        rb_s8_jauap2 = findViewById(R.id.rb_s8_jauap2);
        rb_s8_jauap3 = findViewById(R.id.rb_s8_jauap3);
        rb_s8_jauap4 = findViewById(R.id.rb_s8_jauap4);

        rb_s9_jauap1 = findViewById(R.id.rb_s9_jauap1);
        rb_s9_jauap2 = findViewById(R.id.rb_s9_jauap2);
        rb_s9_jauap3 = findViewById(R.id.rb_s9_jauap3);
        rb_s9_jauap4 = findViewById(R.id.rb_s9_jauap4);

        rb_s10_jauap1 = findViewById(R.id.rb_s10_jauap1);
        rb_s10_jauap2 = findViewById(R.id.rb_s10_jauap2);
        rb_s10_jauap3 = findViewById(R.id.rb_s10_jauap3);
        rb_s10_jauap4 = findViewById(R.id.rb_s10_jauap4);

        btn_check = findViewById(R.id.btn_check);
        btn_bal = findViewById(R.id.btn_bal);
        suraktarJinau();

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teksris(tv_surak2,rb_s2_jauap1,rb_s2_jauap2,rb_s2_jauap3,rb_s2_jauap4,1);
                teksris(tv_surak1,rb_s1_jauap1,rb_s1_jauap2,rb_s1_jauap3,rb_s1_jauap4,0);
                teksris(tv_surak3,rb_s3_jauap1,rb_s3_jauap2,rb_s3_jauap3,rb_s3_jauap4,2);
                teksris(tv_surak4,rb_s4_jauap1,rb_s4_jauap2,rb_s4_jauap3,rb_s4_jauap4,3);
                teksris(tv_surak5,rb_s5_jauap1,rb_s5_jauap2,rb_s5_jauap3,rb_s5_jauap4,4);
                teksris(tv_surak6,rb_s6_jauap1,rb_s6_jauap2,rb_s6_jauap3,rb_s6_jauap4,5);
                teksris(tv_surak7,rb_s7_jauap1,rb_s7_jauap2,rb_s7_jauap3,rb_s7_jauap4,6);
                teksris(tv_surak8,rb_s8_jauap1,rb_s8_jauap2,rb_s8_jauap3,rb_s8_jauap4,7);
                teksris(tv_surak9,rb_s9_jauap1,rb_s9_jauap2,rb_s9_jauap3,rb_s9_jauap4,8);
                teksris(tv_surak10,rb_s10_jauap1,rb_s10_jauap2,rb_s10_jauap3,rb_s10_jauap4,9);
                btn_bal.setText("Bal: "+(""+(count*100/suraktar.length)+"%"));
                count = 0;
            }
        });

    }

    public void teksris(TextView tv_surak,RadioButton rd1, RadioButton rd2,RadioButton rd3,RadioButton rd4, int index ){
        if(rd1.isChecked() && rd1.getText().toString().equals(answer[index])){
            tv_surak.setText(suraktar[index]+"\ntrue");
            count++;
            tv_surak.setTextColor(getResources().getColor(R.color.green));
        }else if(rd2.isChecked() && rd2.getText().toString().equals(answer[index])){
            tv_surak.setText(suraktar[index]+"\ntrue");
            tv_surak.setTextColor(getResources().getColor(R.color.green));
            count++;
        }else if(rd3.isChecked() && rd3.getText().toString().equals(answer[index])){
            tv_surak.setText(suraktar[index]+"\ntrue");
            tv_surak.setTextColor(getResources().getColor(R.color.green));
            count++;
        }else if(rd4.isChecked() && rd4.getText().toString().equals(answer[index])) {
            tv_surak.setText(suraktar[index]+"\ntrue");
            tv_surak.setTextColor(getResources().getColor(R.color.green));
            count++;
        }else{
            tv_surak.setText(suraktar[index]+"\nfalse");
            tv_surak.setTextColor(getResources().getColor(R.color.red));

        }

    }
    public void suraktarJinau(){
        tv_surak1.setText(suraktar[0]);
        rb_s1_jauap1.setText(variant[0][0]);
        rb_s1_jauap2.setText(variant[0][1]);
        rb_s1_jauap3.setText(variant[0][2]);
        rb_s1_jauap4.setText(variant[0][3]);

        tv_surak2.setText(suraktar[1]);
        rb_s2_jauap1.setText(variant[1][0]);
        rb_s2_jauap2.setText(variant[1][1]);
        rb_s2_jauap3.setText(variant[1][2]);
        rb_s2_jauap4.setText(variant[1][3]);

        tv_surak3.setText(suraktar[2]);
        rb_s3_jauap1.setText(variant[2][0]);
        rb_s3_jauap2.setText(variant[2][1]);
        rb_s3_jauap3.setText(variant[2][2]);
        rb_s3_jauap4.setText(variant[2][3]);

        tv_surak4.setText(suraktar[3]);
        rb_s4_jauap1.setText(variant[3][0]);
        rb_s4_jauap2.setText(variant[3][1]);
        rb_s4_jauap3.setText(variant[3][2]);
        rb_s4_jauap4.setText(variant[3][3]);

        tv_surak5.setText(suraktar[4]);
        rb_s5_jauap1.setText(variant[4][0]);
        rb_s5_jauap2.setText(variant[4][1]);
        rb_s5_jauap3.setText(variant[4][2]);
        rb_s5_jauap4.setText(variant[4][3]);

        tv_surak6.setText(suraktar[5]);
        rb_s6_jauap1.setText(variant[5][0]);
        rb_s6_jauap2.setText(variant[5][1]);
        rb_s6_jauap3.setText(variant[5][2]);
        rb_s6_jauap4.setText(variant[5][3]);

        tv_surak7.setText(suraktar[6]);
        rb_s7_jauap1.setText(variant[6][0]);
        rb_s7_jauap2.setText(variant[6][1]);
        rb_s7_jauap3.setText(variant[6][2]);
        rb_s7_jauap4.setText(variant[6][3]);

        tv_surak8.setText(suraktar[7]);
        rb_s8_jauap1.setText(variant[7][0]);
        rb_s8_jauap2.setText(variant[7][1]);
        rb_s8_jauap3.setText(variant[7][2]);
        rb_s8_jauap4.setText(variant[7][3]);

        tv_surak9.setText(suraktar[8]);
        rb_s9_jauap1.setText(variant[8][0]);
        rb_s9_jauap2.setText(variant[8][1]);
        rb_s9_jauap3.setText(variant[8][2]);
        rb_s9_jauap4.setText(variant[8][3]);

        tv_surak10.setText(suraktar[9]);
        rb_s10_jauap1.setText(variant[9][0]);
        rb_s10_jauap2.setText(variant[9][1]);
        rb_s10_jauap3.setText(variant[9][2]);
        rb_s10_jauap4.setText(variant[9][3]);

    }
}