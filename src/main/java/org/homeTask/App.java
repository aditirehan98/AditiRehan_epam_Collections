package org.homeTask;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Custom<Integer> list=new Custom();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println("Enter the element you want to get:");
        int ele=sc.nextInt();
        System.out.println("Getting element at "+ele+" position: "+list.get(ele-1));
        System.out.println("Enter the element you want to remove:");
        int remove=sc.nextInt();
        list.remove(remove);
        System.out.println("after removing "+remove+" list is:"+list);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(list);
    }
}
