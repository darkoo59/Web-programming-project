package model;

import utils.enums.SportsFacilityStatus;
import utils.others.WorkHour;

import java.awt.*;
import java.util.ArrayList;

public class SportsFacility {

    private String id;
    private String name;
    private String type;
    private ArrayList<String> content;
    private SportsFacilityStatus status;
    private Location location;
    private Image logo;
    private double averageRating;
    private WorkHour workHour;

    public SportsFacility(String name, String type, ArrayList<String> content, SportsFacilityStatus status,
                          Location location, Image logo, double averageRating, WorkHour workHour) {
        this.name = name;
        this.type = type;
        this.content = content;
        this.status = status;
        this.location = location;
        this.logo = logo;
        this.averageRating = averageRating;
        this.workHour = workHour;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getContent() {
        return content;
    }

    public void setContent(ArrayList<String> content) {
        this.content = content;
    }

    public SportsFacilityStatus getStatus() {
        return status;
    }

    public void setStatus(SportsFacilityStatus status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Image getLogo() {
        return logo;
    }

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public WorkHour getWorkHour() {
        return workHour;
    }

    public void setWorkHour(WorkHour workHour) {
        this.workHour = workHour;
    }
}
