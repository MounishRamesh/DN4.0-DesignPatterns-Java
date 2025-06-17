

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose document type: pdf / word / excel");
        String input = scanner.nextLine();

        DocumentFactory factory;

        switch (input.toLowerCase()) {
            case "pdf":
                factory = new PdfDocumentFactory();
                break;
            case "word":
                factory = new WordDocumentFactory();
                break;
            case "excel":
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid input.");
                return;
        }

        Document document = factory.createDocument();
        document.open();
    }
}
