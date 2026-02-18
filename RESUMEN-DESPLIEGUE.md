# 📋 Resumen: Despliegue en GitHub Pages

## ✅ Lo que ya está listo

1. ✅ Estructura web completa en `/docs`
2. ✅ `.gitignore` actualizado para permitir el JAR necesario
3. ✅ Workflow de GitHub Actions creado (opcional)
4. ✅ Scripts de preparación y despliegue

## 🚀 OPCIÓN 1: Despliegue Automatizado (Recomendado)

Ejecuta el script que automatiza todo:

```bash
./deploy-to-github.sh
```

Este script:
- Prepara los archivos
- Hace commit
- Hace push
- Te muestra los siguientes pasos

## 🔧 OPCIÓN 2: Despliegue Manual

### Paso 1: Preparar archivos
```bash
cd docs
./prepare.sh
cd ..
```

### Paso 2: Agregar a git
```bash
git add docs/
git add .gitignore
git add .github/workflows/deploy-pages.yml
```

### Paso 3: Commit
```bash
git commit -m "Agregar despliegue web con CheerpJ para GitHub Pages"
```

### Paso 4: Push
```bash
git push origin main
```

## ⚙️ Paso 5: Configurar GitHub Pages en GitHub

1. **Ve a tu repositorio**: https://github.com/k-delta/CUATRO-EN-LINEA
2. **Haz clic en "Settings"** (Configuración)
3. **En el menú lateral, busca "Pages"** (en "Code and automation")
4. **En "Source"**, selecciona:
   - **Branch**: `main`
   - **Folder**: `/docs` ⚠️ IMPORTANTE: selecciona `/docs`
5. **Haz clic en "Save"**

## 🌐 Paso 6: Acceder al juego

Después de 5-10 minutos, tu juego estará disponible en:

**https://k-delta.github.io/CUATRO-EN-LINEA/**

## 📝 Notas Importantes

- ⏱️ El primer despliegue puede tardar hasta 10 minutos
- 🔄 Los despliegues futuros se actualizarán automáticamente cuando hagas push
- 📊 Puedes ver el estado del despliegue en **Settings → Pages**
- 🐛 Si hay errores, revisa los logs en GitHub Pages

## 🔄 Para Actualizar el Juego

Solo necesitas:

```bash
cd docs
./prepare.sh
cd ..
git add docs/
git commit -m "Actualizar juego"
git push origin main
```

¡Y GitHub Pages se actualizará automáticamente!

## 📚 Más Ayuda

- Guía detallada: `docs/DEPLOY.md`
- Documentación: `docs/README.md`
