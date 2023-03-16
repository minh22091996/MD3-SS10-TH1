package rikkeii;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listInteger = new MyList<>();
        listInteger.add("hello1");
        listInteger.add("hello2");
        listInteger.add("hello3");
        listInteger.add("hello4");
        listInteger.add("hello7");

        System.out.println(listInteger.getSize());

        System.out.println("element 4 : " + listInteger.get(3));
        System.out.println("element 1 : " + listInteger.get(0));
        System.out.println("element 2 : " + listInteger.get(1));
        System.out.println("element 3 : " + listInteger.get(2));
        System.out.println("element 7 : " + listInteger.get(4));

        listInteger.get(6);
        System.out.println("elemen 6: " + listInteger.get(6));

        listInteger.get(-1);
        System.out.println("element -1 : " + listInteger.get(-1));

    }
}
