/*
Implementing various methods to use String Buffer
 */
public class Task1StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();//method 1
        StringBuffer sb1 = new StringBuffer(15);//method 2
        StringBuffer sb2 = new StringBuffer("Hello World");//method 3
        //print length and capacity
        System.out.println("Capacity of sb = " + sb.capacity() + ",\t" + "Length of sb = " + sb.length());
        System.out.println("Capacity of sb1 = " + sb1.capacity() + ",\t" + "Length of sb1 = " + sb1.length());
        System.out.println("Capacity of sb2 = " + sb2.capacity() + ",\t" + "Length of sb2 = " + sb2.length());
    }
}
