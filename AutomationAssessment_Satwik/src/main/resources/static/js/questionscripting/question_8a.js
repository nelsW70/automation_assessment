//ensures one checkbox is selected and displays snackbar if not
$(document).ready(function() {
	$("form").submit(function() {
		if ($('input:checkbox').filter(':checked').length < 1) {
			snackBar();
			return false;
		} else if ($('input:checkbox').filter(':checked').length >= 1) {
			snackBarThanks();
			$('.thanks-reveal').prop('disabled', true);
			$('#submit-a').hide();
			$('.pagination-text-one').hide();
		}
	});
});
function snackBar() {
	var x = document.getElementById("snackbar");
	x.className = "show";
	setTimeout(function() {
		x.className = x.className.replace("show", "");
	}, 5000);
}
function snackBarThanks() {
	var x = document.getElementById("snackbar-thanks");
	x.className = "show";
}
