import java.util.*;
public class SwitchDemo {
    public static void main(Stringtest arg[]){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        int ID= scn.nextInt();
        System.out.println("Enter the Department: ");
        Stringtest Depart = scn.next();
        switch(ID){
            case 1:
                System.out.println("Employee is present");
                break;
            case 2:
                System.out.println("Emplpoyee is present");
                switch(Depart){
                    case "IT":
                        System.out.println("Department is : "+"IT");
                        break;
                    case "TESTER":
                        System.out.println("Department is: "+"TESTER");
                        break;  
                    case "NETWORKING":
                        System.out.println("Department is: NETWORKING ");
                        break;
                }
                break;
            case 3:
                System.out.println("Emplpoyee is present");
                break;
            default:
                System.out.println("Emplpoyee is present");    
        }
    }
}