// Obtener el usuario almacenado en el localStorage
const user = JSON.parse(localStorage.getItem('user'));

// Verificar si el rol del usuario es "usuario"
if (user && user.role === 'usuario') {

  // Obtener todos los elementos con la clase "oculto"
  const elementosOcultos = document.querySelectorAll('.oculto');


  // Ocultar cada elemento encontrado
  elementosOcultos.forEach(elemento => {
    elemento.classList.add('d-none'); // Agregar la clase "d-none" de Bootstrap para ocultar el elemento
  });


// Obtener el usuario almacenado en el localStorage
const user = JSON.parse(localStorage.getItem('user'));

// Verificar si el rol del usuario es "usuario"
if (user && user.role === 'usuario') {

  // Obtener todos los elementos con la clase "oculto2"
  const elementosOcultos2 = document.querySelectorAll('.oculto2');

  // Mostrar cada elemento encontrado
  elementosOcultos2.forEach(elemento => {
    elemento.classList.remove('d-none'); // Eliminar la clase "d-none" de Bootstrap para mostrar el elemento
  });
}
  
 
}