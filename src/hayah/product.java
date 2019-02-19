package hayah;

//to create list of product so created set and get (private)
public class product {
	private int prize;
	private String name;
	private int quntity ;
	
	public product( String n, int qu, int pr) {
		name=n;
		quntity=qu;
		prize=pr;
	}
	public String getname() {
		return name;
	}

	public void setname(String na) {
		name = na;
	}
	public void setprize(int pri) {
		prize = pri;
	}
	public int getprize() {
		return prize;
	}


}
