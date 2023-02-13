import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
	
			
			Scanner scan =new Scanner(System.in);
				
				int Bakiye = 10000;
			    int islem;
				
				
				System.out.println("1: Para cek");
				System.out.println("2: Para yatir");
				System.out.println("3: Bakiye goster");
				System.out.println("4: Sistem cikisi");
				islem =scan.nextInt();
				
				
				
				switch(islem) {
				
				case 1: 
				System.out.println("cekilen miktar ");
				int miktar = scan.nextInt();
				Bakiye -= miktar; 
				
				System.out.println("Kalan  "  +   Bakiye);
				System.out.println("Bakiye Yetersiz  "  +   (Bakiye < miktar));
				break;
				
				case 2:
				System.out.println("Yatirilan miktar ");
				int yatırım = scan.nextInt();
				Bakiye += yatırım;
				System.out.println("Yatirilan miktar " + yatırım );
				System.out.println("Mevcut Bakiye " + Bakiye);
				break;
				
				case 3:
					System.out.println("Bakiye " + Bakiye);
				break;
				
				case 4: 
					System.out.println("Kartinizi Almayi Unutmayin");
				
				
				}
				
				
			}

		}