public class Television {

   private final String MANUFACTURER;
   private final int SCREEN_SIZE;
   private boolean powerOn;
   private int channel;
   private int volume;

   /**
   * @param mANUFACTURER
   * @param sCREEN_SIZE
   */
   public Television(String MANUFACTURER, int SCREEN_SIZE) {
       this.MANUFACTURER = MANUFACTURER;
       this.SCREEN_SIZE = SCREEN_SIZE;
       this.powerOn = false;
       this.volume = 20;
   }

   public void setChannel(int station) {
       this.channel = station;
   }

   public void power() {
       this.powerOn = true;
   }

   public void increaseVolume() {
       this.volume++;
   }

   public void decreaseVolume() {
       this.volume--;
   }

   public int getChannel() {
       return channel;
   }

   public int getVolume() {
       return volume;
   }

   public String getManufacturer() {
       return MANUFACTURER;
   }

   public int getScreenSize() {
       return SCREEN_SIZE;
   }

}