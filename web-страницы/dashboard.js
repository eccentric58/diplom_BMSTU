// Предполагается, что у вас есть соответствующие эндпоинты API для загрузки данных каждого раздела.
document.querySelectorAll('.dashboard nav ul li a').forEach(item => {
    item.addEventListener('click', function(e) {
        e.preventDefault();
        const section = this.getAttribute('href').substring(1); // Убираем # из ID
        fetch(`/api/${section}`)
            .then(response => response.json())
            .then(data => {
                // Обновляем содержимое .content в соответствии с выбранным разделом
                document.querySelector('.content').innerHTML = `<h1>${data.title}</h1><p>${data.description}</p>`;
            })
            .catch(error => console.error('Ошибка:', error));
    });
});
