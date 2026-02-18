#!/bin/bash
# Script para subir la carpeta web/ a GitHub AHORA

set -e  # Salir si hay error

echo "🚀 Subiendo carpeta web/ a GitHub"
echo "==================================="
echo ""

# Verificar que estamos en el directorio correcto
if [ ! -d "web" ]; then
    echo "❌ Error: No se encontró la carpeta web/"
    exit 1
fi

# Asegurar que el JAR existe
if [ ! -f "web/lib/linea.jar" ]; then
    echo "📦 Copiando JAR..."
    if [ -f "linea.jar" ]; then
        mkdir -p web/lib
        cp linea.jar web/lib/
        echo "✅ JAR copiado"
    else
        echo "⚠️  Advertencia: linea.jar no encontrado"
    fi
fi

# Agregar TODOS los archivos de web/
echo ""
echo "➕ Agregando todos los archivos de web/ a git..."
git add -A web/

# Agregar .gitignore si tiene cambios
git add .gitignore 2>/dev/null || true

# Ver estado
echo ""
echo "📋 Estado de los archivos:"
git status --short | grep -E "web/|\.gitignore" | head -10

# Hacer commit si hay cambios
echo ""
if git diff --staged --quiet; then
    echo "⚠️  No hay cambios nuevos para commitear"
    echo "   Verificando si necesitas hacer push..."
    
    # Verificar si hay commits sin push
    if git log origin/main..HEAD --oneline 2>/dev/null | grep -q .; then
        echo "✅ Hay commits sin hacer push, continuando..."
        PUSH_ONLY=true
    else
        echo "✅ Todo está al día"
        exit 0
    fi
else
    echo "💾 Haciendo commit de los cambios..."
    git commit -m "Agregar/sincronizar archivos web para GitHub Pages"
    PUSH_ONLY=false
fi

# Hacer push
echo ""
echo "📡 Haciendo push a GitHub..."
if [ "$PUSH_ONLY" = "true" ]; then
    git push origin main
else
    git push origin main
fi

echo ""
echo "✅ ¡Push completado!"
echo ""
echo "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"
echo ""
echo "📝 AHORA HAZ ESTO EN GITHUB:"
echo ""
echo "   1. Ve a: https://github.com/k-delta/CUATRO-EN-LINEA/settings/pages"
echo ""
echo "   2. REFRESCA la página (F5 o Ctrl+R)"
echo ""
echo "   3. En 'Build and deployment' → 'Folder':"
echo "      - Deberías ver la opción '/web' disponible ahora"
echo "      - Si no aparece, espera 30 segundos y refresca de nuevo"
echo ""
echo "   4. Selecciona '/web' y haz clic en 'Save'"
echo ""
echo "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"
echo ""
echo "🌐 Después de guardar, tu juego estará en:"
echo "   https://k-delta.github.io/CUATRO-EN-LINEA/"
echo ""
echo "   (Puede tardar 2-5 minutos en estar disponible)"
echo ""

