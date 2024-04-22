package String;

public class StringBuffer {
    
    public static void main(String[] args){

        String nome = "Arsène";
        String sobrenome = "d'Arc";
        String nomeCompleto = nome + sobrenome;
        String nomeComBuffer;


        StringBuffer buffer = new StringBuffer();

        //buffer.append(nome);
        //buffer.append(sobrenome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }


}

