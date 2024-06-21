import java.util.Scanner;
/**
 * DoubleLinkedListStackMain21
 */
public class DoubleLinkedListStackMain21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListStackAssignment21 stack = new DoubleLinkedListStackAssignment21();

        while (true) {
            System.out.println("***************");
            System.out.println("Library data book");
            System.out.println("***************");
            System.out.println("1. Add new book");
            System.out.println("2. Get book from top");
            System.out.println("3. Peek book title from top");
            System.out.println("4. Info all books");
            System.out.println("5. Exit");
            System.out.println("***************");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Insert new book title");
                    System.out.println("-------------------------");
                    String data = sc.nextLine();
                    stack.push(data);
                    break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println(stack.pop());
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println(stack.peek());
                    System.out.println("-------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------");
                    stack.print();
                    System.out.println("-------------------------");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}