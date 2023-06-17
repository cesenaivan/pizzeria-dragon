/*window.onload = () => {
    const form = document.querySelector('form');

    form.addEventListener('submit', async (event) => {
      event.preventDefault();

      const formData = new FormData(form);
      const data = Object.fromEntries(formData.entries());

      try {
        const response = await fetch('http://localhost:5000/api/login', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(data)
        });

        if (response.ok) {
          // El inicio de sesión fue exitoso, redirigir al usuario a su perfil
          window.location.href = 'http://127.0.0.1:5500/Frontend/index.html';
          alert('Inicio de sesión correcto')
        } else {
          // El inicio de sesión falló, mostrar un mensaje de error al usuario
          const error = await response.json();
          alert(error.message);
        }
      } catch (error) {
        console.error(error);
        alert('Ocurrió un error al iniciar sesión, inténtalo de nuevo más tarde');
      }
    });
  };*/