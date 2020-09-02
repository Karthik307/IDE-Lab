//Student details roll num,name,marks(6),address,phone, op-all details with average and percentage 
import java.util.*;
public class Stud
{
public static void main(String[] args) {
    System.out.println("Enter Student details:");
    // Roll Number
    System.out.println("Roll Number:");
    Scanner r = new Scanner(System.in);
    long roll = r.nextLong();
    // Name
    System.out.println("Name:");
    Scanner n = new Scanner(System.in);
    String name = n.nextLine();
    Scanner m = new Scanner(System.in);
    // marks
    float[] marks = new float[7];
    for (int i = 1; i < 7; i++) {
        System.out.println("Enter Marks in subject " + i + ": ");
        marks[i] = m.nextFloat();
    }
    // Address
    System.out.println("Email: ");
    Scanner e = new Scanner(System.in);
    String address = e.nextLine();
    // Phone
    System.out.println("Phone no:");
    Scanner p = new Scanner(System.in);
    long phone = p.nextLong();
    //Output
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("Roll: "+roll +" Name: "+ name+" Email: "+address+" Phone: "+phone); 
    for(int i=1;i<7;i++)
    {
    	System.out.println("Subject "+i+" :"+ marks[i]);
    }
    float sum=0;
    for(int i=1;i<7;i++){
    	sum+=marks[i];
    }
    System.out.println("Total: "+sum);
    System.out.println("Average: "+(sum/6));
    System.out.println("Percentage: "+((sum/180)*100));
    }
}