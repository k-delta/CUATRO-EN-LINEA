#!/bin/bash
# Script para desplegar el juego web a GitHub Pages

echo "🚀 Despliegue de Cuatro en Línea a GitHub Pages"
echo "================================================"
echo ""

# Verificar que estamos en el directorio correcto
if [ ! -f "linea.jar" ]; then
    echo "❌ Error: No se encontró linea.jar"
    echo "   Por favor ejecuta este script desde la raíz del proyecto"
    exit 1
fi

# Preparar archivos web
echo "📦 Preparando archivos web..."
cd web
./prepare.sh
cd ..

echo ""
echo "📋 Archivos listos para commit:"
git status --short web/ .gitignore .github/ 2>/dev/null | head -10

echo ""
read -p "¿Continuar con el commit y push? (s/n): " -n 1 -r
echo ""

if [[ ! $REPLY =~ ^[SsYy]$ ]]; then
    echo "❌ Cancelado"
    exit 1
fi

# Agregar archivos
echo ""
echo "➕ Agregando archivos a git..."
git add web/
git add .gitignore
git add .github/workflows/deploy-pages.yml 2>/dev/null

# Verificar que hay cambios
if git diff --staged --quiet; then
    echo "⚠️  No hay cambios para commitear"
    exit 0
fi

# Hacer commit
echo ""
echo "💾 Haciendo commit..."
git commit -m "Agregar despliegue web con CheerpJ para GitHub Pages"

# Hacer push
echo ""
echo "📡 Haciendo push a GitHub..."
git push origin main

echo ""
echo "✅ ¡Push completado!"
echo ""
echo "📝 Próximos pasos:"
echo "   1. Ve a: https://github.com/k-delta/CUATRO-EN-LINEA/settings/pages"
echo "   2. En 'Source', selecciona:"
echo "      - Branch: main"
echo "      - Folder: /web"
echo "   3. Guarda los cambios"
echo ""
echo "🌐 Tu juego estará disponible en:"
echo "   https://k-delta.github.io/CUATRO-EN-LINEA/"
echo ""
echo "   (Puede tomar 5-10 minutos para el primer despliegue)"
