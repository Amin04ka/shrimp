package laba9;
import java.util.LinkedList;
public class ex8 {
    private Node head;

    public void createHead(int[] values) {
        head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
    }

    public void createTail(int[] values) {
        head = null;
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
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            sb.append(ref.value);
            if (ref.next != null) {
                sb.append(" -> ");
            }
            ref = ref.next;
        }
        return sb.toString();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value, null);
            return;
        }

        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = new Node(value, null);
    }

    public void insert(int value, int position) {
        if (position == 0) {
            addFirst(value);
            return;
        }

        Node ref = head;
        int index = 0;
        while (ref != null && index < position - 1) {
            ref = ref.next;
            index++;
        }

        if (ref != null) {
            ref.next = new Node(value, ref.next);
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int position) {
        if (position == 0) {
            removeFirst();
            return;
        }

        Node ref = head;
        int index = 0;
        while (ref != null && index < position - 1) {
            ref = ref.next;
            index++;
        }

        if (ref != null && ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, values.length - 1);
    }

    private Node createHeadRecHelper(int[] values, int index) {
        if (index < 0) return null;
        return new Node(values[index], createHeadRecHelper(values, index - 1));
    }

    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }

    private Node createTailRecHelper(int[] values, int index) {
        if (index >= values.length) return null;
        return new Node(values[index], createTailRecHelper(values, index + 1));
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) return "";
        if (node.next == null) return String.valueOf(node.value);
        return node.value + " -> " + toStringRecHelper(node.next);
    }

    // Демонстрация работы всех методов
    public static void main(String[] args) {
        ex8 list = new ex8();
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("=== ЦИКЛИЧЕСКИЕ МЕТОДЫ ===");

        list.createHead(values);
        System.out.println("createHead: " + list.toString());

        list.createTail(values);
        System.out.println("createTail: " + list.toString());

        list.addFirst(0);
        System.out.println("addFirst(0): " + list.toString());

        list.addLast(6);
        System.out.println("addLast(6): " + list.toString());

        list.insert(99, 3);
        System.out.println("insert(99, 3): " + list.toString());

        list.removeFirst();
        System.out.println("removeFirst: " + list.toString());

        list.removeLast();
        System.out.println("removeLast: " + list.toString());

        list.remove(2);
        System.out.println("remove(2): " + list.toString());

        System.out.println("=== РЕКУРСИВНЫЕ МЕТОДЫ ===");

        ex8 list2 = new ex8();
        list2.createHeadRec(values);
        System.out.println("createHeadRec: " + list2.toStringRec());

        ex8 list3 = new ex8();
        list3.createTailRec(values);
        System.out.println("createTailRec: " + list3.toStringRec());
    }
}
