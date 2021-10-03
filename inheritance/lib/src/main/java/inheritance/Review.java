package inheritance;

public class Review{
    //    public String name;
    public String body;
    public String author;
    public int starNo;

    public Review(String body, String author, int starNo) {
//        this.name = name;
        this.body = body;
        this.author = author;
        this.starNo = starNo;
    }

//    public String getBody() {
//        return body;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getStarNo() {
//        return starNo;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public void setStarNo(int starNo) {
//        this.starNo = starNo;
//    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", starNo=" + starNo +
                '}';
    }
}
