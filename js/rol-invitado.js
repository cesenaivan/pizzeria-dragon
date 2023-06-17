// Obtener todos los elementos con la clase "oculto2"
const elementosOcultos = document.querySelectorAll('.oculto2');

// Ocultar cada elemento encontrado
elementosOcultos.forEach(elemento => {
  elemento.classList.add('d-none'); // Agregar la clase "d-none" de Bootstrap para ocultar el elemento
});