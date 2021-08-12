package Patryk.company.singelton;

public class GameEngine {

    private int hp=100;
    private String characterName = "";
    private static GameEngine instance;

    private GameEngine() {
    }

    public  void run(){
        while (true){
            //czekamy na input gracza
            //zmiana stanu gry
            //render grafiki
        }
    }

    public static GameEngine getInstance(){
        if(instance==null ){
            synchronized (GameEngine.class){ // better than without it because in app with threads only one tread ca go into this part of code
                if(instance==null ){
                    instance = new GameEngine();
                }
            }
        }

        return instance;
    }
}
