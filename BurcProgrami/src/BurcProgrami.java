
import java.util.Scanner;


public class BurcProgrami {
    public static void main(String[] args){
       
        Scanner scan= new Scanner(System.in); // Kullanıcıdan giriş almamıza yarıyor.
       
       
        System.out.println("Dogum gününüzü (1-31 arasi) giriniz:"); 
        byte Dg= scan.nextByte();
        System.out.println("Dogum ayinizi (1-12 arasi) giriniz:");
        byte Da= scan.nextByte();
        System.out.println("Dogum yilinizi giriniz:");
        int Dy= scan.nextInt();
        
        
        // Dg(doğum günü)-Da(doğum ayı)-Dy(doğum yılı)[Dy değişkenine aslında gerek yok programın gidişatına bi etkisi yok çünkü]
        
        System.out.println("Doğum tarihiniz: " + Dg +"." + Da +"." + Dy);
        
        System.out.println("Dogum tarihiniz dogru ise [1] yanlıs ise [2] ' yi tuslayınız") ;
        byte islem= scan.nextByte();
                    
        switch(islem){
            		
            case 1 :
                             if( Da==1 && Dg<=21 || Da==12 && Dg>=22 ) System.out.println("Oglak Burcusunuz");    
			
                        else if( Da==1 && Dg>=22 || Da==2 && Dg<=19) System.out.println("Kova Burcusunuz") ;    
			   
			else if( Da==2 && Dg>=20 || Da==3 && Dg<=20 ) System.out.println("Balık Burcusunuz") ;   
			 
			else if( Da==3 && Dg>=21 || Da==4 && Dg<=20) System.out.println("Koc Burcusunuz") ;     
			    
			else if( Da==4 && Dg>=21 || Da==5 && Dg<=21) System.out.println("Boga Burcusunuz") ;    
			    
			else if( Da==5 && Dg>=22 || Da==6 && Dg<=22) System.out.println("İkizler Burcusunuz") ; 
			
			else if( Da==6 && Dg>=23 || Da==7 && Dg<=22) System.out.println("Yengec Burcusunuz") ;  
			 
			else if( Da==7 && Dg>=23 || Da==8 && Dg<=22) System.out.println("Aslan Burcusunuz") ;   
			  
			else if( Da==8 && Dg>=23 || Da==9 && Dg<=22 ) System.out.println("Basak Burcusunuz") ;   
			  
			else if( Da==9 && Dg>=23 || Da==10 && Dg<=22) System.out.println("Terazi Burcusunuz") ;  
			
			else if( Da==10 && Dg>=23 || Da==11 && Dg<=21) System.out.println("Akrep Burcusunuz") ;  
			 
			else if( Da==11 && Dg>=22 || Da==12 && Dg<=21 ) System.out.println("Yay Burcusunuz") ;   
			
		
			break;
                        
                        
            case 2 :
			System.out.println("Lutfen  Dogum Tarihinizi Dogru Giriniz:");
                
        }
        
    }
}
