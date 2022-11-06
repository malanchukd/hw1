package abstractclass;

public class Cymbals extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.println("v : " + note);
    }
}
