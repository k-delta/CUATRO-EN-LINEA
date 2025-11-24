# 🚀 Guía de Despliegue en GitHub Pages

Esta guía te ayudará a desplegar el juego "Cuatro en Línea" en GitHub Pages.

## 📋 Paso 1: Preparar los archivos

Asegúrate de que todos los archivos necesarios estén en la carpeta `web/`:

```bash
cd web
./prepare.sh
```

Esto copiará:
- `linea.jar` → `web/lib/linea.jar`
- Imágenes → `web/images/`

## 📤 Paso 2: Agregar archivos a Git

Desde la raíz del proyecto:

```bash
# Agregar los archivos web
git add web/
git add .gitignore

# Verificar lo que se va a commitear
git status
```

## 💾 Paso 3: Hacer Commit

```bash
git commit -m "Agregar despliegue web con CheerpJ para GitHub Pages"
```

## 📡 Paso 4: Hacer Push

```bash
git push origin main
```

## ⚙️ Paso 5: Configurar GitHub Pages (desde GitHub)

### Opción A: GitHub Pages desde carpeta `/web`

1. Ve a tu repositorio en GitHub: `https://github.com/k-delta/CUATRO-EN-LINEA`
2. Haz clic en **Settings** (Configuración)
3. En el menú lateral, busca **Pages** (en la sección "Code and automation")
4. En **Source** (Fuente), selecciona:
   - **Branch**: `main`
   - **Folder**: `/web`
5. Haz clic en **Save** (Guardar)

### Opción B: Usar GitHub Actions (Recomendado)

Si prefieres automatizar el despliegue, se ha creado un workflow en `.github/workflows/deploy-pages.yml`.

## 🌐 Paso 6: Acceder al juego

Después de unos minutos, tu juego estará disponible en:

**https://k-delta.github.io/CUATRO-EN-LINEA/**

> ⚠️ **Nota**: Puede tomar unos minutos (hasta 10) para que GitHub Pages publique los cambios.

## 🔄 Actualizar el despliegue

Cada vez que hagas cambios y quieras actualizar el sitio:

```bash
# Actualizar archivos si es necesario
cd web
./prepare.sh

# Volver a la raíz
cd ..

# Agregar cambios
git add web/
git commit -m "Actualizar despliegue web"
git push origin main
```

GitHub Pages se actualizará automáticamente.

## 🔍 Verificar el estado del despliegue

1. Ve a **Settings** → **Pages** en tu repositorio
2. Verás el estado del despliegue y la URL del sitio
3. Si hay errores, aparecerán en la sección de despliegues

## ⚠️ Límites de GitHub Pages

- **Tamaño del repositorio**: Máximo 1GB
- **Tamaño de archivo**: Máximo 100MB por archivo
- **Ancho de banda**: 100GB/mes (gratuito)

Tu JAR es de ~17MB, así que no hay problemas.

## 🐛 Solución de problemas

### El sitio no aparece

1. Verifica que hayas seleccionado la carpeta `/web` como fuente
2. Espera 5-10 minutos para el primer despliegue
3. Revisa los logs en **Settings** → **Pages** → **View deployment log**

### Error 404

- Verifica que `index.html` esté en `web/index.html`
- Asegúrate de que la carpeta `/web` sea la fuente en GitHub Pages

### El juego no carga

1. Abre la consola del navegador (F12) para ver errores
2. Verifica que el JAR esté en `web/lib/linea.jar`
3. Asegúrate de que las imágenes estén en `web/images/`

## 📚 Más información

- [Documentación de GitHub Pages](https://docs.github.com/en/pages)
- [Configuración de GitHub Pages](https://docs.github.com/en/pages/getting-started-with-github-pages/configuring-a-publishing-source-for-your-github-pages-site)
