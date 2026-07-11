# CPLP - Segunda Parte

**Acá subiré código sacado de exámenes viejos, relacionado con el tema de excepciones y también con clasificación de estructura de datos.**

## Clasificación de Estructuras de Datos:

**Clasifique las siguientes estructuras de datos de acuerdo a lo visto en la práctica (Producto Cartesiano | Correspondencia Finita | Unión | Recursion). Justifique en cada caso**

~~~python
class Moto:
    def __init__(self):
        self._patente = None
        self._anio = None
        self._modelo = None
        self._kms = []
    @property
    def anio(self):
        return self._anio
    @anio.setter
    def anio(self, valor):
        self._anio = valor
    def get_kms(self, km):
        return self._kms[km]
~~~

<details><summary> <code> Respuesta 🖱 </code></summary><br>
La estructura de datos dada es un <b>Producto Cartesiano</b> pues se define un tipo de dato compuesto por varios atributos. También hay <b>Correspondencia Finita</b> puesto que hay conjunto de valores que pueden accederse mediante a un subíndice (en <i>self._kms[km]</i> hay correspondencia entre el índice km y el valor guardado en una lista). 
</details>

~~~pascal
type
    PVertice = ^Vertice;
    PAdyacente = ^Adyacente;
    // Lista de adyacencia (punteros a otros vértices)
    Adyacente = record
        destino: PVertice;
        siguiente: PAdyacente;
    end;
    // Nodo del grafo
    Vertice = record
        id: Integer;
        adyacentes: PAdyacente;
        siguiente: PVertice;
    end;
~~~

<details><summary> <code> Respuesta 🖱 </code></summary><br>
La estructura de datos dada presenta <b>Producto Cartesiano</b> pues se definen los tipos de datos <i>Adyacente</i> y <i>Vertice</i> que están compuestos por varios atributos. También hay <b>Recursion</b> pues ambos registros son autorreferenciados mediante punteros: <i>Adyacente</i> contiene el atributo siguiente de tipo <i>Adyacente</i> y lo mismo <i>Vertice</i>, contiene el atributo siguiente del tipo <i>Vertice</i>, es una estructura autoreferenciada. 
</details>

~~~java
class Afiliado {
    private String nombre;
    private int edad;
    private String domicilio;
    private float [] credenciales;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public float getCredenciales(anio) {
        return this.credenciales(anio);
    }
}
~~~

<details><summary> <code> Respuesta 🖱 </code></summary><br>
La estructura de datos dada presenta <b>Producto Cartesiano</b> pues hay un tipo de dato Afiliado con varios atributos que lo definen. A su vez, también hay <b>Correspondencia Finita</b> puesto que hay un arreglo de float (credenciales) que se pueden acceder mediante un índice (anio).
</details>

~~~python
piezas = ["tuerca", "tornillo", "clavo"]
herramientas = [
    (1, "tuerca"),
    (2, "tornillo"),
    (3, "clavo"),
    (4, "martillo"),
    (5, "destornillador")
]
~~~

<details><summary> <code> Respuesta 🖱 </code></summary><br>
La estructura de datos presenta <b>Correspondencia Finita</b> puesto que piezas y herramientas son colecciones cuyos elementos se acceden mediante un índice, se corresponde cada elemento con una posición en la coleccion. Tambien hay <b>Producto Cartesiano</b> porque cada elemento dentro de herramientas es una tupla formada por un integer y un string.
</details>

~~~java
class Alumno {
    String nombre;
    String apellido;
    int edad;
    float promedio;
    String domicilio;
    public float getPromedio{
        return this.promedio;
    }
}
~~~

<details><summary> <code> Respuesta 🖱 </code></summary><br>
Acá hay <b>Producto Cartesiano</b> pues tenemos una clase Alumno que tiene varios atributos que la definen.
</details>

~~~C
typedef struct _nodoArbol {
    void *info;
    struct _nodoArbol *hijoIzq;
    struct _nodoArbol *hijoDer;
} nodoArbol;
typedef struct _arbolBinario {
    int valor_guardado;
    nodoArbol *raiz;
} arbolBinario;
~~~

<details><summary> <code> Respuesta 🖱 </code></summary><br>
Acá hay <b>Recursión</b> pues tenemos un tipo de dato _nodoArbol que está definido recursivamente pues sus atributos también son punteros que apuntan a otro _nodoArbol permitiendo generar la estructura del arbol. Además hay <b>Producto Cartesiano</b> pues _nodoArbol y _arbolBinario estan definidos por varios atributos de distintos tipos. 
</details>
