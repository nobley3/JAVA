package day13실기평가;

public class BookInfo extends Book{

	public BookInfo(String BookCode, String BookTitle, String author) {
		super(BookCode, BookTitle, author);
	}

	@Override
	public String toString() {
		return "북코드:"+BookCode+"\n"+"책제목:"+BookTitle+"\n"+"작가명:"+author+"\n";
	}
}
