import java.util.Scanner;

public class Article2_04Ex {

    static class Article {
        private String title;
        private String content;
        private String author;

        private Article (String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String articleData = scanner.nextLine();
            String title = articleData.split(", ")[0];
            String content = articleData.split(", ")[1];
            String author = articleData.split(", ")[2];

            Article article = new Article(title, content, author);
            System.out.println(article.toString());
        }
    }
}
