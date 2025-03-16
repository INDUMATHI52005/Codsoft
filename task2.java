import java.util.Scanner;
public class task2 {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of subjects:");
    int n=sc.nextInt(),total=0;
    for(int i=0;i<n;i++){
        System.out.print("Enter marks for subject"+(i+1)+":");
        total+=sc.nextInt();
    }
    double avg =(double)total/n;
    char grade=(avg>=90)?'A':(avg>=80)?'B':(avg>=70)?'C':(avg>=60)?'D':(avg>=50)?'E':'F';
    System.out.println("\nTotal:"+total+"\nAverage:"+avg+"%\nGrade:"+grade);
    sc.close();
    }
}