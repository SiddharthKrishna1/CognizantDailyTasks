interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football!");
    }
}

class Cricket implements Playable {
    public void play() {
        System.out.println("Playing Cricket!");
    }
}

class Tennis implements Playable {
    public void play() {
        System.out.println("Playing Tennis!");
    }
}

public class PlayTest {
    public static void main(String[] args) {
        Playable[] games = { new Football(), new Cricket(), new Tennis() };

        for (Playable game : games) {
            game.play();
        }
    }
}
