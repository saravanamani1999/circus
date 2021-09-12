public class Ladder extends Equipment {

    public Ladder(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        System.out.println("hi");
        return purchasePrice / 3;

    }
}
