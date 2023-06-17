fetch('http://localhost:5000/api/user')
  .then(response => response.json())
  .then(data => {
    if (data.roles.includes('usuario')) {
      // El usuario tiene el rol de "usuario"
      const registroLink = document.querySelector('a[href="Registro.html"]');
      const iniciarSesionLink = document.querySelector('a[href="IniciarSesion.html"]');
      registroLink.style.display = 'none';
      iniciarSesionLink.style.display = 'none';
    }
  })
  .catch(error => console.error(error));