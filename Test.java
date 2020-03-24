import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("Beyblade programina hoşgeldiniz");
        System.out.println("Cikmak isterseniz q'ya basiniz");

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz? ");
            String islem = scanner.nextLine();
            if(islem.equals("q"))
            {
                System.out.println("Programdan cikiliyor");
                break;
            }
            else {
                BeybaldeFabrikasi fabrika = new BeybaldeFabrikasi();

                Beyblade beyblade = fabrika.beybaldeUret(islem);

                if(beyblade == null)
                {
                    System.out.println("Lutfen gecerli bir beyblade ismi giriniz ...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();

                }
            }
        }
    }
}
