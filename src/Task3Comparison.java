/*
We will compare the String and StringBuffer.
 */
public class Task3Comparison {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        //creating reference
        StringBuffer sb1 = sb;

        String s = "A quick brown fox jumps over the lazy dog.";
        //creating reference
        String s1 = s;

        System.out.println("sb = " + sb);
        System.out.println("sb1 = " + sb1);
        System.out.println("s = "+ s);
        System.out.println("s1 = " + s1);

        System.out.println();

        //modifying StringBuffer
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        //modifying String
        s = s.replace('j','z');
        
        System.out.println("sb = " + sb);
        System.out.println("sb1 = " + sb1);
        System.out.println("s = "+ s);
        System.out.println("s1 = " + s1);
    }
}
