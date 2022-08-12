package MyList;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!");
        myList.get(0);
        System.out.println("size: "+myList.getSize());
        System.out.println("capacity: "+myList.getCapacity());
        System.out.println(myList.toString());
        System.out.println(myList.indexOf("World"));
        System.out.println(myList.lastIndexOf("s"));
        System.out.println(myList.isEmpty());

        System.out.println(myList.subList(0, 1));

    }
}
