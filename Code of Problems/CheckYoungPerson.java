import java.util.Scanner;

import javax.swing.plaf.synth.SynthMenuItemUI;
public class CheckYoungPerson {

    public static void main(String[] args){

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        age = sc.nextInt();

        if(age<18){
            System.out.println("The person is Young");
        }

        else if (age>18 && age<50){
            System.out.println("The person is Adult");
        
        }

        else{
            System.out.println("The person is Adult");
        }
    }
    
}
