package datastructures;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

public class LinkedList {

	static Node insert(Node head, int data){
		if (head==null)
			return new Node(data);
		head.next = insert(head.next, data);
		return head;
	}
	
	static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.println(start.data + " ");
			start = start.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		Node head = null;
		while(length-- > 0) {
			int data = sc.nextInt();
			head = insert(head, data);
		}
		sc.close();
		display(head);
	}
	
}


