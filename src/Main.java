public class Main {
    public static void main(String[] args) {
      int a = 12;
     String s = switch (a) {
          case 1 -> "Hello";
          default -> "World";
      };
     System.out.println(s);


    }
}