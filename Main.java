import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printjava(){
        System.out.println("Hello");
    }

    public static void printname(String namee){
        System.out.println(namee);
    }

    public static void printsum(int a,int b){
        int summa=a+b;
        System.out.println(summa);
    }

    public static void main(String[] args) {
        printsum(5,8);

        //printname("yo");

        //printjava();
        //printjava();

        //System.out.println("ff");
        String J = "d";

        int age = 2;
        //int name =age;
        //System.out.println(age);
        //System.out.println(name);

        String y = J;
        //System.out.println(J);
        //System.out.println(y);

        // Primitive Data Types
        byte a = 23;
        int b = 323465;
        long c = 4999545454354534534L;
        float d = 4.323F;
        char letter = 'K';
        boolean t = true;


        // Non-Primitive Data Types
        String aa = new String("Sys tummm");
        //System.out.println(aa.length());

        // String functions
        //concatenate
        String name1 = "Mitesh";
        String name2 = "Kumar";
        String name = name1 + " and " + name2;
        //System.out.println(name);

        //charAt
        String name3 = "Giyana";
        //System.out.println(name3.charAt(1));

        //replace
        // "Strings are immutable"
        String name4 = name3.replace('a', 'b');
        //System.out.println(name4);

        //Substring
        String nn = "mitesh is doing something";
        //System.out.println(nn.substring(0,6));


        // Arrays

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 34;
        marks[2] = 24;
        marks[2] = 53;

        //System.out.println(marks[1]);


        boolean[] wrong = new boolean[3];
        wrong[0] = false;
        wrong[0] = true;
        wrong[1] = false;
        wrong[2] = true;

        //System.out.println(wrong[0]);


        //System.out.println(wrong.length);

        //System.out.println(marks[0]);
        for (int element : marks) {
            //System.out.println(element);
        }
        Arrays.sort(marks);
        //System.out.println("New list");
        for (int element : marks) {
            //System.out.println(element);
        }


        int[] mark = {97, 23, 42, 321, 23, 231, 3, 3, 33, 3213};
        int[][] finalmarks = {{97, 42, 321, 23}, {23, 231, 3, 33}};
        //System.out.println(finalmarks[0][3]);


        //casting
        double price = 100.00;
        double finalprice = price + 45;
        //System.out.println(finalprice);

        //explicit casting
        int p = 100;
        int fp = p + (int) 12.9;
        //System.out.println(fp);


        //constants
        final float pi = 3.14159F;
        //float pi=3.14159F;


        //OPERATORS (+,-,*,/,%,=)
        double ad = 5;
        double bb = 3;
        double cc = ad % bb;
        //System.out.println(cc);


        int numb = 1;
        //numb=numb+1;
        //numb++;
//        System.out.println(numb);
//        System.out.println(numb++);
//        System.out.println(numb);
//        System.out.println(--numb);
//        System.out.println(numb);


        //Math class
        //System.out.println(Math.max(5.676,5.67));
        //System.out.println(Math.min(8,7));

        //random
        //System.out.println(Math.random());
        //System.out.println((int)(Math.random()*100));


        //input
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter:");
//        //float age1=sc.nextFloat();
//        //System.out.println((double)age1);
//
//        String name23=sc.next();
//        System.out.println(name23);
//
//        Scanner sc1=new Scanner(System.in);
//        String name24=sc1.nextLine();
//        System.out.println(name24);


        //Comparison operators
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter CHAI temp:");
//        int aba=sc.nextInt();
//        int b21=aba;
//        if(b21 < 100 && b21>50)
//            System.out.println("wow, Doli ki Chai");
//        else if(b21<50 || aba<0)
//            System.out.println("Chai hai pani");
//        else{
//            System.out.println("F*ck Bh*nch*d");
//              System.out.println("Garm hai! Garm hai!");
//          }

        //Logical
//        boolean isAdult=false;
//        if(!isAdult)
//            System.out.println("Is adult");
//        else
//            System.out.println("Not");




     //Switch
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Which Day:");
//        int g=sc.nextInt();
//
//        switch(g){
//            case 1:
//                System.out.print("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            default:
//                System.out.println("IDK");
//        }


    //Loops

//      for(int i =0;i<=10 ; i++){
//          System.out.print(i+" ");
//
//      }
//      int i=1;
//      while(i<10){
//            System.out.print(i+" ");
//            i++;
//        }

//        int k=10;
//        do{
//            System.out.print(k+" ");
//            k--;
//        }while(k>=1);

//        Scanner sc=new Scanner(System.in);
//        int number;
//        do{
//            System.out.print("Input a no.:");
//            number=sc.nextInt();
//            if(number==3){
//                continue;
//            }
//            System.out.print("Le re:");
//            System.out.println(number);
//            if(number==3){
//                break;
//            }
//        }while(number>=0);
//
//        System.out.println("The end");

        //Exception handling
//        int[] marks1={97,98,99};
//        try{
//            System.out.println(marks1[3]);
//        } catch(Exception ec){
//            System.out.println("YOu fool");
//        }











    }

}