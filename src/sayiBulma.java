
public class sayiBulma {

	public static void main(String[] args) {
		
		int [] sayilar = new int [] {1,2,3,4,5,6,7,8,9};
		int aranacak = 15;
		
		boolean flag = false;
		
		for(int i : sayilar) {
			if(i == aranacak) {
				flag=true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("Sayi Mevcuttur");
		}else {
			System.out.println("Sayi Mevcut Deðildir");
		}
	}

}
