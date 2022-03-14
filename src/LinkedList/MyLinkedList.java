package LinkedList;

public class MyLinkedList {

	SinglyLinkedNode head;

	static class SinglyLinkedNode {

		int val;

		SinglyLinkedNode next;

		public SinglyLinkedNode(int val, SinglyLinkedNode next) {
			this.val = val;
			this.next = next;
		}

		public SinglyLinkedNode() {
			// TODO Auto-generated constructor stub
			super();
		}

	}

	public MyLinkedList() {
		super();
	}

	public MyLinkedList(SinglyLinkedNode head) {
		super();
		this.head = head;
	}

	// done in local
	public int get(int index) {

		SinglyLinkedNode itr = head;
		int count = 0;
		while (itr != null) {
			if (count != index) {
				itr = itr.next;
				count++;
			} else {
				return itr.val;
			}
		}
		return -1;

	}

	// done in local
	public void addAtHead(int val) {
		SinglyLinkedNode newNode = new SinglyLinkedNode(val, null);
		if (head == null) {
			head = newNode;
		} else {
			// assign newNode next to head
			newNode.next = head;
			// put head as newNode
			head = newNode;
		}
	}

	// done in local
	public void addAtTail(int val) {
		SinglyLinkedNode newNode = new SinglyLinkedNode(val, null);
		if (head == null) {
			head = newNode;
		} else {
			// temp variable to store head
			SinglyLinkedNode itr = head;
			// iterate till last node
			while (itr.next != null) {
				itr = itr.next;
			}
			/*
			 * add the new node --it will be saved in head because itr points to all values
			 * present in head
			 */
			itr.next = newNode;
		}

	}

	// done in local
	public void addAtIndex(int index, int val) {

		SinglyLinkedNode newNode = new SinglyLinkedNode(val, null);

		if (index == 0) {
			addAtHead(val);
			return;
		}

		if (index > size())
			return;
		else {
			int count = 0;
			SinglyLinkedNode itr = head;
			while (count < index - 1) {
				itr = itr.next;
				count += 1;
			}
			SinglyLinkedNode nextNode = itr.next;
			itr.next = newNode;
			itr = itr.next;
			itr.next = nextNode;
			return;

		}

	}

	public int size() {
		SinglyLinkedNode itr = head;
		int count = 0;
		while (itr != null) {
			itr = itr.next;
			count++;
		}
		return count;
	}

	public void deleteAtIndex(int index) {

		if (head == null)
			System.out.println("list is empty");
		else if (index == 0)
			head = head.next;
		else if (index > size() - 1)
			return;
		else {
			int count = 0;
			SinglyLinkedNode itr = head;
			while (count < index - 1) {
				itr = itr.next;
				count++;
			}
			itr.next = itr.next.next;
			return;
		}
	}
}
