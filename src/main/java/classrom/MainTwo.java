package classrom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Jevgenija";
        String uzvards = "Romanova";
        int vecums = 35;
        boolean isPresent = true;

        System.out.println("Vārds: " + vards + "\n" + "Uzvārds: " + uzvards + "\n"
                + "Vecums: " + vecums + "\n" + "Vai bija nodarbībā? " + isPresent);

        String teikums = String.format("Vārds %s \n Uzvārds %s \n",vards,uzvards);
        System.out.println(teikums);

        ;
    }
}
