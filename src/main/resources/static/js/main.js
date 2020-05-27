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

        generateImageWithNumberOfColors();
    });
    $("#generateImageWithCertainNumberOfColorsFixedSize").submit(function(event){
        event.preventDefault();

        generateImageWithNumberOfColorsFixedSize()();
    });
    $("#generateImageWithCertainColors").submit(function(event){
        event.preventDefault();

        generateImageWithCertainColors();
    });
});

function generateImageWithRandomColors(){
    document.getElementById("theImage").src = "/generateImageWithRandomColors";
};

function generateImageWithRandomColorsFixedSize(){
    let size = $("#generateImageWithRandomColorsFixedSizeRange").val();
    document.getElementById("theImage").src = "/generateImageWithRandomColors/"+size;
};

function generateImageWithNumberOfColors(){
    let numberOfColors = $("#generateImageWithCertainNumberOfColorsRange").val();
    document.getElementById("theImage").src = "/generateImageWithNumberOfColors" + numberOfColors;
};

function generateImageWithNumberOfColorsFixedSize(){
    let numberOfColors = $("#generateImageWithCertainNumberOfColorsFixedSizeColorRange").val();
    let size = $("#generateImageWithCertainNumberOfColorsFixedSizeSizeRange").val();
    document.getElementById("theImage").src = "/generateImageWithNumberOfColors" + numberOfColors + "/" + size;
};

function generateImageWithCertainColors(){
    let colors = $("#generateImageWithCertainColorsColorLine").val();
    document.getElementById("theImage").src = "/generateImageWithCertainColors/" + colors;
};