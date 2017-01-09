package com.example.teo.a19intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Khai báo và ánh xa với editText final để hạn chế người sử dụng
        final EditText editText = (EditText) findViewById(R.id.editText1);
        Button button = (Button) findViewById(R.id.button1);
        //Bặt sự kiện button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();
                //Khai bào Intent truyền vào kiểu hiển thị và, địa chỉ hiển thị lên màn hình
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                //Khởi động màn hình
                startActivity(intent);
            }
        });
    }
}
