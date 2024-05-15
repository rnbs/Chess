package utils;

public enum Colour {
    Black, White;

    public Colour toggle() {
        return this.equals(Colour.Black) ? Colour.White : Colour.Black;
    }

    @Override
    public String toString() {
        return this.equals(Colour.White) ? "White" : "Black";
    }
}
