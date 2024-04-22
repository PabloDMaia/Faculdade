package String;

public class StringBuilder {
    
    public static void main(String[] args){

        String nome = "Arsène";
        String sobrenome = "d'Arc";
        String nomeCompleto = nome + sobrenome;
        String nomeComBuilder;


        StringBuilder builder = new StringBuilder();

        //builder.append(nome);
        //builder.append(sobrenome);

        nomeComBuilder = builder.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuilder);
    }

}
