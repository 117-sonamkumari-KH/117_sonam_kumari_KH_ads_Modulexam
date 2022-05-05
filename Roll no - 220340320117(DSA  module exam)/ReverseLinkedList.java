// Q2.Linked list
	import java.util.Scanner;
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}
	class LinkedList{
		Node head;
		void insertNode(int val){
		Node newNode = new Node( val );
			if(head == null){
			 head = newNode;
			 return;
			}
			Node temp = head;
			while(temp.next!= null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
		void reverse(){
		reverse(head);
		}
		void reverse(Node head){
		 if(head == null)
		 return;
		 reverse(head.next);
		 System.out.println(head.data+ " ");
		}
		void display(){
		if(head == null){
		System.out.println("List is empty.");
		return;
		}
		Node temp = head;
		while(temp!= null){
		System.out.print(temp.data+ " ");
		temp = temp.next;
		}
		System.out.println("");
		}
	}
	 public class ReverseLinkedList{
	  public static void main(String...args){
	  LinkedList ls = new LinkedList();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter  number of element in the linked list: ");
	  int n = sc.nextInt();
	  System.out.println("Enter the Number in List:");
	  for(int i = 0;i<n;i++){
	  ls.insertNode(sc.nextInt());
	  }
	  System.out.println("list before reversing: ");
	  ls.display();
	  System.out.println("list after reversing: ");
	  ls.reverse();
	  }
	}
	