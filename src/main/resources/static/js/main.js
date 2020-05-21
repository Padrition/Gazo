$(document).ready(function(){
    
    obtain_an_image();

    $("#generateImageWithRandomColors").submit(function(event){
        event.preventDefault();

        obtain_an_image();
    });
});

function obtain_an_image(){
    document.getElementById("theImage").src = "/generateImageWithRandomColors";
};