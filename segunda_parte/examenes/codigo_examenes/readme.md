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



