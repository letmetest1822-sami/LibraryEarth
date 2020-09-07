package DataStructure.part_1;

import DataStructure.part_1.LinkedList;

import java.util.Arrays;

public class reverseLinkedList {

        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            final int K=5;
            //Create my linked list
            for(int i=1;i<10;i++){
                list.addLast(i);
            }

            System.out.println("Original List");
            System.out.println(Arrays.toString(list.toArray()));
            list.reverse();
            System.out.println();
            System.out.println("Reversed List");
            System.out.println(Arrays.toString(list.toArray()));

            System.out.println();
            System.out.println(K+"th node from the last");
            System.out.println(list.getKthFromTheEnd(K));

            System.out.println();
            System.out.println("Middle Node/Nodes");
            list.printMiddle();
        }
    }

