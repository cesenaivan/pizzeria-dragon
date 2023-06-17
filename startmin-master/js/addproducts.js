// Selecciona el formulario y agrega un evento para escuchar la acción submit
const form = document.querySelector('#formulario');
form.addEventListener('submit', function(event) {
  event.preventDefault(); // Evita que el formulario se envíe automáticamente

  // Obtiene los valores de los campos de entrada
  const categoria = document.querySelector('#categoria').value;
  const descripcion = document.querySelector('#descripcion').value;
  const nombre = document.querySelector('#nombre').value;
  const precio = document.querySelector('#precio').value;
  const imagen = document.querySelector('#imagen').files[0];

  // Crea un objeto FormData para enviar los datos del formulario en un formato adecuado
  const formData = new FormData();
  formData.append('categoria', categoria);
  formData.append('descripcion', descripcion);
  formData.append('nombre', nombre);
  formData.append('precio', precio);
  formData.append('imagen', imagen);

  // Realiza una llamada AJAX utilizando fetch
  fetch('http://localhost:5000/api/Producto', {
    method: 'POST',
    body: formData
  })
    .then(response => response.json())
    .then(data => {
      console.log('Producto registrado exitosamente');
      // Aquí puedes agregar código para mostrar un mensaje de éxito o redirigir al usuario a otra página
    })
    .catch(error => {
      console.error('Ocurrió un error al registrar el producto:', error);
      // Aquí puedes agregar código para mostrar un mensaje de error al usuario
    });
});