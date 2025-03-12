$(document).ready(function() {

	// demo css style
	let title = $('.title');
	title.css('text-decoration', 'underline'); // setter

	let lorem1 = $('#lorem1');
	let lorem2 = $('#lorem2');

	let lr1Style = {
		color: 'red',
		fontSize: '22px',
		textTransform: 'capitalize'
	};

	lorem1.css(lr1Style); // setter

	lr1TextForm = lorem1.css('text-transform'); // getter
	lorem2.css('text-transform', lr1TextForm);


	// demo toggle function
	let toggler = $('.toggler');
	toggler.on('click', function() {
		$('.block').toggleClass('invisible');
	})

	// demo attribute modification
	$('.btn-change-image').on('click', function() {
		let img1Path = $('.img1').attr('src');
		let img2Path = $('.img2').attr('src');

		$('.img1').attr('src', img2Path);
		$('.img2').attr('src', img1Path);
	})

	// demo file chooser
	let fileChooser = $('.avatar-fc');
	fileChooser.on('change', function() {
		let selectedFile = this.files[0];
		console.log('selected files ' + selectedFile);

		// read file, load file data to web browser
		let fr = new FileReader();
		if (selectedFile) {
			fr.readAsDataURL(selectedFile);
		}

		fr.onload = function(e) {
			$('.avatar').attr('src', e.target.result);
		}
	});

	$('.btn-upload').on('click', function(e) {
		// e.preventDefault(); type="button" action="javascript:void(0)"
		e.preventDefault();
		fileChooser.click();
	})

});