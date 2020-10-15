package dat.project.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.UserViewHolder> {
    private Context context;
    private List<NotificationUser> notificationUsers;

    public RecycleAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<NotificationUser> list) {
        this.notificationUsers = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        NotificationUser notificationUser = notificationUsers.get(position);
        if (notificationUser == null)
            return;

        holder.imageViewUser.setImageResource(notificationUser.getResourceID());
        holder.txtTitle.setText(notificationUser.getTitle());
        holder.txtDescription.setText(notificationUser.getDescription());
    }

    @Override
    public int getItemCount() {
        if (notificationUsers != null)
            return notificationUsers.size();
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewUser;
        TextView txtTitle, txtDescription;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewUser = itemView.findViewById(R.id.imgUser);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);

        }
    }
}
