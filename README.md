# CoAlarm-UXUI

# Web
1. Clonar el repositorio usando la terminal con:

```bash
$> git clone https://github.com/jvillada97/CoAlarm-UXUI.git
```
2. Acceder a la carpeta del proyecto con:

```bash
$> cd CoAlarm-UXUI/web
```
3. Instalar http-server con:

```bash
$> npm install -g http-server
```
4. Iniciar el servidor con:
```bash
$> http-server
```
5. Acceder al sitio web [CoAlarm](http://127.0.0.1:8080/)

# Movil

## Requisitos

Asegúrate de tener instaladas las siguientes herramientas:

- [JDK 8](https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=All&field_architecture_target_id=All&field_java_package_target_id=All)
- [Android Studio actualizado](https://developer.android.com/studio)
- [SDK actualizado](https://developer.android.com/studio)
- Dispositivo físico con sistema operativo Android con la función de permitir la instalación de fuentes desconocidas o un emulador de un dispositivo virtual con sistema operativo Android.

1. Uso a través del archivo APK:
    - Descargar en el dispositivo móvil el archivo .apk disponible en la ruta: mobile/APK/app-release.apk
    - Instalar APK
    - Usar la app móvil

2. Uso a través de Android Studio y emulador del dispositivo virtual:
    - Entrar a Android Studio y dar clic en la opción "Open" y buscar el folder Co_Alarm del repositorio descargado: 
    - Con la ayuda de la interfaz gráfica de Android Studio acceder al archivo MainActivity.kt, abrir y dar clic en el botón de ejecución al lado de la clase "MainActivity"

# Distribución de pantallas por estudiante

1. Carlos Andres Tiguaque:
    - Web: Verificación de identidad, envio de código y menú.
    - Movil: Iniciar sesión, crear alarma y crear grupo. 

2. Juan Camilo Villada: 
    - Web: Iniciar sesión, registro y listar grupos.
    - Movil: Editar alarma, menú principal y pantalla de notificación
