import javax.sound.midi.Soundbank;

class Profil{
    String name = "Faustino";
 }
 class  Status extends  Profil{
    String ocupation = "CyberSecurity";
 }
  class  ANDHRA  extends  Status{
    String AUInfo ="nextWeekIs Exam 🥱";
  }

 public class Multi_inhiritance {
     public static void main(String[] args) {
         Profil date = new Profil();
         Status status = new Status();
         ANDHRA andhra = new ANDHRA();
         System.out.println(date.name);
         System.out.println(andhra.AUInfo);
     }
}