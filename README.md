# app-movil

App para Android destinada a la gestión de un parqueadero.

La aplicación cuenta con tres roles principales: Administrador, Vendedor y Cliente. El Cliente tiene la capacidad de buscar su vehículo por placa, mientras que el Administrador y el Vendedor pueden llevar a cabo diversas tareas administrativas como la gestión de ingresos y salidas de vehículos, la generación de facturas de cobro basadas en el tiempo de permanencia, así como el registro de vehículos, usuarios, parqueaderos y la asignación de vendedores a los parqueaderos.

Además, en este proyecto se incluye una aplicación Java para escritorio y una API en PHP. Estas partes del proyecto facilitan la comunicación entre la aplicación móvil y la de escritorio, permitiendo así una integración completa y una experiencia de usuario unificada en diferentes plataformas.

La aplicación Java para escritorio proporciona funcionalidades adicionales y una interfaz de usuario adaptada a entornos de escritorio, mientras que la API en PHP actúa como intermediario para el intercambio de datos entre las diferentes aplicaciones.

La inclusión de estas componentes amplía las capacidades del proyecto y permite su adaptación a una variedad de escenarios y requisitos de uso.

## Dependencias

- **AndroidX AppCompat** (`androidx.appcompat:appcompat:1.6.1`): Biblioteca de soporte para la creación de interfaces de usuario coherentes en versiones antiguas de Android.

- **Material Components for Android** (`com.google.android.material:material:1.11.0`): Implementa los principios de Material Design en las aplicaciones de Android.

- **Volley** (`com.android.volley:volley:1.2.1`): Biblioteca para realizar solicitudes de red de manera sencilla en aplicaciones Android.

- **AndroidX RecyclerView** (`androidx.recyclerview:recyclerview:+`): Componente de Android para mostrar grandes conjuntos de datos de manera eficiente en una vista de desplazamiento.

- **ConstraintLayout** (`androidx.constraintlayout:constraintlayout:2.1.4`): Un layout flexible para diseñar interfaces de usuario sin anidaciones excesivas de vistas.

- **Glide** (`com.github.bumptech.glide:glide:4.16.0`): Biblioteca para cargar imágenes de forma eficiente en aplicaciones Android.

- **JUnit** (`junit:junit:4.13.2`): Framework de pruebas unitarias para Java.

- **AndroidX Test - JUnit** (`androidx.test.ext:junit:1.1.5`): Extensión de JUnit para escribir y ejecutar pruebas unitarias en Android.

- **Espresso** (`androidx.test.espresso:espresso-core:3.5.1`): Framework para escribir pruebas de interfaz de usuario en Android.

- **iTextPDF** (`com.itextpdf:itextpdf:5.5.13`): Biblioteca para generar documentos PDF en Java.

## Otros

- **Glide Compiler** (`com.github.bumptech.glide:compiler:4.12.0`): Compilador de Glide para procesar anotaciones de tiempo de compilación.

Esta lista resume las dependencias utilizadas en el proyecto, facilitando así la comprensión de su estructura y las tecnologías empleadas.
