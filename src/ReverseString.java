public class ReverseString {

  public static void main(String[] args) {
    String input = "Programming";
    System.out.println(reverseString(input));
  }


  static String reverseString(String input) {
    StringBuilder sb = new StringBuilder();
    for (int i = input.length() - 1; i >= 0; i--) {
      sb.append(input.charAt(i));
    }
    return sb.toString();
  }

}
