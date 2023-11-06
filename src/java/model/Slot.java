package model;

public class Slot {

    private int id;
    private String time;

    public Slot() {
    }

    public Slot(int id, String time) {
        this.id = id;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Slot{" + "id=" + id + ", time=" + time + '}';
    }

}
