package point;

public class Point {
	
	private int x;
	private int y;
	
	
	
	public Point() {
		super();
	}



	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public double distance() {
		
		  //return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
		
		return distance (0,0);
		
		
	}
	
	
	public double distance(int x, int y) {
		
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y)* (y - this.y));
		
	}
	
	public double distance (Point another) {
		 //return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
		
		return distance(another.x ,another.y);
	}
	
	

}
