# Cuatro en Línea - Despliegue Web

Este proyecto contiene la versión web del juego "Cuatro en Línea" utilizando CheerpJ para convertir la aplicación Java Swing a JavaScript y ejecutarla en el navegador.

## 📋 Requisitos

- Navegador web moderno (Chrome, Firefox, Edge, Safari)
- Conexión a internet (para cargar CheerpJ runtime)
- Servidor web local (para desarrollo) o servidor web de producción (para despliegue)

## 🚀 Instalación y Preparación

### Opción 1: Usar el script de preparación automática

```bash
cd web
./prepare.sh
```

Este script:
- Copia el archivo `linea.jar` a `web/lib/`
- Copia las imágenes necesarias a `web/images/`
- Verifica que todo esté en su lugar

### Opción 2: Preparación manual

1. **Copiar el JAR:**
   ```bash
   cp linea.jar web/lib/
   ```

2. **Copiar las imágenes:**
   ```bash
   cp -r src/images/* web/images/
   ```

3. **Verificar estructura:**
   ```
   web/
   ├── index.html
   ├── lib/
   │   └── linea.jar
   ├── images/
   │   └── (todas las imágenes)
   └── README.md
   ```

## 🌐 Ejecutar Localmente

### Opción 1: Python HTTP Server

```bash
cd web
python3 -m http.server 8000
```

Luego abre: http://localhost:8000

### Opción 2: Node.js http-server

```bash
cd web
npx http-server -p 8000
```

Luego abre: http://localhost:8000

### Opción 3: PHP Built-in Server

```bash
cd web
php -S localhost:8000
```

Luego abre: http://localhost:8000

## 📦 Despliegue en Producción

### GitHub Pages

1. Sube los archivos de la carpeta `web/` a un repositorio de GitHub
2. Activa GitHub Pages en la configuración del repositorio
3. Selecciona la rama y carpeta raíz (`/root` o `/web`)
4. Accede a: `https://tu-usuario.github.io/tu-repositorio/`

### Netlify

1. Instala Netlify CLI: `npm install -g netlify-cli`
2. Desde la carpeta `web/`:
   ```bash
   netlify deploy
   ```
3. O arrastra la carpeta `web/` a [app.netlify.com/drop](https://app.netlify.com/drop)

### Vercel

1. Instala Vercel CLI: `npm install -g vercel`
2. Desde la carpeta `web/`:
   ```bash
   vercel
   ```

### Otro servidor web

Simplemente sube todos los archivos de la carpeta `web/` a tu servidor web usando FTP, SCP, o el método que prefieras.

## ⚙️ Configuración

### Tamaño de la ventana

El juego está configurado para 800x800 píxeles. Para cambiar el tamaño, edita `index.html`:

```javascript
cheerpjCreateDisplay(800, 800);  // Cambia estos valores
```

### Memoria asignada

El JVM virtual en el navegador tiene 512MB de memoria. Para cambiarlo:

```javascript
await cheerpjInit({
    jrePath: "https://cjrtnc.leaningtech.com/4.2/jre",
    memoryMB: 512  // Cambia este valor
});
```

## 🔧 Solución de Problemas

### El juego no carga

1. **Verifica la consola del navegador** (F12) para ver errores
2. **Verifica que el JAR esté en** `web/lib/linea.jar`
3. **Asegúrate de tener conexión a internet** (CheerpJ se carga desde CDN)
4. **Verifica que estés usando un servidor web** (no puedes abrir `index.html` directamente con `file://`)

### Las imágenes no aparecen

1. Verifica que las imágenes estén en `web/images/`
2. Asegúrate de que el JAR contenga las imágenes embebidas (si las carga desde recursos)
3. Revisa la consola del navegador para errores 404 de recursos

### El juego es lento

- Aumenta la memoria asignada en la configuración de `cheerpjInit()`
- Considera optimizar el tamaño del JAR
- El rendimiento puede variar según el navegador y hardware

## 📝 Notas Importantes

1. **Primera carga:** La primera vez que se carga el juego puede tomar más tiempo ya que CheerpJ necesita descargar el runtime
2. **Conexión a internet:** Se requiere conexión a internet para cargar CheerpJ desde el CDN
3. **Recursos:** Asegúrate de que todos los recursos (imágenes, etc.) estén incluidos en el JAR o accesibles vía HTTP
4. **Compatibilidad:** CheerpJ funciona mejor en navegadores Chromium (Chrome, Edge) y Firefox

## 📚 Recursos

- [Documentación de CheerpJ](https://cheerpj.com/docs/)
- [CheerpJ Getting Started](https://cheerpj.com/docs/getting-started/)
- [CheerpJ GitHub](https://github.com/leaningtech/cheerpj-meta)

## 📄 Licencia

Ver el archivo LICENSE en el directorio raíz del proyecto.

## 👥 Autores

- Miguel Guzman
- Jeasson Suarez  
- Catalina Preciado

---

¡Disfruta jugando Cuatro en Línea en tu navegador! 🎮
