public class IntermediateCellphone implements Wifi, Bluetooth, Camera, Network5G, GPS, BiometricSensor, FacialRecognition{
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
}
