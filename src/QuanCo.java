

public abstract class QuanCo {
	String ten;
	boolean mau;
	Point viTri;
	Point nuocDi[];
	
	QuanCo(){
		ten = "TOT";
		mau = true;
		viTri= new Point(0,0);
		nuocDi = null;	
	}
	public abstract void getData();
	public abstract void setData(String ten, boolean mau, Point viTri);
	public abstract void taoNuocDi();
	public abstract void xoaNuocDi(QuanCo x);
}
