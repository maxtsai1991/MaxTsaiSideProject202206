package max.com.maxtsaisideproject202206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TempActivity extends AppCompatActivity {
    ImageButton ib_home,ib_function,ib_temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        findViews();
        handles();
    }


    private void findViews() {
        ib_home = (ImageButton) findViewById(R.id.ib_home);
        ib_function = (ImageButton) findViewById(R.id.ib_function);
        ib_temp = (ImageButton) findViewById(R.id.ib_temp);
    }

    private void handles() {
        ib_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(TempActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        ib_function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(TempActivity.this,FunctionActivity.class);
                startActivity(intent);
            }
        });

        ib_temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(TempActivity.this,TempActivity.class);
                startActivity(intent);
            }
        });

    }
}