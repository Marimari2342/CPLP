public class ParcialExcepciones2024 {
    public static void main(String[] args) {
        try {
            for (int i = 1; i < 5; i++) {
                if (i == 1) {
                    System.out.println(Integer.toString(i));
                    rethrow("Uno");
                }
                else {
                    if (i == 2 || i == 3) {
                        switch (i) {
                            case 2:
                                System.out.println(Integer.toString(i));
                                rethrow("Dos");
                                break;
                            case 3:
                                System.out.println(Integer.toString(i));
                                rethrow("Tres");
                                break;
                        }
                    }
                    else {
                        if (i == 4) {
                            System.out.println(Integer.toString(i));
                            rethrow("Cuatro");
                        }
                    }
                }
            }
        }
        catch (ThirdException | FourthException e) {
            System.out.println(e.getMessage());
        }
    }

    static void rethrow(String a) throws ThirdException, FourthException {
        try {
            try {
                switch (a) {
                    case "Uno":
                        throw new FirstException("Excepción 1");
                        break;
                    case "Dos":
                        throw new SecondException("Excepción 2");
                        break;
                    case "Tres":
                        throw new ThirdException("Excepción 3");
                        break;
                    case "Cuatro":
                        throw new FourthException("Excepción 4");
                        break;
                }

            }
            catch (SecondException e) {
                ThirdException e1 = new ThirdException("Excepción 3");
                throw e1;
            }
        }
        catch (FirstException e) {
            FourthException e1 = new FourthException("Excepción 4");
            throw e1;
        }
    }
}

/*
 *  Primero entra al main ejecuta el for y como i=1 entra al primer if, imprime 1 y 
 *  se ejecuta rethrow("Uno"). Ahí ingreso a los try anidados, como a es "Uno", entra 
 *  al primer caso del switch y se lanza la excepcion FirstException, que no es capturada
 *  por el catch interno pero si por el externo. Este lanza la excepcion FourthException, 
 *  luego la FourthException SE PROPAGA AL MAIN (sale del rethrow y vuelvo al main)
 *  y la misma es capturada por el catch del main y se imprime "Excepción 4". Luego como 
 *  no hay nada más en el main, termina el programa.
 */