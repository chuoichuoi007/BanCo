
public class QuanVua extends QuanCo {

	QuanVua(String ten, boolean mau, Point viTri) {
		// TODO Auto-generated method stub
		this.ten = ten;
		this.mau = mau;
		this.viTri = viTri;
		this.taoNuocDi();
	}
	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.print(" Toi la quan Vua " + this.viTri.getData()+"\n");
		for(int i = 0;i < 8;++i){
			System.out.print(" nuoc Di :  " + i + " " + this.nuocDi[i].getData() + "\n");
		}
	}
	
	@Override
	public void setData(String ten, boolean mau, Point viTri) {
		// TODO Auto-generated method stub
		this.ten = ten;
		this.mau = mau;
		this.viTri = viTri;
		this.taoNuocDi();
	}
	@Override
	public void taoNuocDi() {
		// TODO Auto-generated method stub
		this.nuocDi = new Point[8];
		int x,y;
		x = this.viTri.x;
		y = this.viTri.y;
		if (x - 1 > 0 && y + 1 < 9)
            nuocDi[1] = (new Point(x - 1, y + 1));
		else
			nuocDi[1] = (new Point());
        if (x + 1 < 9 && y + 1 < 9)
        	nuocDi[2] = (new Point(x + 1, y + 1));
        else
			nuocDi[2] = (new Point());
        if ( y + 1 < 9)
        	nuocDi[3] = (new Point(x, y + 1));
        else
			nuocDi[3] = (new Point());
        if (x + 1 < 9)
        	nuocDi[4] = (new Point(x + 1, y));
        
        else
			nuocDi[4] = (new Point());
        if (x -1>0 && y + 1 < 9)
        	nuocDi[5] = (new Point(x - 1,y));
        else
			nuocDi[5] = (new Point());
        if (x -1 >0 && y - 1 >0)
        	nuocDi[6] = (new Point(x - 1, y - 1));
        else
			nuocDi[6] = (new Point());
        if (x -1>0)
        	nuocDi[7] = (new Point(x - 1, y));
        else
			nuocDi[7] = (new Point());
        if (x + 1 < 9 && y -1>0)
        	nuocDi[0] = (new Point(x + 1, y - 1));
        else
			nuocDi[0] = (new Point());
	}
	@Override
	public void xoaNuocDi(QuanCo x) {
		// TODO Auto-generated method stub
		for(int i = 0;i < 2;++i){
			if (nuocDi[i].equals(x.viTri)){
				nuocDi[i].move(new Point());
			}
		}
		
	}
}
