
import java.util.Random;
public class BanCo {
	private static int soLuong;

	public static void main(String[] args){
		Random number = new Random();
		soLuong = 1 + number.nextInt(8);
		//System.out.print(soLuong);
		QuanCo[] listQuanCo;
		listQuanCo= new QuanCo [soLuong];
		initQuanCo(listQuanCo, soLuong);
		show(listQuanCo, soLuong);
		
	
		
	}

	private static void initQuanCo(QuanCo[] listQuanCo, int k) {
		// TODO Auto-generated method stub
		Random number = new Random();
		int x1 = number.nextInt(8)+1;
		int y1 = number.nextInt(8)+1;
		listQuanCo [0]= new QuanVua("VUA",true,new Point(x1,y1));
		
		for(int i = 1;i < k;++i){
			x1 = number.nextInt(8)+1;
			y1 = number.nextInt(8)+1;
			listQuanCo[i] = new QuanTot("TOT",true,new Point(x1,y1));
		}
		for(int i= 1;i < k;++i){
			for(int j =i+ 1;j < k-1;++j){
				listQuanCo[i].xoaNuocDi(listQuanCo[j]);
			}
		}
	}
	static void show(QuanCo[]  arr, int k){
		for(int i = 0;i < k;++i){
			arr[i].getData();
		}
	}
}
