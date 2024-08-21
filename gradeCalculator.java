import java.util.Scanner;

public class gradeCalculator{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean toContinue = true;
       
       while (toContinue) {
       System.out.print("Enter Your Name:");
       String name = sc.nextLine();

       System.out.println("Enter your Marks of all subjects (out of 100):");
       System.out.print("Maths:");
       int math=sc.nextInt();
       System.out.print("Science:");
       int science=sc.nextInt();
       System.out.print("English:");
       int english=sc.nextInt();
       System.out.print("History:");
       int history=sc.nextInt();
       System.out.print("Drwaing:");
       int drwaing=sc.nextInt();

       int total= math + science + english + history +drwaing;

       float average = (total/5);
       System.out.println("Total Marks are: "+total+"/500");
       System.out.println("Average percentage of "+name +" is: "+average+"%");
       if(average>=90){
        System.out.println(name+" got A grade");
       }

       else if(average<90 && average>=80){
        System.out.println(name+" got B grade");
       }

       else if(average<80 && average>=70){
        System.out.println(name+" got C grade");
       }
       else if(70>average){
        System.out.println(name+" got D grade");
       }

       else if (average<=50){
        System.out.println(name+"Failed");
       }
       System.out.print("Do you want to play again? (yes/no): ");
            sc.nextLine();
            String response = sc.nextLine();
            toContinue = response.equalsIgnoreCase("yes");
    }
      
    sc.close();   
}
}