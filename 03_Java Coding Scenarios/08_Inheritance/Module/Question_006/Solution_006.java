import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfo() {
        return "Title: " + title + ", Author: " + author;
    }
}

class EBook extends Book {
    private String fileSize;

    public EBook(String title, String author, String fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }
    public String getFileSize() {
        return fileSize;
    }
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String getInfo() {
        return (super.getInfo())+ ", File Size: " + fileSize;
    }
}

class PrintedBook extends Book {
    private String pages;

    public PrintedBook(String title, String author, String pages) {
        super(title, author);
        this.pages = pages;
    }

    public String getPages() {
        return pages;
    }
    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public String getInfo() {
        return (super.getInfo()) + ", Pages: " + pages;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        String input = sc.nextLine();
        String[] details = input.split(",");

        if (type.equalsIgnoreCase("EBook")) {
          EBook ebook = new EBook( details[0].trim(), details[1].trim(), details[2].trim());
          System.out.println("Book Info: " + ebook.getInfo());
        } else if (type.equalsIgnoreCase("PrintedBook")) {
          PrintedBook printedBook = new PrintedBook(details[0].trim(), details[1].trim(), details[2].trim());
          System.out.println("Book Info: " + printedBook.getInfo());
        }
    }
}