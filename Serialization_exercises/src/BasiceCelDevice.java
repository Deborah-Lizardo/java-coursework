class BasiceCelDevice implements Wifi, Bluetooth, Camera {
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
}
