def funcionGetAlturas(nombre):
    try:
        try:
            alturas = {'Juan': 180, 'Carlos': 160, 'Lorena': 170}
            print(alturas[nombre])

        except KeyError: #capta errores de clave
            print("No se posee la altura del nombre ingresado") #imprime esto

        else:
            print("Imprime mensaje igual")

        print(alturas["Osvaldo"]) 

    except Exception: #capta cualquier error
        print("Otro nombre que no existe") #imprime esto


def funcionMultiploDe2():
    try:
        input1 = input()  # esta función lee un texto ingresado por consola
        x = int(input1) * 2

    except TypeError:
        print("El valor ingresado no puede multiplicarse, ingrese un número")

    else:
        print("El doble del valor ingresado es " + x)

    finally:
        print("Esto solo se imprime si la multiplicación fue válida")


funcionGetAlturas("Miguel")
funcionMultiploDe2()

"""
try:
    # Código que puede producir un error
except TipoDeError:
    # Código que se ejecuta si ocurre ese error
else:
    # Se ejecuta solo si NO hubo errores
finally:
    # Se ejecuta siempre
"""

"""
RESPUESTA: primero entra a la funcionGetAlturas con el nombre "Miguel", 
Entra a los try anidados, comomo el diccionario no tiene ese nombre, entonces 
entra al primer except que capta que hay un error por clave inexistente del
diccionario, imprime el mensaje "No se posee la altura del nombre ingresado",
luego sale del try interno, y en el segundo try tampoco encuentra la clave 
"Osvaldo" entonces el except del segundo try capta el error con Exception
e imprime "Otro nombre que no existe" y sale de la funcionGetAlturas.
Luego entra a la funcionMultiploDe2, se ingresa 5 por teclado, imput devuelve 
un string "5", que luego se convierte a entero en la linea 22, 
se multiplica por 2 y se guarda en la variable x, esto no levanta ningun error
de tipo por lo tanto entra al else. Sin embargo, en la instrucción 
print("El doble del valor ingresado es " + x) se intenta concatenar un string 
con un int, lo que produce un TypeError. Esta excepción no es capturada, puesto
que ocurre fuera del bloque try. A continuación se ejecuta el bloque finally, 
que imprime "Esto solo se imprime si la multiplicación fue válida", y 
finalmente el programa termina con un TypeError.
"""