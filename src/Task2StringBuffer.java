/*
Implementation of append method of String Buffer.
Firstly, we will append the whole string at once.
Then, we will append character by character.
 */
public class Task2StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Capacity of sb = " + sb.capacity() + ",\t" + "Length of sb = " + sb.length());

        String s = "A quick brown fox jumps over the lazy dog.";
        //appending the whole string at once.
        //sb.append(s);
        System.out.println("Length of new String = " + s.length());
        //System.out.println("Capacity of sb = " + sb.capacity() + ",\t" + "Length of sb = " + sb.length());
       // System.out.println(sb);
        System.out.println();
        //appending character by character
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            System.out.println("Capacity of sb = " + sb.capacity() + ",\t" + "Length of sb = " + sb.length());
        }
    }
}
