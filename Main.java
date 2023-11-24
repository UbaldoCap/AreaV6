public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 6, TipoForma.Rettangolo);
        rettangolo.calcolaArea();
        Triangolo triangolo = new Triangolo(10, 4, TipoForma.Triangolo);
        triangolo.calcolaArea();
    }
}