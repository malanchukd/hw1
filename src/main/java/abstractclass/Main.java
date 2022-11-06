package abstractclass;

public class Main {
    public static void main(String[] args) {
        Instrument drum = new Drum();
        drum.play("bum bum");
        Instrument  guitar = new Guitar();
        guitar.play("bryn bryn");
        Instrument violin = new Violin();
        violin.play("skryp skryp");
        Instrument cymbals = new Cymbals();
        cymbals.play("din din");
    }
}
