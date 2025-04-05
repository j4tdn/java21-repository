
const searchInput = document.getElementById('search-input');
const searchButton = document.getElementById('search-button');
const productGrids = document.querySelectorAll('.product-grid');
const sectionTitles = document.querySelectorAll('.section-title');
const mainImage = document.querySelector('.main-image img');


searchButton.addEventListener('click', searchProducts);

sectionTitles.forEach(title => {
  title.addEventListener('click', updateMainImage);
});

function searchProducts() {
  const searchTerm = searchInput.value.toLowerCase();

  productGrids.forEach(grid => {
    grid.style.display = 'none';
  });


  productGrids.forEach(grid => {
    const products = grid.querySelectorAll('.product-card');
    products.forEach(product => {
      const productName = product.querySelector('h3').textContent.toLowerCase();
      if (productName.includes(searchTerm)) {
        product.style.display = 'block';
        grid.style.display = 'grid';
      }
    });
  });
}

function updateMainImage(event) {
  const imageUrl = event.target.dataset.image;
  mainImage.src = imageUrl;
}


document.addEventListener('DOMContentLoaded', () => {

  const bestSellingProducts = [
    { src: 'image/image1.jpg', alt: 'Sản phẩm 1', name: 'Sản phẩm 1' },
    { src: 'image/image2.jpg', alt: 'Sản phẩm 2', name: 'Sản phẩm 2' },
    { src: 'image/image3.jpg', alt: 'Sản phẩm 3', name: 'Sản phẩm 3' },
    { src: 'image/image4.jpg', alt: 'Sản phẩm 4', name: 'Sản phẩm 4' }
  ];

  const newProducts = [
    { src: 'image/image5.jpg', alt: 'Sản phẩm 5', name: 'Sản phẩm 5' },
    { src: 'image/image6.jpg', alt: 'Sản phẩm 6', name: 'Sản phẩm 6' },
    { src: 'image/image7.jpg', alt: 'Sản phẩm 7', name: 'Sản phẩm 7' },
    { src: 'image/image8.jpg', alt: 'Sản phẩm 8', name: 'Sản phẩm 8' }
  ];

  const promotionProducts = [
    { src: 'image/image9.jpg', alt: 'Sản phẩm 9', name: 'Sản phẩm 9' },
    { src: 'image/image10.jpg', alt: 'Sản phẩm 10', name: 'Sản phẩm 10' },
    { src: 'image/image11.jpg', alt: 'Sản phẩm 11', name: 'Sản phẩm 11' },
    { src: 'image/image12.jpg', alt: 'Sản phẩm 12', name: 'Sản phẩm 12' }
  ];


  function displayProducts(products, containerId) {
    const container = document.getElementById(containerId);
    container.innerHTML = '';

    products.forEach(product => {
     
    });
  }

  function updateMainImage(imageUrl) {
    const mainImage = document.getElementById('main-image');
    mainImage.innerHTML = `<img src="${imageUrl}" alt="Sản phẩm" class="gallery-image">`;
  }

  displayProducts(bestSellingProducts, 'best-selling-products');


  const sectionTitles = document.querySelectorAll('.section-title');
  sectionTitles.forEach((title, index) => {
    title.addEventListener('click', () => {
      switch (index) {
        case 0:
          displayProducts(bestSellingProducts, 'best-selling-products');
          updateMainImage('image/image1.jpg');
          break;
        case 1:
          displayProducts(newProducts, 'new-products');
          updateMainImage('image/image5.jpg');
          break;
        case 2:
          displayProducts(promotionProducts, 'promotion-products');
          updateMainImage('image/image9.jpg');
          break;
      }
    });
  });


  const searchInput = document.getElementById('search-input');
  const productList = document.querySelectorAll('.product');
  searchInput.addEventListener('input', () => {
  });
});
