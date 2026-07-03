package laba9;

public class ex5 {
    // Создание списка с головы
    public static Node createHead(int[] values) {
        Node head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
        return head;
    }

    public static Node createTail(int[] values) {
        Node head = null;
        Node tail = null;

        for (int value : values) {
            if (head == null) {
                head = new Node(value, null);
                tail = head;
            } else {
                tail.next = new Node(value, null);
                tail = tail.next;
            }
        }
        return head;
    }

    public static void printList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " -> ");
            ref = ref.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("Создание с головы:");
        Node head1 = createHead(values);
        printList(head1);

        System.out.println("Создание с хвоста:");
        Node head2 = createTail(values);
        printList(head2);
    }
}
