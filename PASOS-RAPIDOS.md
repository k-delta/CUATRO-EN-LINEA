# ⚡ Pasos Rápidos para Desplegar

## 🎯 Solución al Error Actual

Si estás viendo el error "Get Pages site failed", sigue estos pasos:

### 1️⃣ Habilitar GitHub Pages (OBLIGATORIO)

**Ve a GitHub y haz esto PRIMERO:**

1. Abre: https://github.com/k-delta/CUATRO-EN-LINEA/settings/pages
2. En "Build and deployment":
   - Source: **"Deploy from a branch"**
   - Branch: **`main`**
   - Folder: **`/docs`** ⚠️
3. Click **"Save"**
4. Espera 1-2 minutos

### 2️⃣ Hacer Push de los Archivos

```bash
# Asegúrate de estar en la raíz del proyecto
cd /home/kt6delta/Desktop/Codes/CUATRO-EN-LINEA

# Preparar archivos
cd docs && ./prepare.sh && cd ..

# Agregar a git
git add docs/
git add .gitignore
git add .github/

# Commit y push
git commit -m "Agregar despliegue web"
git push origin main
```

### 3️⃣ Esperar y Verificar

- Espera 2-5 minutos
- Ve a: https://k-delta.github.io/CUATRO-EN-LINEA/
- Si ves 404, espera 5 minutos más y recarga

## ✅ Listo!

Tu juego estará disponible en:
**https://k-delta.github.io/CUATRO-EN-LINEA/**

## 🐛 Si Sigue Fallando

Lee: `SOLUCION-ERROR.md`

