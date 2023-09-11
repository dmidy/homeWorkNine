public class Main {
    public static void main(String[] args) {
        //Test MyArrayList
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add("Test");
        myArrayList.add(1);

        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));

        myArrayList.remove(0);

        System.out.println(myArrayList.get(0));

        myArrayList.clear();

        //Test MyLinkedList
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("First");
        myLinkedList.add("Second");

        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(0));

        myLinkedList.remove(0);

        System.out.println(myLinkedList.get(0));

        myLinkedList.clear();

        //Test MyQueue
        MyQueue myQueue = new MyQueue();

        myQueue.add(12);
        myQueue.add(256);

        System.out.println(myQueue.size());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());

        myQueue.clear();

        //Test MyStack
        MyStack myStack = new MyStack();

        myStack.push(225);
        myStack.push(226);
        myStack.push(227);
        myStack.push(228);

        System.out.println(myStack.size());
        System.out.println(myStack.pop());

        myStack.remove(0);

        System.out.println(myStack.peek());

        myStack.clear();

        //Test MyHashMap
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put(1, "Solo");
        myHashMap.put(2, "Duo");

        System.out.println(myHashMap.size());

        myHashMap.remove(1);

        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(2));

        myHashMap.clear();

    }
}