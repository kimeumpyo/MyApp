package org.koreait.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductAdapter extends BaseAdapter {
    // row_item의 배열을 통해서 여러게 배치

    // 상훔명, 상품가격, 상품이미지, 상품갯수
    String[] pdt_name;
    int[] pdt_price;
    int[] pdt_image;
    int[] pdt_count;

    // 어댑터 설정
    Context context;
    LayoutInflater inflater;

    // 생성자
    public ProductAdapter(Context context, String[]pdt_name, int[]pdt_price, int[]pdt_image, int[]pdt_count){
        // 생성자를 통해서 배열의 값을 받아온다
        this.pdt_name = pdt_name;
        this.pdt_image = pdt_image;
        this.pdt_price = pdt_price;
        this.pdt_count = pdt_count;
    }
    @Override
    public int getCount() {
        // 총 갯수가 몇개냐
        return pdt_name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // 각각의 아이템을 보여주기
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(view == null){
            view = inflater.inflate(R.layout.row_item, null);
        }
        // 자바변수와 화면을 연결
        ImageView row_image = view.findViewById(R.id.row_image);
        TextView row_name = view.findViewById(R.id.row_name);
        TextView row_price = view.findViewById(R.id.row_price);
        TextView row_count = view.findViewById(R.id.row_count);
        Button plus_button = view.findViewById(R.id.plus_button2);
        Button minus_button = view.findViewById(R.id.minus_button);

        // 텍스트에 변수값을 반영
        row_image.setImageResource(pdt_image[i]);
        row_name.setText(pdt_name[i]);
        row_price.setText(pdt_price[i]);
        row_count.setText(pdt_count[i]);
        
        // + 버튼
        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // +버튼이 눌리면 count를 1증가시키고
                // 텍스트들에 반영
            }
        });
        
        // - 버튼
        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // -버튼이 눌리면 count를 1감소시키고
                // 텍스트들에 반영
            }
        });
                
        
        return null;
    }

}
