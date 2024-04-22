package String;

public class ExemplosString {
    
    public static void main(String[] args) {
        
        String nome = "Arsène d'Arc";

        System.out.println(nome);

        System.out.println(nome.length());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.charAt(2));
        System.out.println(nome.isEmpty());
        System.out.println(nome.indexOf("rs"));
        System.out.println(nome.contains("rs"));
        System.out.println(nome.concat(" Alter"));
        System.out.println(nome.equals("arsène d'arc"));
        System.out.println(nome.equalsIgnoreCase("arsène d'arc"));

    }

}
