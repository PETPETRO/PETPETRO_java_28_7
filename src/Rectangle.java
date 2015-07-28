
public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public String toString() {
		String rectangle="";
		for(int a=0;a<height;a++){
			for(int b=0;b<width;b++){
				rectangle+="*";
			}
			rectangle+="\n";
		}
		return rectangle;
	}

	
	

}
