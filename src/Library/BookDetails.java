package Library;

public class BookDetails {

	String bookName;
	String authorName;
	boolean isBookIssued = false;

	public BookDetails(String nameOfBook, String nameOfAuthor) {
		bookName = nameOfBook;
		authorName = nameOfAuthor;
	}
	
	 String issueBook(String issuedbook) {
		if(issuedbook.equals(bookName)) {
			isBookIssued = true;
		}
		return issuedbook;
	}
	
	

}