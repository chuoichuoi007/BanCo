
public class Point {
	public int x;
	public int y;
	public boolean ch;
	Point(){
		x = -1;
		y = -1;
		ch = false;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
		this.ch = true;
	}
	Point(int x,int y, boolean ch){
		this.x = x;
		this.y = y;
		this.ch = ch;
	}
	public void move(Point Dx){
		this.x = Dx.x;
		this.y =Dx.y;
	}
	public String getData(){
		String str;
		str =" "+ String.valueOf(x)+" "+ String.valueOf(y) + " ";
		return str;
	}
	
	@Override public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point other = (Point)obj;
        return x==other.x && y==other.y;
    }
	
}
