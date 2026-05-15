package arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
    int sum = 0;
    private Node first = null;
    private Node last = null;
    private int count = 0;

    public void add(int e) {
        if (first == null) {
            first = new Node(e, null);
            last = first;
            count++;
            return;
        }
        last.next = new Node(e, null);
        count++;
        last = last.next;
    }

    public int size() {
        return count;
    }

    public String toString() {
        if (first == null) return "[]";
        Node curr = first;
        String s = "[" + curr.ele;
        while (curr.next != null) {
            curr = curr.next;
            s += "," + curr.ele;
            //curr=curr.next;
        }
        s += "]";
        return s;
    }

    public List<Integer> toList() {
        List<Integer> list = new LinkedList<Integer>();

        Node curr = first;
        int c = 0, add = 1;
        boolean flag = false;
        while (c != size()) {
            c = 0;
            while (curr != null) {
                if (curr.ele > 0) {
                    if (curr.ele % 10 != 0) {
                        add *= curr.ele % 10;
                        flag = true;
                    } else add *= 1;
                    curr.ele = curr.ele / 10;
                   // System.out.println(curr.ele);
                    curr = curr.next;
                } else {
                        ++c;
                    curr = curr.next;
                }
            }
            curr = first;
            if (flag) sum = sum + add;
            else sum = sum - 1 + add;
            flag = false;
            add = 1;
            if (sum % 10 > 0) list.add(sum % 10);
            else {
                if (sum != 0)
                    list.add(1);
            }
            sum /= 10;
        }
        while (sum > 1) {
            list.add(sum % 10);
            sum /= 10;
        }
        return list;
    }

}




