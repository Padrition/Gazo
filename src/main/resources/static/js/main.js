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
    $("#generateImageWithCertainNumberOfColors").submit(function(event){
        event.preventDefault();

        getGenerateImageWithNumberOfColors();
    });
    $("#generateImageWithCertainNumberOfColorsFixedSize").submit(function(event){
        event.preventDefault();

        getGenerateImageWithNumberOfColorsFixedSize()();
    });
});

function generateImageWithRandomColors(){
    document.getElementById("theImage").src = "/generateImageWithRandomColors";
};

function generateImageWithRandomColorsFixedSize(){
    var size = $("#generateImageWithRandomColorsFixedSizeRange").val();
    document.getElementById("theImage").src = "/generateImageWithRandomColors/"+size;
};

function getGenerateImageWithNumberOfColors(){
    var numberOfColors = $("#generateImageWithCertainNumberOfColorsRange").val();
    document.getElementById("theImage").src = "/generateImageWithNumberOfColors" + numberOfColors;
};

function getGenerateImageWithNumberOfColorsFixedSize(){
    var numberOfColors = $("#generateImageWithCertainNumberOfColorsFixedSizeColorRange").val();
    var size = $("#generateImageWithCertainNumberOfColorsFixedSizeSizeRange").val();
    document.getElementById("theImage").src = "/generateImageWithNumberOfColors" + numberOfColors + "/" + size;
};