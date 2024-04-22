package String;
public class ClassString {
    
    public static void main(String[] args){

        String nome = "Arsène";
        String nomeGuerra = "Arsène";
        String sobrenome = new String("Arsène");

        if(nome.equals(nomeGuerra)){
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }

        if(nome.equals(sobrenome)){
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }

    }

}
