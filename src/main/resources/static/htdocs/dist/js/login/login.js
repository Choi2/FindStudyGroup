$(document).ready(function() {
    $('#register').click(function() {
        $('#register').submit();
    });

    $('#login').on({
        click: function() {
            $('#frm').submit();
        }
    });

    $('#password').on({
        keydown: function(key) {
            if(key.keyCode == 13) {
                $('#frm').submit();
            }
        }
    });
});