package View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ibdb.R;

public class infoActivity extends AppCompatActivity {
TextView t,g,y ;
ImageView i;
Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        t=findViewById(R.id.mytitle);
        g=findViewById(R.id.mygenre);
        y=findViewById(R.id.myyear);
        i=findViewById(R.id.myimage);
        bundle=getIntent().getExtras();
        if (bundle!= null) {
          t.setText(bundle.getString("title"));
          g.setText(bundle.getString("genre"));
          y.setText(bundle.getString("year"));
          i.setImageResource(bundle.getInt("image"));
        }
    }
}