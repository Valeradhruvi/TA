public class BookAuthentication {
    
}

class Book{
    private String author_name;
}

class Book_publication extends Book{
    private String title;
}

class Paper_publication extends Book{
    private String title;
}


// Base class
// class Book {
//     String authorName;

//     Book(String authorName) {
//         this.authorName = authorName;
//     }

//     void display() {
//         System.out.println("Author: " + authorName);
//     }
// }

// // Subclass for Book Publication
// class BookPublication extends Book {
//     String title;

//     BookPublication(String authorName, String title) {
//         super(authorName);
//         this.title = title;
//     }

//     @Override
//     void display() {
//         System.out.println("Book Publication");
//         System.out.println("Author: " + authorName);
//         System.out.println("Title: " + title);
//     }
// }

// // Subclass for Paper Publication
// class PaperPublication extends Book {
//     String title;

//     PaperPublication(String authorName, String title) {
//         super(authorName);
//         this.title = title;
//     }

//     @Override
//     void display() {
//         System.out.println("Paper Publication");
//         System.out.println("Author: " + authorName);
//         System.out.println("Title: " + title);
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {
//         if (args.length < 4) {
//             System.out.println("Usage: <author1> <title1> <author2> <title2>");
//             return;
//         }

//         // Dynamic method dispatch
//         Book b1 = new BookPublication(args[0], args[1]);
//         Book b2 = new PaperPublication(args[2], args[3]);

//         b1.display();  // Calls BookPublication's display
//         System.out.println();
//         b2.display();  // Calls PaperPublication's display
//     }
// }
