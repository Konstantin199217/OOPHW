package OOPSem.src;

import java.util.ArrayList;
import java.util.List;

public class Closet {


    private List<Book> list = new ArrayList<>();

    public void addBook(Book book){
        list.add(book);
    }

    public void remove(Book book){
        list.remove(book);
    }
    @Override
    public String toString() {
        return list.toString();
    }
    public int quantity(){
        return list.size();
    }

    public Book getBook(String str) throws Exception {
        for (Book v: list) {
            if(v.getName().equals(str)){
                return v;
            }
        }
        throw new Exception("Ни чего не найдено");
    }
}
