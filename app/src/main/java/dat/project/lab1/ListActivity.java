package dat.project.lab1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Thành Đạt", "Thái Hà", "Bình Nguyễn", "Thu Mến"};
    String mDescription[] = {"Sinh năm 2000, đang ở Đà Nẵng, độc thân", "Sinh năm 2000, đang ở Đà Nẵng, độc thân",
            "Sinh năm 2000, đang ở Đà Nẵng, độc thân", "Sinh năm 2000, đang ở Đà Nẵng, độc thân",};
    int images[] = {R.drawable.ic_profile, R.drawable.ic_family, R.drawable.ic_profile, R.drawable.ic_family,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImg[];

        MyAdapter(Context c, String title[], String description[], int img[]) {
            super(c, R.layout.row, R.id.txtTitle, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImg = img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView imageView = row.findViewById(R.id.image);
            TextView txtTitle = row.findViewById(R.id.txtTitle);
            TextView txtDescription = row.findViewById(R.id.txtDescription);

            imageView.setImageResource(rImg[position]);
            txtTitle.setText(rTitle[position]);
            txtDescription.setText(rDescription[position]);
            return row;
        }
    }
}