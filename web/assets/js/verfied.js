const div_form = document.createElement('div');
//Cuadro blanco del registro y login
div_form.style.width = '1130px';
div_form.style.height = '450px';
div_form.style.position = 'fixed';
div_form.style.left = '395px';
div_form.style.top = '220px';
div_form.style.transform = 'translateX(-20%)'; 
div_form.style.backgroundColor = 'White';
div_form.style.zIndex = '5';

document.getElementById('form-container').appendChild(div_form);

//Texto principal envio de codigo
const div_text_verified = document.createElement('div');
const h2_code = document.createElement('h2');
div_text_verified.style.width = '800px';
div_text_verified.style.height = '50px';
div_text_verified.style.position = 'absolute';
div_text_verified.style.left = '175px';
div_text_verified.style.top = '80px';
h2_code.textContent = '¡Hemos verificado correctamente tu correo electrónico!';
h2_code.style.fontSize = '30px';
h2_code.style.fontFamily = 'Lato, sans-serif';
h2_code.style.color = 'Black';
h2_code.style.zIndex = '6';
div_form.appendChild(div_text_verified);
div_text_verified.appendChild(h2_code);

//Boton ir a pagina principal
const div_button_goto_menu = document.createElement('div');
const button_goto_menu = document.createElement('button');
div_button_goto_menu.className = 'login-button';
button_goto_menu.className = 'login-button';

div_button_goto_menu.style.width = '350px';
div_button_goto_menu.style.height = '50px';
div_button_goto_menu.style.left = '390px';
div_button_goto_menu.style.top = '225px';

div_button_goto_menu.style.justifyContent = 'center';
div_button_goto_menu.style.alignItems = 'center';

button_goto_menu.style.width = '350px';
button_goto_menu.style.height = '50px';
button_goto_menu.textContent = 'Ir a la página principal'
button_goto_menu.addEventListener('click', function(){
    window.location.href = 'web_verification.html';
});

div_form.appendChild(div_button_goto_menu);
div_button_goto_menu.appendChild(button_goto_menu);
