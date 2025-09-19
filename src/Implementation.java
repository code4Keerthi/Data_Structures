public class Implementation {
    public static void main(String[] args) {
        // Custom MyStack Implementation

        MyStack stack=new MyStack(5);

        for(int i=1;i<=5;i++)stack.push(i);
        stack.push(10);
        stack.pop();
        stack.pop();
        stack.peek();
        stack.search(50);
        stack.search(5);
        System.out.println(stack.size());

        MyArrayList ArrayList=new MyArrayList(15);

        //adding elements
        ArrayList.add(100);
        for(int i=20;i<=30;i++)ArrayList.add(i);

        //removing elements
        ArrayList.remove(30);
        ArrayList.remove(25);

        ArrayList.add(1000);
        //searching
        ArrayList.contains(5);

        System.out.println("Element at index 2 "+ ArrayList.get(2));

        System.out.println("Index of 1000 is "+ ArrayList.indexOf(1000));

        System.out.println(ArrayList.size());//size of the arraylist

    }
}
