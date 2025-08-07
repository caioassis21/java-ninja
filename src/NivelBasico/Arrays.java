package NivelBasico;

public class Arrays {
    public static void main(String[] args) {

       String[] ninja = new String[6];
       ninja[0] = "Naruto Uzumaki";
       ninja[1] = "Sasuke Uchira";
       ninja[2] = "Sakura Haruno";
       ninja[3] = "Hinata Hyuga";
       ninja[4] = "Kakashi Hatake";

       ninja = new String[7];
       ninja[0] = "Hashirama Senju";
       ninja[1] = "Tobirama Senju";
       ninja[2] = "Hiruzen Sarutobi";
       ninja[3] = "Minato Namekaze";
       ninja[4] = "Tsunade";
       ninja[5] = "Kakashi Hatake";
       ninja[6] = "Naruto Uzumaki";

       // Como mostrar toda a lista de ninjas
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

    }
}
