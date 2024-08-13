package Facade;

public class DvdPlayer {
    private String description;
    private String movie;

    public DvdPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void eject() {
        movie = null;
        System.out.println(description + " eject");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println(description + " stopped \"" + movie + "\"");
    }

    public String toString() {
        return description;
    }
}
