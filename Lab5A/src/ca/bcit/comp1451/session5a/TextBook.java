package ca.bcit.comp1451.session5a;

public class TextBook extends ReadingMaterial{
	
    private int editionNumber;
	private String authorName;
	private String subject;
	public TextBook(String title, int numberOfPages, int editionNumber, String authorName, String subject) {
		super(title, numberOfPages);
		setEditionNumber(editionNumber);
		setAuthorName(authorName);
		setSubject(subject);
	}
	public int getEditionNumber() {
		return editionNumber;
	}
	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void Display() {
		System.out.println("The title of the book is: " + getTitle());
		System.out.println("Edition of the book is: " + getEditionNumber());
		System.out.println("Author of the book is: "+ getAuthorName());
		System.out.println("Subject of the textbook is: " + getSubject());
	}


}
