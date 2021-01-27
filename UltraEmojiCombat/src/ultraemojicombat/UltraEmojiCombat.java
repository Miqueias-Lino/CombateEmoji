package ultraemojicombat;


public class UltraEmojiCombat {

 
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty boy", "França", 31, 1.83f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.70f, 70.9f, 15, 2, 1);
        l[2] = new Lutador("Snapshadow", "Eua", 32, 1.79f, 81.6f, 14, 3, 3);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.75f, 80.9f, 10, 4, 1);
        l[4] = new Lutador("Ufo Cobol", "Brasil", 33, 1.90f, 119.3f, 9, 3, 2);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.78f, 105.9f, 12, 3, 2);
        
       
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[3], l[2]);
        UEC01.lutar();
        l[3].status();
        l[2].status();
    }
    
}
