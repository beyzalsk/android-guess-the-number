import java.util.ArrayList;
import java.util.Arrays;

public class Sorular {
    ArrayList <String> soru = new ArrayList<>(Arrays.asList(
            "Türkiyenin Başkenti Neresidir ?",
            "Ordu Hangi Bölgemizdedir ?",
            "Aşağıdaki hayvanlardan hangisi çöl ortamına daha dayanıklıdır?",
            "Gülü ile meşhur olan ilimiz hangisidir?",
            "Türkiye’nin en büyük gölü hangisidir?"
    ));
    ArrayList<String> [] s =new ArrayList[5];
    ArrayList<String> cevap = new ArrayList<>(Arrays.asList(
            "Ankara",
            "Karadeniz Bölgesi",
            "Deve",
            "Isparta",
            "Van Gölü"

    ));
     Sorular(){
         for (int i = 0; i<5; i++){
             s[i] =new ArrayList<String>();
         }
         s[0].add("İzmir");
         s[0].add("Ankara");
         s[0].add("Bursa");
         s[0].add("İstanbul");

         s[1].add("Karadeniz Bölgesi");
         s[1].add("Ege Bölgesi");
         s[1].add("Akdeniz Bölgesi");
         s[1].add("Marmara Bölgesi");

         s[2].add("Papağan");
         s[2].add("Kedi");
         s[2].add("Zürafa");
         s[2].add("Deve");

         s[3].add("Eğirdir Gölü");
         s[3].add("Tuz Gölü");
         s[3].add("Van Gölü");
         s[3].add("Beyşehir Gölü");





    }
}
