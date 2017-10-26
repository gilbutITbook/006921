public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private Author _author;
    public Book(String title, String isbn, String price, String authorName, String authorMail) {
        _title = title;
        _isbn = isbn;
        _price = price;
        _author = new Author(authorName, authorMail);
    }
    public String getTitle() { return _title; }
    public String getIsbn() { return _isbn; }
    public String getPrice() { return _price; }
    public String getAuthorName() { return _author.getName(); }
    public String getAuthorMail() { return _author.getMail(); }
    public void setAuthorName(String name) { _author.setName(name); }
    public void setAuthorMail(String mail) { _author.setMail(mail); }
    public String toXml() {
        String author =
            tag("author", tag("name", getAuthorName()) + tag("mail", getAuthorMail()));
        String book =
            tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }
    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
    // ...
}

class Author {
    private String _name;
    private String _mail;
    public Author(String name, String mail) {
        _name = name;
        _mail = mail;
    }
    public String getName() { return _name; }
    public String getMail() { return _mail; }
    public void setName(String name) { _name = name; }
    public void setMail(String mail) { _mail = mail; }
    // ...
}
