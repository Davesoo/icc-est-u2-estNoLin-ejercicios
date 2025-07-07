
# Práctica de Árboles Binarios

## 📌 Información General

- **Título:** Estructuras No Lineales – Ejercicios Árboles
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Dave Fernando Sigüenza Vallejo - Grupo 2
- **Fecha:** 07 / 07 / 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto contiene la implementación de 4 ejercicios que utilizan árboles binarios en Java:

1. Insertar elementos en un Árbol Binario de Búsqueda (BST).
2. Invertir un Árbol Binario.
3. Listar nodos por niveles en Listas Enlazadas.
4. Calcular la Profundidad Máxima de un Árbol Binario.

Cada ejercicio está ubicado en su propia carpeta, contiene clases `Node`, `BinaryTree` y `Main`, e incluye ejemplos probados.

---

## 🚀 Ejecución

Para compilar y ejecutar los ejercicios:

1. Entra a la carpeta del ejercicio (por ejemplo `Ejercicio_01_insert`).
2. Compila los archivos:
   ```bash
   javac *.java
   ```
3. Ejecuta el archivo principal:
   ```bash
   java Main
   ```

---

## 🧑‍💻 Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

📁 Carpeta: `Ejercicio_01_insert`

**Descripción:**  
Se implementa un Árbol Binario de Búsqueda (BST), una estructura donde cada nodo contiene un valor, y los valores menores se colocan a la izquierda y los mayores a la derecha.  
El método de inserción se realiza de manera recursiva, creando un árbol ordenado que permite búsquedas rápidas.

**Input:**
```
[5, 3, 7, 2, 4, 6, 8]
```

**Output (Recorrido InOrden):**
```
2 3 4 5 6 7 8
```

---

## 🧑‍💻 Ejercicio 02: Invertir un Árbol Binario

📁 Carpeta: `Ejercicio_02_invert`

**Descripción:**  
Este ejercicio toma un árbol binario y lo invierte completamente. Se recorren los nodos de forma recursiva y se intercambian los subárboles izquierdo y derecho de cada nodo.  
Esto da como resultado una imagen espejo del árbol original.

**Input:**
```
        4
       / \
      2   7
     / \ / \
    1  3 6  9
```

**Output esperado:**
```
        4
       / \
      7   2
     / \ / \
    9  6 3  1
```

**Recorrido InOrden del árbol invertido:**
```
9 7 6 4 3 2 1
```

---

## 🧑‍💻 Ejercicio 03: Listar Niveles en Listas Enlazadas

📁 Carpeta: `Ejercicio_03_listLeves`

**Descripción:**  
Este ejercicio recorre el árbol binario nivel por nivel utilizando una cola (BFS) y almacena los nodos de cada nivel en una lista enlazada.  
El resultado es una colección de listas enlazadas, una por cada nivel del árbol, lo que permite representar visualmente la estructura por niveles.

**Input:**
```
        4
       / \
      2   7
     / \ / \
    1  3 6  9
```

**Output esperado:**
```
Nivel 0: 4  
Nivel 1: 2 -> 7   
Nivel 2: 1 -> 3 -> 6 -> 9 
```

---

## 🧑‍💻 Ejercicio 04: Calcular la Profundidad Máxima

📁 Carpeta: `Ejercicio_04_depth`

**Descripción:**  
Este ejercicio calcula la profundidad (altura) de un árbol binario, que es el número máximo de niveles desde la raíz hasta una hoja.  
Se implementa una función recursiva que compara la profundidad del subárbol izquierdo y derecho, y retorna el valor máximo más uno (por el nodo actual).

**Input:**
```
        4
       / \
      2   7
     / \   \  
    1   3   8 
```

**Output esperado:**
```
3
```

---

## ✅ Estructura del Proyecto

```
src/
└── Materia/
    ├── Ejercicio_01_insert/
    ├── Ejercicio_02_invert/
    ├── Ejercicio_03_listLeves/
    └── Ejercicio_04_depth/
```

---

## 📝 Observaciones

- Cada carpeta contiene sus archivos `.java`, probados y funcionales.
- Cada clase principal es `Main.java` e incluye método `main()` para ejecutar el ejercicio.
- Se realizaron pruebas con los datos indicados en la práctica.

---

## 📤 Subida al Repositorio

Sube tu proyecto a GitHub y realiza el commit final con:

```bash
git add .
git commit -m "Estructuras No Lineales – Ejercicios Arboles"
git push
```

📎 Sube la URL del repositorio al AVAC.
https://github.com/Davesoo/icc-est-u2-estNoLin-ejercicios.git

---

👨‍🏫 **Profesor:** Ing. Pablo Torres

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

