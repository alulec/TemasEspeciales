public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Los tres mosqueteros", "Alejandro Dumas", "970-07-2670-3", "Porrua Mexico","2000");

        miLibro.Leer();
        miLibro.Guardar();
    }
}