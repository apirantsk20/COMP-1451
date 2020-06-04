package ca.bcit.comp1451.session5a;

public class ReadingMaterial {
	
	private String title;
	private int numberOfPages;
	public ReadingMaterial(String title, int numberOfPages) {
		super();
		setTitle(title);
		setNumberOfPages(numberOfPages);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.trim().length() > 0) {
		this.title = title;}
		else {
			this.title = "unknown";
		}
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		if(numberOfPages > 0) {
		this.numberOfPages = numberOfPages;}
	}
	
	

}
