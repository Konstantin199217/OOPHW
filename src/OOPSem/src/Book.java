package OOPSem.src;

public class Book {
    public String name;
    public String autor;

    public Book(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return autor + " " + name;
    }
}
