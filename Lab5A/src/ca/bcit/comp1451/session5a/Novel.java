package ca.bcit.comp1451.session5a;

public class Novel extends ReadingMaterial {
	
	private String mainCharacterName;
	private String theme;
	private String novelistName;
	public Novel(String title, int numberOfPages, String mainCharacterName, String theme, String novelistName) {
		super(title, numberOfPages);
		setMainCharacterName(mainCharacterName);
	    setTheme(theme);
		setNovelistName(novelistName) ;
	}
	public String getMainCharacterName() {
		return mainCharacterName;
	}
	public void setMainCharacterName(String mainCharacterName) {
		this.mainCharacterName = mainCharacterName;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getNovelistName() {
		return novelistName;
	}
	public void setNovelistName(String novelistName) {
		this.novelistName = novelistName;
	}
	
	public void display() {
		System.out.println("Title is: "+ getTitle());
		System.out.println("Main chcaracter Name is: "+ getMainCharacterName());
		System.out.println("Theme Name is: "+ getTheme());
		System.out.println("Novelist name is: "+ getNovelistName());
	}

}
