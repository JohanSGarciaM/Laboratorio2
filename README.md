# Cuál es su mayor utilidad

Proveer al desarrollador para comprender el estado total de un esfuerzo de desarrollo en el menor tiempo posible.
con el fin de alcanzar el obejtivo, maven simplifica los procesos de build(compilar y generar ejecutables a partir de codigo fuente)
Maven a su vez es capaz de gestionar un proyecto de software completo, desde la etapa en la que se comprueba que el código es correcto, hasta que se despliega la aplicación, 
pasando por la ejecución de pruebas y generación de informes y documentación.

# Fases de maven

> *Validación (Validate)*
>  Validar que el proyecto es correcto.

> *Compilación (Compile)*

> *Test (test)*
> Probar el código fuente usando un framework de pruebas unitarias

> *Empaquetar (package)*
> Empaquetar el código compilado y transformarlo en algún formato tipo .jar o .war

> *Pruebas de integración (Integration-test)*
> Procesar y desplegar el código en algún entorno donde se puedan ejecutar las pruebas de integración.

> *Verificar*
> Verificar que el código empaquetado es válido y cumple los criterios de calidad (Verify).

> *Instalar (Install)*
> Instalar el código empaquetado en el repositorio local de maven, para utilizarlo como dependencia de otros proyectos

> *Desplegar (Deploy)*
> el código a un entorno

# Ciclo de vida de la construcción

1. *Compile:* Genera los ficheros *.class* compilando los fuentes *.java*
2. *test:* Ejecuta los test automáticos de JUnit existentes, abortando el proceso si alguno de ellos falla.
3. *Package:* Genera el fichero *.jar* con los *.class* compilados
4. *Install:* Copia el fichero *.jar* a un directorio de nuestro ordenador donde maven deja todos los *.jar* De esta forma esos *.jar* pueden utilizarse en otros proyectos maven en el mismo ordenador.
5. *Deploy:* Copia el fichero *.jar* a un servidor remoto, poniendolo disponible para cualquier proyecto maven con acceso a este servidor remoto

## Algunos metas que estan fuera del ciclo de vida
+ *clean:* Elimina todos los *.class* y *.jar* generados. Después de este comando se puede comenzar un compilado desde cero.
+ *assembly:* Genera un fichero *.zip* con todo lo necesario para instalar nuestro programa java. Se debe configurar previamente en un fichero xml qué se debe incluir en ese zip.
+ *site:* Genera un sitio web con la información de nuestro proyecto. Dicha información debe escribirse en el fichero *pom.xml* y ficheros *.apt* separados.
+ *site-deploy:* Sube el sitio web al servidor que hayamos configurado.


# Para qué sirven los plugins

Los plugins son usados para: Crear archivos *.jar*, crear archivos *.war*, compilar código, crear pruebas unitarias, crear la documentación del proyecto,etc.
Casi toda acción que se pueda realizar en un proyecto de maven es implementado por un plugin de maven.

*Clasificados por*
* Core plugins
* Packaging types/tools
* Reporting plugins
* Tools
* Retired
* MojoHaus
* Misc


# Qué es y para qué sirve el repositorio central de maven

Es donde se encuentran la mayoría de librerías que se utilizan en los desarrollos de software y que la propia herramienta se descarga
cuando sea necesario
Maven apunta a un repositorio central donde se suben todos los componentes que utiliza la comunidad que trabaja con la JDK

![](C:\Users\Lenovo\Desktop\CVDS\laboratorio2\MainRepository.JPG)	
