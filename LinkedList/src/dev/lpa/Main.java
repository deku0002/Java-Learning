package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<String>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
//        printItinerary(placesToVisit);
//        printItinerary2(placesToVisit);
//        printItinerary3(placesToVisit);

        testIterator(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Deque Methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack Methods
        list.push("Alice Springs");
    }

    public static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();               //removes first element
        System.out.println(s1+" was removed");

        String s2 = list.remove();              //removes first element
        System.out.println(s2+" was removed");

        String s3 = list.removeLast();          //removes last element
        System.out.println(s3+" was removed");

        // Queue/Deque poll Methods
        String p1 = list.poll();                //removes first element
        System.out.println(p1+" was removed");

        String p2 = list.pollFirst();                //removes first element
        System.out.println(p1+" was removed");

        String p3 = list.pollLast();                //removes Last element
        System.out.println(p1+" was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Melbourne");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4+" was removed");

        String p5 = list.pop();
        System.out.println(p5+" was removed");
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = "+list.get(4));

        System.out.println("First Element = "+list.getFirst());
        System.out.println("last Element = "+list.getLast());

        System.out.println("Darwin is at Position: "+list.indexOf("Darwin"));
        System.out.println("Melbourne is at Position: "+list.indexOf("Melbourne"));

        //Queue Retrieval Method
        System.out.println("Element from element() = "+list.element());
        System.out.println("Element from peek() = "+list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){

        System.out.println("The trip starts at: "+list.getFirst());
        for (int i=1;i<list.size();i++){
            System.out.println("--> From: "+list.get(i-1) + " to " + list.get(i));

        }
        System.out.println("The trip end at: "+list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){

        System.out.println("The trip starts at: "+list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("--> From: "+previousTown+" to "+ town);
            previousTown = town;
        }
        System.out.println("The trip end at: "+list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){

        System.out.println("The trip starts at: "+list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: "+previousTown+" to "+ town);
            previousTown = town;
        }
        System.out.println("The trip end at: "+list.getLast());
    }

    private static void testIterator(LinkedList<String> list){

        var iterator = list.listIterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")){
                iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }
}