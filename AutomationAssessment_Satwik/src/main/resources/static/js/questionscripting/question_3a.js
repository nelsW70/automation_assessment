 $(document).ready(function(){
      $("form").submit(function(){
      if ($('input:checkbox').filter(':checked').length < 1){
          snackBar();
      return false;
      }
      });
    });
    function snackBar() {
      var x = document.getElementById("snackbar");
      x.className = "show";
      setTimeout(function(){ x.className = x.className.replace("show", ""); }, 5000);
    }