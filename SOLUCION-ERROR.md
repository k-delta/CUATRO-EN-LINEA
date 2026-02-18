# 🔧 Solución al Error: "Get Pages site failed"

## ❌ El Error

```
HttpError: Not Found
Get Pages site failed. Please verify that the repository has Pages enabled...
```

Este error ocurre porque **GitHub Pages no está habilitado** en tu repositorio.

## ✅ Solución: Habilitar GitHub Pages PRIMERO

**IMPORTANTE**: Debes habilitar GitHub Pages desde la interfaz web ANTES de que el workflow funcione.

### Paso 1: Habilitar GitHub Pages Manualmente

1. **Ve a tu repositorio en GitHub:**
   ```
   https://github.com/k-delta/CUATRO-EN-LINEA
   ```

2. **Haz clic en "Settings"** (Configuración) - está en la parte superior del repositorio

3. **En el menú lateral izquierdo, busca "Pages"** (está en la sección "Code and automation")

4. **En la sección "Build and deployment":**
   - **Source**: Selecciona "Deploy from a branch"
   - **Branch**: Selecciona `main`
   - **Folder**: Selecciona `/docs` ⚠️ **MUY IMPORTANTE**
   - Haz clic en **"Save"**

5. **Espera 1-2 minutos** para que GitHub Pages se habilite

### Paso 2: Verificar que está habilitado

Después de guardar, deberías ver:
- ✅ Un mensaje verde diciendo que GitHub Pages está habilitado
- ✅ La URL de tu sitio: `https://k-delta.github.io/CUATRO-EN-LINEA/`

### Paso 3: Ahora puedes usar GitHub Actions (Opcional)

Una vez habilitado GitHub Pages, el workflow de GitHub Actions funcionará automáticamente.

## 🚀 Método Alternativo: Despliegue Directo (Más Simple)

Si prefieres no usar GitHub Actions, puedes usar el método directo:

1. **Habilita GitHub Pages** (Paso 1 arriba)
2. **Haz push de tus archivos:**
   ```bash
   git add docs/
   git add .gitignore
   git commit -m "Agregar despliegue web"
   git push origin main
   ```
3. **GitHub Pages se actualizará automáticamente** en 1-2 minutos

## 📝 Notas Importantes

- ⚠️ **DEBES habilitar GitHub Pages desde la interfaz web primero**
- ⏱️ El primer despliegue puede tardar 2-5 minutos
- 🔄 Los despliegues futuros se actualizarán automáticamente
- 📊 Puedes ver el estado en **Settings → Pages**

## 🐛 Si Sigue Fallando

1. Verifica que hayas seleccionado la carpeta `/docs` (no `/root`)
2. Asegúrate de que la rama `main` tenga los archivos en `docs/`
3. Revisa los logs en **Settings → Pages → View deployment log**
4. Espera 5-10 minutos y recarga la página de Settings

## ✅ Verificación Final

Tu juego debería estar disponible en:
**https://k-delta.github.io/CUATRO-EN-LINEA/**

Si ves un error 404, espera unos minutos más y recarga.

