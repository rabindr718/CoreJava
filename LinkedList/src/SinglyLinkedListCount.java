public class SinglyLinkedListCount {
	
	private ListNode head;
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode (int data) {
			this.data =data;
			this.next= null;
			
		}
	}
public void display() {
	ListNode current =head;
	while(current !=null) {
		System.out.print(current.data + "-->");
		current =current.next;
		}
	System.out.print("null");

  }
public int length() {
	if(head ==null) {
		return 0;
	}
	int count = 0;
	ListNode current = head;
	while(current != null) {
		count++;
		current = current.next;
	}
	return count;
}
public static void main(String[]args) {
	SinglyLinkedListCount sll = new SinglyLinkedListCount();
	sll.head = new ListNode(25);
	ListNode second = new ListNode(35);
	ListNode third = new ListNode(40);
	ListNode fourth = new ListNode(50);
	ListNode Five = new ListNode(70);
	
	sll.head.next = second;
	second.next = third;
	third.next = fourth;
	fourth.next = Five;
	
	sll.display();
	System.out.println(" "+"Length is --->" + sll.length());
	
   }
}
