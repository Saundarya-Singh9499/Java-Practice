import java.util.Scanner;

public class AverageMarks {
 public static void main(String [] args){
 
int i;
	 Scanner sc=new Scanner(System.in);
 
System.out.println("Enter the number of subjects = ");
int n=sc.nextInt();
 
int marks[]=new int[n];

int averagemarks=0;

System.out.println("Enter the marks of " + n + "subjects = ");
for(i=0;i<n;i++) {
	
marks[i]=sc.nextInt();
}

for(i=0;i<n;i++) {
averagemarks+=marks[i];

}

averagemarks/=n;

System.out.println("Average marks of " + n + " subjects is = " + averagemarks);


}

 }
 
