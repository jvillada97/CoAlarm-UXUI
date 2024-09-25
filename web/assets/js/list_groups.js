
const titleSearchContainer = document.createElement('div');
titleSearchContainer.style.display = 'flex';
titleSearchContainer.style.alignItems = 'center';
titleSearchContainer.style.position = 'absolute';
titleSearchContainer.style.left = '350px'; 
titleSearchContainer.style.top = '120px';


const h1 = document.createElement('h1');
h1.textContent = 'Tus grupos';
h1.style.fontSize = '30px';
h1.style.fontFamily = 'Lato, sans-serif';
h1.style.marginRight = '300px'; 


const searchContainer = document.createElement('div');
searchContainer.style.display = 'flex';
searchContainer.style.alignItems = 'center';
searchContainer.style.border = '1.5px solid #000';
searchContainer.style.borderRadius = '5px';
searchContainer.style.padding = '5px';
searchContainer.style.backgroundColor = 'white';
searchContainer.style.width = '700px';
searchContainer.className = 'search-bar';

const searchInput = document.createElement('input');
searchInput.type = 'text';
searchInput.placeholder = 'Buscar grupo';
searchInput.style.border = 'none';
searchInput.style.outline = 'none';
searchInput.style.fontSize = '16px';
searchInput.style.fontFamily = 'Lato, sans-serif';
searchInput.style.flex = '1';


const loupeIcon = document.createElement('img');
loupeIcon.src = '../assets/images/search_icon.png'; 
loupeIcon.alt = 'Buscar';
loupeIcon.style.width = '20px';
loupeIcon.style.height = '20px';
loupeIcon.style.marginRight = '5px';


searchContainer.appendChild(loupeIcon);
searchContainer.appendChild(searchInput);


titleSearchContainer.appendChild(h1);
titleSearchContainer.appendChild(searchContainer);


document.getElementById('form-container').appendChild(titleSearchContainer);

const home_icon = document.createElement('img');
home_icon.src = '../assets/images/home_icon.png';
home_icon.style.position = 'absolute';
home_icon.style.top = '80px';
home_icon.style.left = '1600px';
home_icon.addEventListener('click', function(){
    window.location.href = 'menu.html';
})

document.getElementById('form-container').appendChild(home_icon);

//botones de grupos

const buttonContainer = document.createElement('div');
buttonContainer.style.display = 'flex';
buttonContainer.style.flexDirection = 'column'; 
buttonContainer.style.position = 'absolute';
buttonContainer.style.left = '350px';
buttonContainer.style.top = '250px';
buttonContainer.style.width = '500px'; 

function createButton(text) {
    const button = document.createElement('button');
    button.textContent = text;
    button.className = 'list-button';
    return button;
}


const button1 = createButton('Grupo 1');
const button2 = createButton('Grupo 2');
const button3 = createButton('Grupo 3');

buttonContainer.appendChild(button1);
buttonContainer.appendChild(button2);
buttonContainer.appendChild(button3);

//boton crear 
const add_group_icon = document.createElement('img');
add_group_icon.src = '../assets/images/create_group_icon.png';
add_group_icon.alt = 'Crear grupo';
add_group_icon.id = 'new-group-icon';
const title_add_group = document.createElement('h2');
//title_add_group.className = 'lateral-bar-titles';
title_add_group.textContent = 'Crear grupo';
title_add_group.style.position = 'absolute';
title_add_group.style.left = '1575px';
title_add_group.style.top = '740px';
title_add_group.style.fontFamily = 'Lato, sans-serif';
title_add_group.style.color = '#1D1B20' 

document.getElementById('form-container').appendChild(add_group_icon);
document.getElementById('form-container').appendChild(title_add_group);

document.getElementById('form-container').appendChild(buttonContainer);