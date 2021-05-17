package aleksa.mosis.elfak.myplaces;

public class MyPlace {
    int ID;
    String name;
    String description;
    String longitude;
    String latitude;

    public MyPlace(String name,String desc){
        this.name=name;
        this.description=desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public MyPlace(String name){
        this(name, "");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
