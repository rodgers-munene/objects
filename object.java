import java.util.Scanner;

class Book{
    String title;
    String author;
    int numberOfPages;
}
public class object {
    public static void main(String[] arg){
        Book s = new Book();
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the title of the book: ");
        s.title = in.nextLine();
        System.out.print("Please enter the author name: ");
        s.author = in.nextLine();
        System.out.print("Please enter the number of pages: ");
        s.numberOfPages = in.nextInt();
        
        System.out.print("\n");
        System.out.println("The book title is: " + s.title);
        System.out.println("The book author is: " + s.author);
        System.out.println("The book has "  + s.numberOfPages + " pages:");
        
    }
}
