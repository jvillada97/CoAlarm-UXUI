const div = document.createElement('div');
div.style.width = '1130px';
div.style.height = '120px';
div.style.position = 'fixed';
div.style.left = '395px';
div.style.top = '100px';
div.style.transform = 'translateX(-20%)'; 
div.style.display = 'flex';
div.style.justifyContent = 'center';
div.style.alignItems = 'center';
div.style.backgroundColor = '#8338EC'; 
const h1 = document.createElement('h1');
h1.textContent = 'CoAlarm';
h1.style.fontSize = '70px';
h1.style.fontFamily = 'Lato, sans-serif';
h1.style.color = 'White';
div.appendChild(h1);


document.getElementById('title-container').appendChild(div);
//document.getElementsByTagName('body').appendChild(div)