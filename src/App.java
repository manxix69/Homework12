public class App {
    public static void main(String[] args) {

        Author author = new Author("Редьярд", "Киплинг");
        Author author1 = new Author("Джорд", "Оруэлл");

        Book book = new Book("1984", author1, 1949);
        Book book1 = new Book("Скотный двор", author1, 1944);
        Book book2 = new Book("Книга джунглей", author, 1894);

        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getAuthor().getName() = " + book1.getAuthor().getName());
        System.out.println("book1.getAuthor().getLastName() = " + book1.getAuthor().getLastName());
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());

        book1.setYearOfPublication(1945);

        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());

    }
}
