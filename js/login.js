

window.onload = () => {

    const form = document.querySelector('#form');
    form.addEventListener('submit', function (event) {
        event.preventDefault();

        const email = document.querySelector('#email').value;
        const password = document.querySelector('#password').value;

        const requestBody = {
            email: email,
            password: password
        };

        fetch('http://localhost:5000/api/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(requestBody)
        })
            .then(response => {
                if (response.ok) {
                    // El inicio de sesión fue exitoso
                    console.log("Inicio de sesion exitoso")
                    alert("Inicio de sesion exitoso")
                    const user = {
                        email: email,
                        role: 'usuario' // Aquí deberías obtener el rol del usuario desde el backend
                    };
                    
                    localStorage.setItem('user', JSON.stringify(user));
                    window.location.href = "index.html";
                } else {
                    // Las credenciales son incorrectas
                    alert("Credenciales inválidas");
                }
            })
            .catch(error => console.error(error));
    });
}







/*window.onload = uri => {
    const form = document.querySelector(".mainform");
    form.addEventListener("submit", (event) => {
        event.preventDefault(); // evitar la recarga de la página
  
        const formData = new FormData(form);
        const json = {};
  
        for (const [key, value] of formData.entries()) {
            json[key] = value;
        }
  
        console.log(JSON.stringify(json));
  
        fetch('http://localhost:5000/api/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(json)
        })
            .then(response => {
                if (response.ok) {
                    alert("Inicio de sesión exitoso");
                    // redirigir a la página de inicio de la aplicación
                    window.location.href = "index.html";
                } else {
                    alert("Credenciales inválidas");
                }
            })
            .catch(error => console.error(error));
    });
  };


































/*window.onload = () => {
    const form = document.getElementById("form");
    form.addEventListener("submit", (event) => {
        event.preventDefault();

        const email = document.getElementsByName('email')[0].value;
        const password = document.getElementsByName('password')[0].value;

        const requestBody = {
            email: email,
            password: password
        };

        fetch('http://localhost:5000/api/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(requestBody)
        })
        .then(response => {
            if (response.ok) {
                // Si la respuesta es exitosa, redireccionar a la página de inicio
                window.location.href = 'index.html';
            } else {
                // Si la respuesta no es exitosa, mostrar un mensaje de error
                throw new Error('Email Incorrecto o contraseña');
            }
        })
        .catch(error => {
            console.error(error);
            alert('Credenciales inválidas');
        });
    });
};*/