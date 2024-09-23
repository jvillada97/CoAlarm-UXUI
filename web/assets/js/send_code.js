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
const div_text_code = document.createElement('div');
const h2_code = document.createElement('h2');
div_text_code.style.width = '500px';
div_text_code.style.height = '50px';
div_text_code.style.position = 'absolute';
div_text_code.style.left = '315px';
div_text_code.style.top = '50px';
h2_code.textContent = 'Te hemos enviado un código de verificación a tu correo electrónico';
h2_code.style.fontSize = '30px';
h2_code.style.fontFamily = 'Lato, sans-serif';
h2_code.style.color = 'Black';
h2_code.style.zIndex = '6';
div_form.appendChild(div_text_code);
div_text_code.appendChild(h2_code);

//Input texts codigos

const div_input_code = document.createElement('div');
div_input_code.style.width = '500px';
div_input_code.style.height = '50px';
div_input_code.style.position = 'absolute';
div_input_code.style.left = '315px';
div_input_code.style.top = '180px';
div_input_code.style.display = 'flex';
div_input_code.style.justifyContent = 'space-between';

for (let i = 0; i < 6; i++) {
    const input_code = document.createElement('input');
    input_code.type = 'text';
    input_code.maxLength = '1';
    input_code.style.width = '50px';
    input_code.style.height = '50px';
    input_code.style.fontSize = '30px';
    input_code.style.textAlign = 'center';
    input_code.style.border = 'none'; 
    input_code.style.borderBottom = '2px solid #000'; 
    input_code.style.marginRight = '10px';
    input_code.style.fontFamily = 'Lato, sans-serif';
    input_code.style.color = 'Black';
    input_code.style.zIndex = '6';
    div_input_code.appendChild(input_code);
}

div_form.appendChild(div_input_code)

//Boton confirmar codigo
const div_button_confirm_code = document.createElement('div');
const button_confirm_code = document.createElement('button');
div_button_confirm_code.className = 'login-button';
button_confirm_code.className = 'login-button';

div_button_confirm_code.style.width = '350px';
div_button_confirm_code.style.height = '50px';
div_button_confirm_code.style.left = '390px';
div_button_confirm_code.style.top = '290px';

div_button_confirm_code.style.justifyContent = 'center';
div_button_confirm_code.style.alignItems = 'center';

button_confirm_code.style.width = '350px';
button_confirm_code.style.height = '50px';
button_confirm_code.textContent = 'Confirmar código'
button_confirm_code.addEventListener('click', function(){
    window.location.href = 'web_verification.html';
});

div_form.appendChild(div_button_confirm_code);
div_button_confirm_code.appendChild(button_confirm_code);

//Hipervinculo reenviar codigo

const hiperlink_resend_code = document.createElement('a');


hiperlink_resend_code.className = 'hiperlink-register';
div_form.appendChild(hiperlink_resend_code);

hiperlink_resend_code.style.left = '525px';
hiperlink_resend_code.style.top = '340px';
hiperlink_resend_code.textContent = 'Reenviar código';
hiperlink_resend_code.style.fontFamily = 'Lato, sans-serif';
hiperlink_resend_code.href = 'send_code.html';

