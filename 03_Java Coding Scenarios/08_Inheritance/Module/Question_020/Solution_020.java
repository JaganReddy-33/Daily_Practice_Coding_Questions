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
    return "EBook Info: " + super.getInfo() + ", File Size: " + fileSize;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String[] parts = input.split(",");
        
    String title = parts[0];
    String author = parts[1];
    String fileSize = parts[2];

    EBook ebook = new EBook(title, author, fileSize);
    System.out.println(ebook.getInfo());
  }
}