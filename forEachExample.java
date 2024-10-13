import java.util.*;

class foEachExample{

public static void main(String[] args){
 
    Map<Integer,String> arr = new HashMap<>();

    arr.put(1,"Ram");
    arr.put(2,"Shyam");
    arr.put(3,"gogs");
    arr.put(4,"rtiug");
    arr.put(5,"gyig");
    arr.put(6,"dsgd");
    arr.put(7,"uywetgig");
    arr.put(8,"gfisug");

    //arr.forEach(arra -> System.out.println(arra));
    arr.entrySet().forEach(foEachExample::printEntry);
    //System.out.println(arr);
    }
    public static void printEntry(Map.Entry<Integer, String> entry){
        System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
    }

}

