package dat.project.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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