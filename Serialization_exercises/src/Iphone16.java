public class Iphone16 implements Wifi, Bluetooth, Camera, Network5G, GPS, BiometricSensor, FacialRecognition, DualChip, NFC, WirelessCharger{
    @Override
    public void  conecttoWifi(String network){
        System.out.println("Conected to eduroam wifi.");
    }
    @Override
    public void topair(String device){
        System.out.println("Device paired.");
    }
    @Override
    public void takePicture(){
        System.out.println("Picture taken, you look like a diva!");
    }

    @Override
    public void RecordVideo(){
        System.out.println("Recording has started!");
    }

    @Override
    public void conectTo5g(){
        System.out.println("This device has 5g conection.");
    }

    @Override
    public void toLocate(){
        System.out.println("This device has GPS.");
    }

    @Override
    public void unlockWithDigital(){
        System.out.println("Digital scan in progress.");
    }

    @Override
    public void unlockPhoneFacialRecognition(){
        System.out.println("Face scan in progress.");
    }

    @Override
    public void chooseChip(int number){
        System.out.println("Input chip number.");
    }

    @Override
    public void makePayment(String establishment){
        System.out.println("Payment submitted.");
    }

    @Override
    public void beginCharging(){
        System.out.println("Charging device");
    }
}
