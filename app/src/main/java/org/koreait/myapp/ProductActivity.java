package org.koreait.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ProductActivity extends AppCompatActivity {

    TextView result_text;
    Button result_button;
    GridView grid_view;

    String pdt_name[] = {"고양이","고양이1","강아지","여우","북극여우","토끼","코끼리","말"};
    int pdt_image[] = {R.drawable.cat,R.drawable.cat1,R.drawable.dog1,R.drawable.fox,R.drawable.icelandfox,R.drawable.raddit,R.drawable.elephant,R.drawable.horse};
    int pdt_price[] = {1000000,2000000,3000000,4000000,5000000,6000000,7000000,8000000};
    int pdt_count[] = {0, 0, 0, 0, 0, 0, 0, 0};
    static int total_price = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        // 화면과 변수를 연결
        result_text = findViewById(R.id.result_text);
        result_button = findViewById(R.id.result_button);
        grid_view = findViewById(R.id.grid_view);

        // 버튼 클릭 기능 추가 (결제하기)
        result_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // PG사와 연결해서 결제진행하는 페이지로 이동
                Toast.makeText(getApplicationContext(),total_price+"원 결제 완료", Toast.LENGTH_LONG).show();
            }
        });
    }
}