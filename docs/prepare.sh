#!/bin/bash
# Script de preparación para el despliegue web del juego Cuatro en Línea

echo "=== Preparando despliegue web de Cuatro en Línea ==="

# Verificar que el JAR existe
if [ ! -f "../linea.jar" ]; then
    echo "Error: No se encontró linea.jar en el directorio raíz"
    echo "Por favor, compila el proyecto primero."
    exit 1
fi

# Crear directorios si no existen
mkdir -p lib images

# Copiar el JAR
echo "Copiando JAR..."
cp ../linea.jar lib/

# Copiar imágenes
echo "Copiando imágenes..."
if [ -d "../src/images" ]; then
    cp -r ../src/images/* images/
    echo "Imágenes copiadas desde src/images/"
elif [ -d "../bin/images" ]; then
    cp -r ../bin/images/* images/
    echo "Imágenes copiadas desde bin/images/"
else
    echo "Advertencia: No se encontró el directorio de imágenes"
fi

# Verificar estructura
echo ""
echo "=== Verificación de estructura ==="
echo "Archivos en lib/:"
ls -lh lib/ 2>/dev/null || echo "  (vacío)"
echo ""
echo "Archivos en images/:"
ls -lh images/ 2>/dev/null | head -5
echo "  ..."
echo ""
echo "✅ Preparación completada!"
echo ""
echo "Para probar localmente, puedes usar:"
echo "  python3 -m http.server 8000"
echo "  o"
echo "  npx http-server -p 8000"
echo ""
echo "Luego abre: http://localhost:8000"
