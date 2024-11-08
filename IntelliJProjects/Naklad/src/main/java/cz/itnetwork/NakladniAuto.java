package cz.itnetwork;

public class NakladniAuto {

    /**
     * Nosnost nakladni auta
     */
    public int nosnost = 3000;
    public int zatimniNosnost = 0;
    public String hlaska;

     public int nalozit(int naklad) {
         if ((naklad + zatimniNosnost) <= nosnost) {
             return zatimniNosnost += naklad;
         } else {
             return zatimniNosnost;
         }
     }
     public int vylozit(int naklad) {
         if (zatimniNosnost >= naklad) {
             return zatimniNosnost -= naklad;
         } else {
             return zatimniNosnost;
         }
     }

}
