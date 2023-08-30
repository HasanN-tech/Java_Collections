package com.tutorial;
public class Practise {
    public static void main(String[] args) {

//    ArrayList l= new ArrayList();
//    l.add(72);
//    l.add(12);
//    l.add(22);
//    l.add(32);
//    l.add("A");
//    l.add(2,"tewnty two");
//    System.out.println(l);
//    l.remove(2);
//    l.remove(3);
//    System.out.println(l);
//    l.add(0,10);
//    l.add(0,15);
//
//    System.out.println(l.contains(72));
//    System.out.println(l);

//    ArrayList l2=new ArrayList(6);
//    l2.add(1);
//    l2.add(2);
//    l2.add(3);
//    l2.add(4);
//    l2.add(5);
//    l2.add(6);
//    l2.add(7);
//    System.out.println(l2);
//    l2.set(0,0);
//    System.out.println(l2.size());
//    System.out.println(l2);
//    System.out.println("**************************************************");
//    ArrayList l3=new ArrayList(l2);
//    l3.add(10);
//    l3.add(20);
//    l3.add(30);
//    l3.add(40);
//    l3.add(50);
//    System.out.println(l3);
       Vector v=new Vector(5,4);
        System.out.println(v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.addElement(40);
        v.addElement(50);
        v.addElement(60);
        System.out.println(v.capacity());
        System.out.println(v);
        System.out.println("_______________________________________________________");
        LinkedList l=new LinkedList();
        l.add(72);
        l.add("Hasan");
        l.add("Nawab");
        l.add('A');
        l.add(12.5);
        l.set(3,'Z');
        l.add(0,24);
        l.removeLast();
        l.addFirst(5);
        System.out.println(l);
        System.out.println("_______________________________________________________");
        Stack s=new Stack();
        s.push('A');
        s.push("hasan");
        s.push(12);
        s.push(20.5);
        System.out.println(s);
        System.out.println(s.search(12));
        System.out.println(s.search("Hasan"));
        System.out.println("_______________________________________________________");
          Vector vector=new Vector();
        for (int i=0;i<=10;i++)
            vector.addElement(i);
        System.out.println(vector);
        Enumeration e= vector.elements();
        while (e.hasMoreElements()){
            Integer I=(Integer)e.nextElement();
            if(I%2==0)
                System.out.println(I);
        }
        System.out.println(vector);
        System.out.println("_______________________________________________________");
         ArrayList arr = new ArrayList();
        for (int i=0;i<=10;i++)
            arr.add(i);
        System.out.println(arr);
        Iterator itr= arr.iterator();
        while(itr.hasNext()){
            Integer n=(Integer)itr.next();
            if(n%2==0)
                System.out.println(n);
            else
                itr.remove();
        }
        System.out.println(arr);
        System.out.println("_______________________________________________________");
         LinkedList litr=new LinkedList();
        litr.add("hasan");
        litr.add("ali");
        litr.add("nawab");
        litr.add("mohd");
        System.out.println(litr);
        ListIterator itr= litr.listIterator();
        while (itr.hasNext()){
            String s=(String) itr.next();
            if (s.equals("nawab"))
                itr.remove();
            else if (s.equals("hasan")) {
                itr.add("zaman");
            } else if (s.equals("ali")) {
                itr.set("world");
            }
        }
        System.out.println(litr);
        System.out.println("_______________________________________________________");
    }
}
