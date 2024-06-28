import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Personne p = new Personne("tsiaro");

        int[] tab = {1, 2, 3};

        for(int nb: tab) {
            System.out.println(nb);
        }
        System.out.println(p.getName());

        System.out.print("Hello and welcome!");


    }
}