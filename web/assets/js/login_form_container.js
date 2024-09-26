const div_form = document.createElement('div');
//Cuadro blanco del registro y login
div_form.style.width = '1130px';
div_form.style.height = '450px';
div_form.style.position = 'absolute';
div_form.style.left = '595px';
div_form.style.top = '220px';
div_form.style.transform = 'translateX(-20%)'; 
div_form.style.backgroundColor = 'White';
div_form.style.zIndex = '5';

//Titulo Iniciar sesion
const h2 = document.createElement('h2');
h2.textContent = 'Iniciar Sesión';
h2.style.fontSize = '30px';
h2.style.position = 'fixed';
h2.style.left = '60px';
h2.style.top = '20px';
h2.style.fontFamily = 'Lato, sans-serif';
h2.style.color = 'Black';
h2.style.zIndex = '6';
div_form.appendChild(h2);

//Input Correo
const div_input_correo = document.createElement('div');
const input_correo = document.createElement('input');
const label_correo = document.createElement('label');

div_input_correo.style.width = '1020px';
div_input_correo.style.height = '50px';
div_input_correo.className = 'input-group';
div_form.appendChild(div_input_correo)

input_correo.style.width = '1020px';
input_correo.style.height = '50px';
input_correo.className = 'input-group';
div_input_correo.style.position = 'absolute';
div_input_correo.style.left = '40px';
div_input_correo.style.top = '105px';

input_correo.style.zIndex = '6';
label_correo.textContent = 'Correo';
label_correo.style.fontFamily = 'Lato, sans-serif';
label_correo.className = 'input-group';
label_correo.style.zIndex = '7';

div_input_correo.appendChild(input_correo);
div_input_correo.appendChild(label_correo);

//Input Contraseña
const div_input_contrasena = document.createElement('div');
const input_contrasena = document.createElement('input');
const label_contrasena = document.createElement('label');

div_input_contrasena.style.width = '1020px';
div_input_contrasena.style.height = '50px';
div_input_contrasena.className = 'input-group';
div_form.appendChild(div_input_contrasena)

input_contrasena.style.width = '1020px';
input_contrasena.style.height = '50px';
input_contrasena.className = 'input-group';
div_input_contrasena.style.position = 'absolute';
div_input_contrasena.style.left = '40px';
div_input_contrasena.style.top = '205px';

input_contrasena.style.zIndex = '6';
label_contrasena.textContent = 'Contraseña';
label_contrasena.style.fontFamily = 'Lato, sans-serif';
label_contrasena.className = 'input-group';
label_contrasena.style.zIndex = '7';

div_input_contrasena.appendChild(input_contrasena);
div_input_contrasena.appendChild(label_contrasena);

//Boton registrarse
const div_button_login = document.createElement('div');
const button_login = document.createElement('button');
div_button_login.className = 'login-button';
button_login.className = 'login-button';

div_button_login.style.width = '350px';
div_button_login.style.height = '50px';
div_button_login.style.left = '400px';
div_button_login.style.top = '305px';

div_button_login.style.justifyContent = 'center';
div_button_login.style.alignItems = 'center';

button_login.style.width = '350px';
button_login.style.height = '50px';
button_login.textContent = 'Iniciar Sesión'
button_login.addEventListener('click', function(){
    window.location.href = 'templates/menu.html';
});

div_form.appendChild(div_button_login);
div_button_login.appendChild(button_login);

//Texto registro
//const div_text_register = document.createElement('div');
const text_register = document.createElement('h4');

//div_text_register.className = 'text-register';
text_register.className = 'text-register';


text_register.style.left = '470px';
text_register.style.top = '320px';

div_form.appendChild(text_register);

text_register.textContent = 'No tienes cuenta?';
text_register.style.fontFamily = 'Lato, sans-serif';
text_register.style.fontSize = '16px';



//Hipervinculo registro

const hiperlink_register = document.createElement('a');


hiperlink_register.className = 'hiperlink-register';
div_form.appendChild(hiperlink_register);

hiperlink_register.style.left = '613px';
hiperlink_register.style.top = '281px';
hiperlink_register.textContent = 'Regístrate';
hiperlink_register.style.fontFamily = 'Lato, sans-serif';
hiperlink_register.href = 'templates/register.html';

document.getElementById('form-container').appendChild(div_form);