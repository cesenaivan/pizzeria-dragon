// Contador de visitas
let visitas = parseInt(localStorage.getItem("visitas")) || 0;
visitas++;
localStorage.setItem("visitas", visitas);

// Enviar datos de visita al servidor
const url = 'http://localhost:5000/api/visitas';

const data = {
  fecha: new Date(),
  visitas: visitas
};

fetch(url, {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json'
  },
  body: JSON.stringify(data)
})
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error(error));