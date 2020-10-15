package dat.project.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecycleAdapter recycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerView = findViewById(R.id.recycleView);

        recycleAdapter = new RecycleAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recycleAdapter.setData(getListUser());
        recyclerView.setAdapter(recycleAdapter);
    }

    private List<NotificationUser> getListUser() {
        List<NotificationUser> notificationUsers = new ArrayList<>();
        notificationUsers.add(new NotificationUser(R.drawable.ic_profile, "Thành Đạt", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_family, "Thái Hà", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_profile, "Thị Mến", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_family, "Văn Bình", "Độc thân vui tính"));

        notificationUsers.add(new NotificationUser(R.drawable.ic_profile, "Thành Đạt", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_family, "Thái Hà", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_profile, "Thị Mến", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_family, "Văn Bình", "Độc thân vui tính"));

        notificationUsers.add(new NotificationUser(R.drawable.ic_profile, "Thành Đạt", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_family, "Thái Hà", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_profile, "Thị Mến", "Độc thân vui tính"));
        notificationUsers.add(new NotificationUser(R.drawable.ic_family, "Văn Bình", "Độc thân vui tính"));

        return notificationUsers;
    }
}