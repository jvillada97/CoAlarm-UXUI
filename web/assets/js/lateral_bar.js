const div_lateral_bar = document.createElement('div');
div_lateral_bar.className = 'lateral-bar'

//Imagen 1

const image_groups_lateral = document.createElement('img');
image_groups_lateral.src = '../assets/images/groups_lateral.png';
image_groups_lateral.alt = 'Tus grupos';
image_groups_lateral.id = 'your-groups-img';
image_groups_lateral.addEventListener('click', function(){
    window.location.href = 'list_groups.html';
})

const title_groups_lateral = document.createElement('a');
title_groups_lateral.className = 'lateral-bar-titles';
title_groups_lateral.textContent = 'Tus grupos';
title_groups_lateral.style.position = 'absolute';
title_groups_lateral.style.left = '28px';
title_groups_lateral.style.top = '345px';
title_groups_lateral.href = 'list_groups.html';


div_lateral_bar.appendChild(image_groups_lateral);
div_lateral_bar.appendChild(title_groups_lateral);

//Imagen 2

const image_add_friends = document.createElement('img');
image_add_friends.src = '../assets/images/add_friends_lateral.png';
image_add_friends.alt = 'Tus grupos';
image_add_friends.id = 'add-friends-img';

const title_add_friends = document.createElement('a');
title_add_friends.className = 'lateral-bar-titles';
title_add_friends.textContent = 'Añadir amigos';
title_add_friends.style.position = 'absolute';
title_add_friends.style.left = '17px';
title_add_friends.style.top = '512px';
div_lateral_bar.appendChild(title_add_friends);
div_lateral_bar.appendChild(image_add_friends);

//imagen 3

const image_your_alarms = document.createElement('img');
image_your_alarms.src = '../assets/images/notifications_lateral.png';
image_your_alarms.alt = 'Tus alarmas';
image_your_alarms.id = 'your-alarms-img';
const title_your_alarms = document.createElement('a');
title_your_alarms.className = 'lateral-bar-titles';
title_your_alarms.textContent = 'Tus alarmas';
title_your_alarms.style.position = 'absolute';
title_your_alarms.style.left = '23px';
title_your_alarms.style.top = '675px';
div_lateral_bar.appendChild(title_your_alarms);
div_lateral_bar.appendChild(image_your_alarms);

document.getElementById('bar-container').appendChild(div_lateral_bar);