package ex1;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne");
            }

            double n = Double.parseDouble(args[0]);
            double x = Double.parseDouble(args[1]);

            System.out.println("Résultat : " + Mathematique.f(n, x));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Les arguments doivent être des nombres");
        } catch (ParametreNullException | NegatifException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bloc finally exécuté quel que soit le résultat d'exécution");
        }
    }
}
