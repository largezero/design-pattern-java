package iterator;

public class Book {
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	Book(String bookName){
		this.name = bookName;
	}
}
