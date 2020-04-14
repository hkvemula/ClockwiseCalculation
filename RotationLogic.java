package clockwiseCalculation;

public class RotationLogic {

	static class Node {
		Node next;
		int data;
	}

	/**
	 * This method is used to get the sequence order with designated number 1
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	static Node rotateCounterClockwise(Node head, int k) {
		if (k == 0)
			return head;

		Node current = head;

		int count = 1;
		while (count < k && current != null) {
			current = current.next;
			count++;
		}

		if (current == null)
			return head;

		Node kthNode = current;

		while (current.next != null)
			current = current.next;

		current.next = head;
		head = kthNode.next;

		kthNode.next = null;

		return head;
	}

	/**
	 * using this method to calculate the winner based on the lucky# provided
	 * 
	 * @param head
	 * @param m
	 * @return
	 */

	static Node rotateClockwise(Node head, int m) {
		Node tmp = head, prev = null;

		if (head == null)
			return head;

		int len = 1;

		while (tmp.next != null) {
			prev = tmp;
			tmp = tmp.next;
			len++;

		}

		if (m > len)
			m = m % len;
		m = len - m;

		if (m == 0)
			return head;

		Node current = head;
		int count = 1;
		while (count < m && current != null) {
			current = current.next.next;
			count++;
		}

		if (current == null)
			return head;

		Node mthnode = current;

		tmp.next = head;

		head = mthnode.next;

		mthnode.next = null;

		return head;
	}

	/**
	 * node pushing function
	 * 
	 * @param head_ref
	 * @param new_data
	 * @return
	 */
	static Node push(Node head, int new_data) {
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = (head);
		(head) = new_node;
		return head;
	}

	/**
	 * printing function
	 * 
	 * @param node
	 */
	static void printWinner(Node node) {
		if (node != null) {
			System.out.println("Winner is " + node.data);
			node = node.next;
		}

	}

}
