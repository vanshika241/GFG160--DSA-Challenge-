   //Reverse a LinkedList
      
    Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
      Node prev = null;
      Node curr = head;
      Node next;
      while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      return prev;
        // Recursive  Approach 
        // if (head == null || head.next == null) {
        //     return head;
        // }

        // Node lastNode = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return lastNode;
       
    }

    //Rotate a LinkedList
    public Node rotate(Node head, int k) {
        //  code here
       if(head == null || head.next == null){
           return head;
       }
       int sz = 1;
       Node temp = head;
       while(temp.next != null){
           sz++;
           temp = temp.next;
       }
        k = k%sz;
        if(k==0)return head;
        temp.next = head;
        temp = head;
        int i=1;
        Node prev = null;
        while(i<=k){
            prev = temp;
            temp = temp.next;
            i++;
        }
        Node newHead = temp;
        prev.next = null;
        return newHead;
    }

     //Merge Two Sorted Lists
    Node sortedMerge(Node head1, Node head2) {
        //Application of Merge Sort 
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (temp1 != null && temp2 != null) {
            if (temp1.data <=temp2.data) {
                temp.next = temp1;
                temp1= temp1.next;
                temp = temp.next;
            }
            else{
                temp.next = temp2;
                temp2= temp2.next;
                temp = temp.next;
            }
        }

        while (temp1 != null) {
            temp.next = temp1;
             temp1= temp1.next;
            temp = temp.next;
        }
        while (temp2 != null) {
            temp.next = temp2;
            temp2= temp2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
