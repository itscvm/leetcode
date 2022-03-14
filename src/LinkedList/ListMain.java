package LinkedList;

import LinkedList.MyLinkedList.SinglyLinkedNode;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList obj=new MyLinkedList();
		obj.addAtHead(2);
		//obj.addAtTail(3);
		obj.addAtIndex(0, 1);
		
		SinglyLinkedNode head = obj.head;
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
		
		System.out.println(obj.get(1));
		//MyLinkedList obj=new sin

	}

}
