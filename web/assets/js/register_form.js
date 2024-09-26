const div_form = document.createElement('div');
//Cuadro blanco del registro y login
div_form.style.width = '1130px';
div_form.style.height = '450px';
div_form.style.position = 'fixed';
div_form.style.left = '595px';
div_form.style.top = '220px';
div_form.style.transform = 'translateX(-20%)'; 
div_form.style.backgroundColor = 'White';
div_form.style.zIndex = '5';

document.getElementById('form-container').appendChild(div_form);

//Input Nombre

const div_input_nombre = document.createElement('div');
const input_nombre = document.createElement('input');
const label_nombre = document.createElement('label');

div_input_nombre.style.width = '1020px';
div_input_nombre.style.height = '50px';
div_input_nombre.className = 'input-group';
div_form.appendChild(div_input_nombre)

input_nombre.style.width = '1020px';
input_nombre.style.height = '50px';
input_nombre.className = 'input-group';
div_input_nombre.style.position = 'absolute';
div_input_nombre.style.left = '40px';
div_input_nombre.style.top = '50px';

input_nombre.style.zIndex = '6';
label_nombre.textContent = 'Nombre';
label_nombre.style.fontFamily = 'Lato, sans-serif';
label_nombre.className = 'input-group';
label_nombre.style.zIndex = '7';

div_input_nombre.appendChild(input_nombre);
div_input_nombre.appendChild(label_nombre);

// Input Correo
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
div_input_correo.style.top = '130px';

input_correo.style.zIndex = '6';
label_correo.textContent = 'Correo';
label_correo.style.fontFamily = 'Lato, sans-serif';
label_correo.className = 'input-group';
label_correo.style.zIndex = '7';

div_input_correo.appendChild(input_correo);
div_input_correo.appendChild(label_correo);

//Input telefono
const div_input_phone = document.createElement('div');
const input_phone = document.createElement('input');
const label_phone = document.createElement('label');

div_input_phone.style.width = '1020px';
div_input_phone.style.height = '50px';
div_input_phone.className = 'input-group';
div_form.appendChild(div_input_phone)

input_phone.style.width = '1020px';
input_phone.style.height = '50px';
input_phone.className = 'input-group';
div_input_phone.style.position = 'absolute';
div_input_phone.style.left = '40px';
div_input_phone.style.top = '210px';

input_phone.style.zIndex = '6';
label_phone.textContent = 'Teléfono';
label_phone.style.fontFamily = 'Lato, sans-serif';
label_phone.className = 'input-group';
label_phone.style.zIndex = '7';

div_input_phone.appendChild(input_phone);
div_input_phone.appendChild(label_phone);

//Input contraseña

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
div_input_contrasena.style.top = '290px';

input_contrasena.style.zIndex = '6';
label_contrasena.textContent = 'Contraseña';
label_contrasena.style.fontFamily = 'Lato, sans-serif';
label_contrasena.className = 'input-group';
label_contrasena.style.zIndex = '7';

div_input_contrasena.appendChild(input_contrasena);
div_input_contrasena.appendChild(label_contrasena);

//Boton registrate
const div_buttonregister = document.createElement('div');
const buttonregister = document.createElement('button');
div_buttonregister.className = 'login-button';
buttonregister.className = 'login-button';

div_buttonregister.style.width = '350px';
div_buttonregister.style.height = '50px';
div_buttonregister.style.left = '400px';
div_buttonregister.style.top = '370px';

div_buttonregister.style.justifyContent = 'center';
div_buttonregister.style.alignItems = 'center';

buttonregister.style.width = '350px';
buttonregister.style.height = '50px';
buttonregister.textContent = 'Regístrate'
buttonregister.addEventListener('click', function(){
    window.location.href = 'send_code.html';
});

div_form.appendChild(div_buttonregister);
div_buttonregister.appendChild(buttonregister);