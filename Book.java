package Lecture;

public class Book {

// counts number of exemplars
	public static int numExemplars = 0;

	private int isbn;
	private String title;
	private float price;
	private int releaseYear;
	private int numPages;

	public Book() {
		super();
		Book.numExemplars++;
	}

	public Book(int isbn, String title, float price, int releaseYear, int numPages) {
		super();
		Book.numExemplars++;

		// set attributes
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.releaseYear = releaseYear;
		this.numPages = numPages;
	}

	// read access to attributes
	public int getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public float getPrice() {
		return price;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public int getNumPages() {
		return numPages;
	}

	// write access to attributes
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	// additional functionality
	public int calculateAge(int year) {
		return (year - releaseYear);
	}

	public float calculatePagePrice() {
		return (price / (float) numPages);

	}
}