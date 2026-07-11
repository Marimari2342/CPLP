/*EXAMEN 2025 - punto excepciones*/
public class ParcialExcepciones {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 1) {
                    System.out.println(Integer.toString(i));
                    relanzador(i);
                } else {
                    if (i == 2 || i == 3) {
                        switch (i) {
                            case 2:
                                System.out.println(Integer.toString(i));
                                relanzador(i);
                                break;
                            case 3:
                                System.out.println(Integer.toString(i));
                                relanzador(i);
                                break;
                        }
                    } else {
                        System.out.println(Integer.toString(i)); // primero
                        relanzador(i);
                    }
                }
            }
        } catch (ThirdException | FourthException e) {
            System.out.println(e.getMessage());
        }
    }

    static void relanzador(int i) throws ThirdException, FourthException {
        try {
            try {
                switch (i) {
                    case 1:
                        throw new FirstException(Integer.toString(i));
                        break;
                    case 2:
                        throw new SecondException(Integer.toString(i));
                        break;
                    case 3:
                        throw new ThirdException(Integer.toString(i));
                        break;
                    default:
                        throw new FourthException(Integer.toString(i));
                        break;
                }
            } catch (SecondException e) {
                ThirdException e1 = new ThirdException(Integer.toString(i));
                throw e1;
            }
        } catch (FirstException e) {
            FourthException e1 = new FourthException(Integer.toString(i));
            throw e1;
        }
    }
}

/*  throw --> lanza una excepción
    throws --> mediante esto se especifica cualquier excepcion que se envia 
            desde un metodo 
    try --> es el bloque en donde se puede dar una excepcion
    catch --> es el bloque en donde se manejan las excepciones (captura el
            tipo de excepcion que figura ahí nomás)
    finally --> se ejecuta siempre */

/*Primero entro al for, i vale 0 así que entra al else (linea 22) imprime 0 
y se ejecuta relanzador(0), ahí ingresa a los try anidados y al switch, como
no es ninguno de los casos entra al default, lanza FourthException, pero como
ninguno de los catch lo puede manejar termina el relanzador sin que nadie
capte la excepcion. Vuelve al main con la excepcion FourthException, ahí lo 
capta el catch correspondiente a la linea 26. Ejecuta el catch y se vuelve a
imprimir 0. Luego se termina el programa main. Por lo tanto se imprimio 00 */