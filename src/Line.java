
public class Line {
	
	private int length;
	private boolean vertical;
	
	public Line(int length, boolean vertical){
		
		this.length=length;
		this.vertical=vertical;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}
	
	
	
	public String toString() {
		String line="";
		if(vertical){
			for(int i=0 ;i<length;i++){
				line +="*\n";
			}
		}else{
			for(int i=0 ;i<length;i++){
				line += "*";
			}
		}
		
		return line;
	}

}
