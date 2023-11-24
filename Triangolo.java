public class Triangolo extends Forma {
    public Triangolo(int x, int y, TipoForma tipoForma) {
        super(x, y, tipoForma);
    }

    @Override
    public void calcolaArea() {
        System.out.println((getX() * getY())/ 2);
    }
}
