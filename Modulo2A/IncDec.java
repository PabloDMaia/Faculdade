public class IncDec {
    
    public static void main(String[] args){

        int num1, num2;
        
        num1 = 6;
        num2 = 6;

        System.out.println(num1); //6
        System.out.println(num2); //6

        //System.out.println(num1++); //6
        System.out.println(num1);
        num1++;


        //System.out.println(++num2); //7
        num2++;
        System.out.println(num2);

        System.out.println(++num1 - num2++);

    }

}
