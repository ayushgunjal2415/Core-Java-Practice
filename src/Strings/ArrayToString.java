package Strings;

public class ArrayToString {
    
    public static void main(String[] args) {

      String[] arr = new String[] {"I", "Love","you", "Tannu..."};

      StringBuilder sb = new StringBuilder();
      for (String str : arr) {
        sb.append(str).append(" ");
      }
      System.out.println("String is: " + sb);
    }
}

