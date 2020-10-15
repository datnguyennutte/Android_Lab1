package dat.project.lab1;
//Tạo object recycle view

public class NotificationUser {
    private int ResourceID;
    private String Title;
    private String Description;

    public NotificationUser(int resourceID, String title, String description) {
        ResourceID = resourceID;
        Title = title;
        Description = description;
    }

    public int getResourceID() {
        return ResourceID;
    }

    public void setResourceID(int resourceID) {
        ResourceID = resourceID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
