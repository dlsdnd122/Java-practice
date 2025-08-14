package ch7_problem.mediaplayer;

public class MediaPlayer {
    String name;
    int volume;
    int light;

//    public MediaPlayer(String name, int volume, int light) {
//        this.name = name;
//        this.volume = volume;
//        this.light = light;
//    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int setVolume(int volume) {
        this.volume = volume;
        return volume;
    }

    public int getLight() {
        return light;
    }

    public int setLight(int light) {
        this.light = light;
        return light;
    }
}
