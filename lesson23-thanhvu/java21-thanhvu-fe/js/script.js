let currentIndex = 0;
showTestimonial(currentIndex);

function currentTestimonial(n) {
  showTestimonial((currentIndex = n - 1));
}

function showTestimonial(n) {
  const testimonials = document.getElementsByClassName("testimonial");
  const dots = document.getElementsByClassName("dot");
  if (n >= testimonials.length) currentIndex = 0;
  if (n < 0) currentIndex = testimonials.length - 1;

  for (let i = 0; i < testimonials.length; i++) {
    testimonials[i].style.display = "none";
    dots[i].className = dots[i].className.replace(" active", "");
  }

  testimonials[currentIndex].style.display = "block";
  dots[currentIndex].className += " active";
}

setInterval(() => {
  currentTestimonial(currentIndex + 2);
}, 5000);