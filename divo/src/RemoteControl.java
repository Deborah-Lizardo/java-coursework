public class RemoteControl implements Controller{
    public int volume;
    public boolean statusMenu;


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void openMenu() {
        if(this.tvOn()){
            System.out.println("Volume:");
            for (int i = 0; i <= this.volume, i++){
                System.out.println("|");
            }
            System.out.println("/n");
        }

    }

    @Override
    public void closeMenu() {
        if(menuOpen()){
            this.statusMenu = false;
        }

    }

    @Override
    public void volumeUp() {
        if (tvOn)){
            if (this.volume > 10)
        }

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void muteOn() {

    }

    @Override
    public void muteOff() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
