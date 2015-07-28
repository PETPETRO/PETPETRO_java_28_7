
public class Square {
	
	private int size;
	
	public Square(int size){
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		String square="";
		for(int a=0;a<size; a++){
			for(int b=0;b<size;b++ ){
				square+="*";
			}
			square+="\n";
		}
		return square;
	}

	
	
	

}
