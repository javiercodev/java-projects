import java.util.Scanner;

public class RPG {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Options.
        // select attack
        System.out.print("Select the attack(FIRE, ICE, ELECTRIC, PHYSICAL): ");
        String attack = s.nextLine();
        // select enemy
        System.out.print("Select your enemy(DRAGON, GOLEM, SPECTRUS, HUMAN): ");
        String enemy = s.nextLine();
        // select terrain climate
        System.out.print("Select the terrain climate(RAIN, SUN, NORMAL): ");
        String terrainClimate = s.nextLine();
        // select entry damage
        System.out.print("entryDamage: ");
        double entryDamage = Double.parseDouble(s.nextLine());

        double multEnemy = 1;
        double multClimate = 1;
        double totalDamage = 0;

        // Logic.
        switch(attack) {
            case "FIRE":
                if ("GOLEM".equals(enemy)) {
                    multEnemy = 1.5;
                } else if ("DRAGON".equals(enemy)) {
                    multEnemy = 0.5;
                }
                if ("SUN".equals(terrainClimate)){
                    multClimate = 1.2;
                } 
                if ("RAIN".equals(terrainClimate)) {
                    multClimate = 0.5;
                }
                totalDamage = entryDamage * multEnemy * multClimate;
                break;
            case "ICE":
                 if ("DRAGON".equals(enemy)) {
                    multEnemy = 2.0;
                } else if ("GOLEM".equals(enemy)) {
                    multEnemy = 0.8;
                }
                if ("RAIN".equals(terrainClimate)){
                    multClimate = 1.25;
                } 
                totalDamage = entryDamage * multEnemy * multClimate;
                break;
            case "ELECTRIC":
                if ("SPECTRUS".equals(enemy)) {
                    totalDamage = 0.0;
                } else {
                if ("RAIN".equals(terrainClimate)) {
                    multClimate = 2.5;
                }
                totalDamage = entryDamage * multEnemy * multClimate;
                }
                break;
            case "PHYSICAL":
                if ("SPECTRUS".equals(enemy)) {
                    totalDamage = 0.0;
                } else {
                if ("HUMAN".equals(enemy)) {
                    multEnemy = 1.2;
                }
                totalDamage = entryDamage * multEnemy * multClimate;
                }
                break;
            }   
            System.out.print("Total Damage: " + totalDamage);
        }
    } 
