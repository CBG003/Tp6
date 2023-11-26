package ex1;

class ParametreNullException extends Exception {
    public ParametreNullException(String message) {
        super(message);
    }
}

class NegatifException extends Exception {
    public NegatifException(String message) {
        super(message);
    }
}

class Mathematique {
    public static double f(double n, double x) throws ParametreNullException, NegatifException {
        if (n == 0) {
            throw new ParametreNullException("Impossible de faire une division par zéro !");
        }

        if (x < 0) {
            throw new NegatifException(x + " est négatif : on ne peut pas calculer une racine pour un réel négatif !!!!");
        }

        return Math.sqrt(x) / n;
    }
}
