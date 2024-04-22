public class ExSwitch {
    public static void main(String[] args){
      
        int num = 5;

        switch(num){

            case 1:{
                System.out.println("Você digitou 1");
                break;
            }
            case 2:{
                System.out.println("Você digitou 2");
                break;
            }
            case 3:{
                System.out.println("Você digitou 3");
            }
            default:{
                System.out.print("Você digitou um valor inválido");
            }


        }

    } 

}
