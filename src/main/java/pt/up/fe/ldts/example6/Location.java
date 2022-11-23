package pt.up.fe.ldts.example6;

public class Location {
    private final String name;
    private final String latitude;
    private final String longitude;
    public Location(String name, String latitude, String longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String toString() {
        return this.latitude + "," + this.longitude + " (" + this.name + ")";
    }
}
