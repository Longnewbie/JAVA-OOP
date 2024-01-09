package OOP2.BookAndAuthorComposition;

public class Author {
    private String ten, email;
    private char gioiTinh;

    public Author(String ten, String email, char gioiTinh) {
        this.ten = ten;
        this.email = email;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Author Information : \n" + ten + "\n" + email + "\n" + gioiTinh + "\n--------------------"; 
    }
}