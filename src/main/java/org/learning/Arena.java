package org.learning;

/**
 * Created by Zdenca on 4/27/2017.
 */
public class Arena {
    private Champion champion1;
    private Champion champion2;
    private Cube cube;

    public Arena(Champion champion1, Champion champion2, Cube cube) {
        this.champion1 = champion1;
        this.champion2 = champion2;
        this.cube = cube;
    }
    private void paint() {
        System.out.println("-----------The Arena--------------");
        System.out.print("Health of champions: \n");
        System.out.printf("%s %s\n", champion1, champion1.imageLife());
        System.out.printf("%s %s\n", champion2, champion2.imageLife());
    }
    private void getMessage(String message) {
        System.out.println(message);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.err.println("Error, the thread failed to sleep");
        }
    }
    public void fight() {
        System.out.println("Welcome in the arena");
        System.out.printf("Today fight %s %s! \n\n", champion1, champion2);
        System.out.println("The fight can begin...");
        while (champion1.isAlive() & champion2.isAlive()) {
            champion1.attack(champion2);
            paint();
            getMessage(champion1.getLastMessage());
            getMessage(champion2.getLastMessage());
            champion2.attack(champion1);
            paint();
            getMessage(champion1.getLastMessage());
            getMessage(champion2.getLastMessage());
            System.out.println();
        }
    }

}
