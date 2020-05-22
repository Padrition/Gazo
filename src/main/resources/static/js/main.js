$(document).ready(function(){
    
    generateImageWithRandomColors();

    $("#generateImageWithRandomColors").submit(function(event){
        event.preventDefault();

        generateImageWithRandomColors();
    });
    $("#generateImageWithRandomColorsFixedSize").submit(function(event){
        event.preventDefault();

        generateImageWithRandomColorsFixedSize();
    });
});

function generateImageWithRandomColors(){
    document.getElementById("theImage").src = "/generateImageWithRandomColors";
};

function generateImageWithRandomColorsFixedSize(){
    var size = $("#generateImageWithRandomColorsFixedSizeRange").val();
    document.getElementById("theImage").src = "/generateImageWithRandomColors/"+size;
}