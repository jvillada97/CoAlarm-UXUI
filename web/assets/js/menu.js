const h1 = document.createElement('h1');
h1.textContent = 'Bienvenido a CoAlarm';
h1.style.fontSize = '30px';
h1.style.position = 'absolute';
h1.style.left = '850px';
h1.style.top = '120px';
h1.style.fontFamily = 'Lato, sans-serif';
h1.style.color = 'Black';

document.getElementById('form-container').appendChild(h1);



const icon_your_groups = document.createElement('img');
icon_your_groups.src = '../assets/images/your_groups_icon.png';
icon_your_groups.alt = 'Tus grupos';
icon_your_groups.id = 'your-groups-icon';
icon_your_groups.addEventListener('click', function(){
    window.location.href = 'list_groups.html'
})
const title_groups_icon = document.createElement('a');
title_groups_icon.className = 'icon-titles';
title_groups_icon.textContent = 'Tus grupos';
title_groups_icon.style.position = 'absolute';
title_groups_icon.style.left = '585px';
title_groups_icon.style.top = '450px';
title_groups_icon.href = 'list_groups.html'

document.getElementById('form-container').appendChild(icon_your_groups);
document.getElementById('form-container').appendChild(title_groups_icon);

//Icono agregar amigos

const icon_add_friends = document.createElement('img');
icon_add_friends.src = '../assets/images/add_friends_icon.png';
icon_add_friends.alt = 'Añadir amigos';
icon_add_friends.id = 'add-friends-icon';

const title_add_friends_icon = document.createElement('a');
title_add_friends_icon.className = 'icon-titles';
title_add_friends_icon.textContent = 'Añadir amigos';
title_add_friends_icon.style.position = 'absolute';
title_add_friends_icon.style.left = '1270px';
title_add_friends_icon.style.top = '450px';

document.getElementById('form-container').appendChild(icon_add_friends);
document.getElementById('form-container').appendChild(title_add_friends_icon);

//Icono listar alarmas

const icon_list_alarms = document.createElement('img');
icon_list_alarms.src = '../assets/images/your_alarms_icon.png';
icon_list_alarms.alt = 'Tus alarmas';
icon_list_alarms.id = 'your-alarms-icon';

const title_your_alarms_icon = document.createElement('a');
title_your_alarms_icon.className = 'icon-titles';
title_your_alarms_icon.textContent = 'Tus alarmas';
title_your_alarms_icon.style.position = 'absolute';
title_your_alarms_icon.style.left = '920px';
title_your_alarms_icon.style.top = '750px';

document.getElementById('form-container').appendChild(icon_list_alarms);
document.getElementById('form-container').appendChild(title_your_alarms_icon);

