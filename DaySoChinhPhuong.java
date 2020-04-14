package sohoc;

public class DaySoChinhPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cac so chinh phuong nho hon 100 la: ");
		for(int i = 0;i < 100; i++) {
			if(kiemTra(i) == true) {
			System.out.print(i + " ");	
		}
	}
	}
	public static boolean kiemTra (int n) {
		int tam = (int)Math.sqrt(n);
		if (tam* tam== n) {
			return true;
		}
		else {
			return false;
		}
	}
}