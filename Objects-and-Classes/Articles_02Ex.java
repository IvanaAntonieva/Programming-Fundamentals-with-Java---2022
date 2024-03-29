import java.util.Scanner;

public class Articles_02Ex {

    static class Article {
        private String title;
        private String content;
        private String author;

        private Article (String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void edit(String newValue) {
            this.content = newValue;
        }

        public void changeAuthor(String newValue) {
            this.author = newValue;
        }

        public void rename(String newValue) {
            this.title = newValue;
        }
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String articleData = scanner.nextLine();
         String title = articleData.split(", ")[0];
         String content = articleData.split(", ")[1];
         String author = articleData.split(", ")[2];

         Article article = new Article(title, content, author);
         int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String commandName = command.split("\\: ")[0];
            String newValue = command.split("\\: ")[1];

            switch (commandName) {
                case "Edit":
                    article.edit(newValue);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newValue);
                    break;
                case "Rename":
                    article.rename(newValue);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
