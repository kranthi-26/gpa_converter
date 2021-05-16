import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.println("Enter the number of courses you have in this semister: ");
        Scanner scan = new Scanner(System.in);
        int courses = scan.nextInt();
        double[] numofcourses = new double[courses];
        double sum = 0;
        for(int i=0; i<numofcourses.length;i++){
            System.out.println("enter your average for the course" + (i+1) +":");
            numofcourses[i] = scan.nextDouble();
        }
        for(int i=0; i<numofcourses.length;i++){
            sum = sum + numofcourses[i];
        }
        double average = sum/numofcourses.length;
        System.out.println("your average is: "+average);
        if(average>90){
            System.out.println("A grade");
        }
        else if(90>=average && average>80){
            System.out.println("B grade");
        }
        else if(80>=average && average>70){
            System.out.println("C grade");
        }
        else if(70>=average && average>60){
            System.out.println("D grade");
        }
        else if(average<60){
            System.out.println("fail");
        }
        else{
            System.out.println("try again");
        }
    }
}
