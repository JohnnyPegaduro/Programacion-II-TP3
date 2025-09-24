# TP3 – Introducción a la Programación Orientada a Objetos (Java)

[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://adoptium.net/)
![Build](https://img.shields.io/badge/Build-Ant-blue.svg)
![IDE](https://img.shields.io/badge/IDE-NetBeans%2012%2B-1f6feb.svg)
![Status](https://img.shields.io/badge/Estado-Listo%20para%20correr-success.svg)

Proyecto de práctica de **POO**: clases, objetos, encapsulamiento y simulaciones simples.  
Estructura lista para abrir en **NetBeans (Ant)**.

---

## 📦 Estructura

```
TP3_POO_NetBeans/
├─ build.xml
├─ manifest.mf
├─ nbproject/
│  ├─ build-impl.xml        (generado por NetBeans)
│  ├─ project.properties    (configuración de build)
│  └─ project.xml
├─ src/
│  └─ tp3/
│     ├─ Main.java
│     ├─ Estudiante.java
│     ├─ Mascota.java
│     ├─ Libro.java
│     ├─ Gallina.java
│     └─ NaveEspacial.java
├─ test/
└─ README.md
```

---

## 🎯 Objetivos

- Practicar **clases** y **objetos**.
- Aplicar **encapsulamiento** (atributos `private`, getters/setters, validaciones).
- Usar **métodos** con lógica simple y **menú por consola**.
- Configurar y ejecutar un proyecto **NetBeans con Ant**.

---

## 🧰 Requisitos

- **JDK 17** (o superior).
- **NetBeans 12+**.
- Windows / Linux / macOS.

> Recomendado: en `nbproject/project.properties` asegurate de tener  
> `javac.release=17` para evitar warnings.

---

## ▶️ Cómo abrir y ejecutar (NetBeans)

1. **File → Open Project…** y elegí la carpeta `TP3_POO_NetBeans`.
2. **Run Project (F6)**.  
   - Si pregunta por Main Class, seleccionar: **`tp3.Main`**.
3. En consola verás un **menú** con opciones (1–5) para probar cada ejercicio.

---

## 💻 Ejecución por consola (opcional)

Desde la raíz del proyecto:

```bash
# Compilar (JDK 17+)
mkdir -p build/classes
find src -name "*.java" > sources.txt
javac --release 17 -d build/classes @sources.txt

# Ejecutar
java -cp build/classes tp3.Main
```

En Windows sin bash:

```bat
mkdir build\classes
dir /b /s src\*.java > sources.txt
javac --release 17 -d build\classes @sources.txt
java -cp build\classes tp3.Main
```

---

## 📘 Descripción de clases

- **`tp3.Main`**  
  Menú por consola para ejecutar las demostraciones de cada ejercicio.

- **`tp3.Estudiante`**  
  Atributos públicos simples (`nombre`, `apellido`, `curso`, `calificacion`).  
  Métodos: `mostrarInfo()`, `subirCalificacion(puntos)`, `bajarCalificacion(puntos)`.

- **`tp3.Mascota`**  
  Atributos (`nombre`, `especie`, `edad`).  
  Métodos: `mostrarInfo()`, `cumplirAnios()`.

- **`tp3.Libro`** *(encapsulado)*  
  Atributos `private` (`titulo`, `autor`, `anioPublicacion`).  
  Getters y **setter validado** (`setAnioPublicacion` limita entre 1450 y año actual).  
  Método: `mostrarInfo()`.

- **`tp3.Gallina`**  
  Atributos (`idGallina`, `edad`, `huevosPuestos`).  
  Métodos: `ponerHuevo()`, `envejecer()`, `mostrarEstado()`.

- **`tp3.NaveEspacial`**  
  Atributos `private` (`nombre`, `capacidadMaxima`, `combustible`, `enVuelo`).  
  Métodos: `despegar()`, `avanzar(distancia)`, `recargarCombustible(cantidad)`, `mostrarEstado()`.

---

## 🧪 Ejemplo de salida (recortado)

```
=== TP3 – Introducción a la POO ===
1) Registro de Estudiantes
2) Registro de Mascotas
3) Encapsulamiento con Libro
4) Gestión de Gallinas
5) Simulación de Nave Espacial
0) Salir
Elija una opción: 5

--- Ejercicio 5: Nave Espacial ---
Nave "Andrómeda" | combustible: 50/100 | estado: en tierra
Intentamos avanzar sin despegar:
Andrómeda: no puede avanzar porque no está en vuelo.
Despegue:
Andrómeda: ¡Despegó! (-10 de combustible)
...
```

---

## 🛠️ Troubleshooting

- **Warning: `--release 17 is recommended`**  
  En `nbproject/project.properties` debe estar:
  ```properties
  javac.release=17
  ```
  (Podés dejar `javac.source/target`, pero `release` manda).

- **Warning: “modified in the future”**  
  Los archivos tienen fecha/hora futura. Soluciones:
  - Abrí y **Guardá** cada archivo en NetBeans, o  
  - PowerShell en la raíz del proyecto:
    ```powershell
    Get-ChildItem -Recurse -File src | ForEach-Object { $_.LastWriteTime = Get-Date }
    ```

- **Comillas en `println`**  
  Para imprimir comillas dentro del texto, usar `\"`.  
  Ejemplos correctos:
  ```java
  // Libro.java
  System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");

  // NaveEspacial.java
  System.out.println("Nave \"" + nombre + "\" | combustible: " + combustible + "/" + capacidadMaxima
      + " | estado: " + (enVuelo ? "en vuelo" : "en tierra"));
  ```

---

## 📄 Autor

Matias Ariel Deluca

---


## 📄 Licencia

Uso educativo. Podés clonar y adaptar citando la fuente.
