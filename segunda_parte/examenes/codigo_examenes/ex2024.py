def funcionGetEdades(nombre):
    try:
        try:
            edades = {"Juan": 30, "Carlos": 28, "Lorena": 33}
            print(edades[nombre])
        except KeyError:
            print("No se posee la edad del nombre ingresado")
        else:
            print("Imprime mensaje igual")
        print(edades["Osvaldo"])
    except Exception:
        print("Otro nombre que no existe")

def funcionMultiploDe3():
    try:
        input1 = input()      # esta función lee un texto ingresado por consola
        x = int(input1) * 3
    except TypeError:
        print("El valor ingresado no puede multiplicarse, ingrese un número")
    else:
        print("El triple del valor ingresado es " + str(x))
    finally:
        print("Esto solo se imprime si la multiplicación fue válida")

funcionGetEdades("Miguel")
funcionMultiploDe3()

"""
RESPUESTA: Primero entra a la funcionGetEdades con el nombre "Miguel", entro a los catch
anidados, como en el diccionario no esta ese nombre, se ejecuta la excepción
KeyError, que imprime "No se posee la edad del nombre ingresado". Luego sale
del try interno, en el segundo try vuelve a buscar un nombre que no se 
encuentra en el diccionario ("Osvaldo"), se ejecuta la excepcion Exception, 
y la misma imprime "Otro nombre que no existe" y termina la funcion. 
Luego ingresa a la funcionMultiploDe3, se lee 5 ingresado por teclado y se guarda
como string, luego se convierte a entero y se multiplica por 3 en la linea 17.
Como no hay error de tipo, entra al else se imprime "El triple del valor ingresado es 15"
luego entra al finally y se imprime "Esto solo se imprime si la multiplicación fue válida"
y luego termina la funcionMultiploDe3 y el programa.
"""