package wallArea;

public class Wall {
	
	private double width;
	private double height;
	
	
	
	public Wall() {
		super();
	}



	public Wall(double width, double height) {
		super();
		this.width = width;
		if(this.width < 0) {
			this.width = 0;
		}
		this.height = height;
		if(this.height<0) {
			this.height=0;
		}
		
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
		if(this.width < 0) {
			this.width =0;
		}
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
		if(this.height < 0) {
			this.height = 0;
		}
		
		
	}
	
	
	public double getArea() {
		
		return this.height * this.width;
	}
	
	
	
	
	
	

}
