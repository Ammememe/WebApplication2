function toggleMenu() {
    const menu = document.querySelector(".menu-links");
    const icon = document.querySelector(".hamburger-icon");
    menu.classList.toggle("open");
    icon.classList.toggle("open");
}


// Javascript jobbar Client-side, jobbar med Java som är server sided.
fetch('/getDownloadCount')
    .then(response => response.json())
    .then(data => {
        const downloadCountElement = document.getElementById('download-count');
        if (downloadCountElement) {
            downloadCountElement.textContent = data;
        }
    })
    .catch(error => {
        console.error('Error fetching download count:', error);
    });
