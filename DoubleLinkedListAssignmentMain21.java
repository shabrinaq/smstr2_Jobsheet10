import java.util.Scanner;

/**
 * DoubleLinkedListAssignment21
 */
public class DoubleLinkedListAssignmentMain21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListAssignment21 dll = new DoubleLinkedListAssignment21();

        while (true) {
            System.out.println("=======================================");
            System.out.println("Data manipulation with Double Linked List");
            System.out.println("=======================================");
            System.out.println("1. Add First");
            System.out.println("2. Add Tail");
            System.out.println("3. Add Data in nth index");
            System.out.println("4. Remove first");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove data by index");
            System.out.println("7. Print");
            System.out.println("8. Search Data");
            System.out.println("9. Sort Data");
            System.out.println("10. Exit");
            System.out.println("=======================================");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    int dataFirst = sc.nextInt();
                    dll.addFirst(dataFirst);
                    break;
                case 2:
                    int dataLast = sc.nextInt();
                    dll.addLast(dataLast);
                    break;
                case 3:
                    System.out.print("Data node: ");
                    int dataNode = sc.nextInt();
                    System.out.print("In Index: ");
                    int dataIndex = sc.nextInt();
                    dll.addAtIndex(dataNode, dataIndex);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Insert Index: ");
                    int indexRemove = sc.nextInt();
                    dll.removeAtIndex(indexRemove);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Search Data: ");
                    int searchData = sc.nextInt();
                    dll.searchData(searchData);
                    break;
                case 9:
                    dll.sortData();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choose");
            }
        }
    }
}