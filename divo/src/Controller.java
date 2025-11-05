public interface Controller {
    public void turnOn();
//PODE IMPLEMENTAR METODO DEFAULT NA INTERFACE
    //QUESTAO PROVA: DIFERENCA DE CLASSE ABSTRATA E INTERFACE
    public void turnOff();

    public void openMenu();

    public void closeMenu();

    public void volumeUp();
    //tem que ser em pipe

    public void volumeDown();

    public void muteOn();

    public void muteOff();

    public void play();

    public void pause();


}
