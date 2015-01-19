/**
 * 
 */
public class Tunes {


   public static void main (String[] args)
   {
       
       CDCollection music   = new CDCollection();
       
       // Del 1
       /* 
       CD myCD = new CD("Desire", "Bob Dylan", 155.00);
       CD myCD1 = new CD("Mylo Xyloto", "Coldplay", 195.00);

       myCD.addSong("Hurricane");
       myCD.addSong("Isis");
       myCD.addSong("Mozambique");
       myCD.addSong("Sara");
       
       myCD1.addSong("Mylo Xyloto");
       myCD1.addSong("Paradise");
       myCD1.addSong("Princess of China");
       
       music.addCD(myCD);
       music.addCD(myCD1);
       
       System.out.println(music);
       */
       
       // Del 2
       
       CD1 myCD2 = new CD1("Desire", "Bob Dylan", 155.00);
       CD1 myCD3 = new CD1("Mylo Xyloto", "Coldplay", 195.00);  
       Track t1 = new Track("Dylan", "Hurricane", 8.33, 5);
       Track t2  = new Track("Dylan", "Isis   ", 6.58, 2);
       Track t3  = new Track("Dylan", "Mozambique", 3.00, 1);
       Track t4 = new Track("Dylan", "Sara", 5.29, 4);
       
       Track c1 = new Track("Coldplay", "Mylo Xyloto", 4.33, 2);
       Track c2  = new Track("Coldplay", "Paradise   ", 6.32, 5);
       Track c3  = new Track("Coldplay", "Princess of China", 5.55, 4);
             
       myCD2.addSong(t1);
       myCD2.addSong(t2);
       myCD2.addSong(t3);
       myCD2.addSong(t4);
       
       myCD3.addSong(c1);
       myCD3.addSong(c2);
       myCD3.addSong(c3);
       music.addCD(myCD2);
       music.addCD(myCD3);
       
       System.out.println("Del 2");
       System.out.println(music);
       
       // Del 3
       
       System.out.println("Del 3");
       System.out.println("Removing CD Bob Dylan: Desire");
       music.removeCD("Desire", "Bob Dylan");
       System.out.println(music);
       
	    System.out.println("Changing two different projects, does it work ?"); 
       
   }

}
