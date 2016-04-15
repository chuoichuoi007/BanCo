

public class QuanTot extends QuanCo {

	QuanTot(String ten, boolean mau, Point viTri) {
		// TODO Auto-generated method stub
		this.ten = ten;
		this.mau = mau;
		this.viTri = viTri;
		this.taoNuocDi();
	}
	
	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.print(" Toi la quan Tot " + viTri.getData() + "\n");
		for(int i = 0;i < 2;++i){
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
		this.nuocDi = new Point[2];
		int x = this.viTri.x;
		int y = this.viTri.y;
            if (x - 1 > 0 && y + 1 < 9)
                nuocDi[0]=new Point(x - 1, y + 1);
            else
    			nuocDi[0] = (new Point());
            if (x + 1 < 9 && y + 1 < 9)
                nuocDi[1] = new Point(x + 1, y + 1);
            else
    			nuocDi[1] = (new Point());		
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
