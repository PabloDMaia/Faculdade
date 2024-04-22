//Nome da Classe
class MeuPrimeiroProgamaJava
{
    //modulo principal com a entrada pela linha de comando
    public static void main(String entrada[])
    { 
    //Declaracao de variaveis
        int inteiro = 19;
        char caracter = 'M';
        double real = 1.70;
        String frase = "Arsène d'Arc ";
        boolean VF = true;

        if (VF == true)
        {
            System.out.println("Eu sou o " + frase + "tenho " + inteiro + " anos e tenho " + real + "m de altura e sou: " + caracter);
        }

        System.exit(0);
    }
}