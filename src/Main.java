public class Main {
    /*Я тут много чего понаписал, вероятно, часть из этого лишняя и в условии об этом не просили.
    Просто было интересно как это все работает. Если потребуется, я перепишу.

    П.С. как то неудобно, что новые классы в одном месте хранятся. Я сначала создавал новый отдельный класс, потом внимательно
    перечитал условие и переписал код, чтоб все в одном классе было. Мб, я чего-то не понял
     */

    public static class Author {
        private String name;
        private String surname;

        public Author(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }

    }

    public static class Book {

        private String title;
        private Author author;
        private int yearOfPublication;

        public Book(String title, Author author, int yearOfPublication) {
            this.title = title;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public void setYearOfPublication(int year) {
            this.yearOfPublication = year;
        }

        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return author.name + " " + author.surname;
        }

        public int getYearOfPublication() {
            return this.yearOfPublication;
        }
    }


    public static void main(String[] args) {
        Author oda = new Author("Eiichiro", "Oda");

        Book onePiece = new Book("One Piece", oda, 1997);

        Author welsh = new Author("Irvine", "Welsh");

        Book nightmares = new Book("Marabou Stork Nightmares", welsh, 1994);

        nightmares.setYearOfPublication(1995);
        System.out.println("nightmares.getYearOfPublication() = " + nightmares.getYearOfPublication());
        System.out.println();
    }
}
