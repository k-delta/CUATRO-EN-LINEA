#!/bin/bash
# Script para preparar y subir los archivos web a GitHub

echo "🚀 Preparando archivos para GitHub Pages"
echo "=========================================="
echo ""

# 1. Preparar archivos web
echo "📦 Paso 1: Preparando archivos web..."
cd web
./prepare.sh
cd ..

# 2. Verificar que el JAR existe
if [ ! -f "web/lib/linea.jar" ]; then
    echo "❌ Error: web/lib/linea.jar no existe"
    echo "   Copiando desde linea.jar..."
    if [ -f "linea.jar" ]; then
        mkdir -p web/lib
        cp linea.jar web/lib/
        echo "✅ JAR copiado"
    else
        echo "❌ Error: linea.jar no encontrado en la raíz"
        exit 1
    fi
fi

# 3. Agregar TODOS los archivos de web/ a git
echo ""
echo "➕ Paso 2: Agregando archivos a git..."
git add web/

# 4. Agregar otros archivos necesarios
git add .gitignore
git add .github/ 2>/dev/null

# 5. Verificar qué se va a commitear
echo ""
echo "📋 Archivos listos para commit:"
git status --short | grep -E "^A|^??" | head -15

# 6. Hacer commit
echo ""
echo "💾 Paso 3: Haciendo commit..."
git commit -m "Agregar despliegue web completo para GitHub Pages" || {
    echo "⚠️  No hay cambios nuevos para commitear"
}

# 7. Hacer push
echo ""
echo "📡 Paso 4: Haciendo push a GitHub..."
git push origin main

echo ""
echo "✅ ¡Completado!"
echo ""
echo "📝 AHORA puedes:"
echo "   1. Ve a: https://github.com/k-delta/CUATRO-EN-LINEA/settings/pages"
echo "   2. Refresca la página"
echo "   3. En 'Folder', ahora deberías ver la opción '/web'"
echo "   4. Selecciona '/web' y haz clic en 'Save'"
echo ""
echo "🌐 Tu juego estará en: https://k-delta.github.io/CUATRO-EN-LINEA/"

