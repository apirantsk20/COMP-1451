package ca.bcit.comp1451.session5a;

public class Magazine extends ReadingMaterial {
	
	private String scheduledPublications;
	private int numberOfSubscribers;
	public Magazine(String title, int numberOfPages, String scheduledPublications, int numberOfSubscribers) {
		super(title, numberOfPages);
		setScheduledPublications(scheduledPublications);
		setNumberOfSubscribers(numberOfSubscribers);
	}
	public String getScheduledPublications() {
		return scheduledPublications;
	}
	public void setScheduledPublications(String scheduledPublications) {
		this.scheduledPublications = scheduledPublications;
	}
	public int getNumberOfSubscribers() {
		return numberOfSubscribers;
	}
	public void setNumberOfSubscribers(int numberOfSubscribers) {
		this.numberOfSubscribers = numberOfSubscribers;
	}
	
	//a diplayDetails method which will display the title, scheduled publications and number of subscribers
	public void displayDetails() {
		System.out.println("Title of the magazine is: "+ getTitle());
		System.out.println("Scheduled Publications: "+ getScheduledPublications());
		System.out.println("Number of subscribers are: "+ getNumberOfSubscribers());
	}

}
