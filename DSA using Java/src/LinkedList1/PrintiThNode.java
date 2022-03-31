package LinkedList1;

import java.util.Scanner;

public class PrintiThNode {

	public static Node<Integer> creatingNodes(){
		
		Node<Integer> n1 = new Node<>(20);
		Node<Integer> n2 = new Node<>(40);
		Node<Integer> n3 = new Node<>(80);
		Node<Integer> n4 = new Node<>(100);
		Node<Integer> n5 = new Node<>(120);
		Node<Integer> n6 = new Node<>(200);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		return n1;
	}
	
	public static void print( Node<Integer> head , int n) {
		
		int num = 0;
		Node<Integer> temp = head;
		
		while( temp != null) {
			
		   temp = temp.next;
		   
		   num+= 1;
		   
		   if( num == n) {
			 
			   
			   System.out.println(temp.data);
		   }
		}
	}
	
	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    Node<Integer> head = creatingNodes();
    print(head , n);
	
	}

}
