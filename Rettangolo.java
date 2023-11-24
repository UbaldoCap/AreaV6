public class Rettangolo extends  Forma {
    public Rettangolo(int x, int y, TipoForma tipoForma) {
        super(x, y, tipoForma);
    }

    @Override
    public void calcolaArea() {
        System.out.println(getX() * getY());
    }
}
