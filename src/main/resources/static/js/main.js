$(document).ready(function(){
    fire_ajax();
});
function fire_ajax(){
    document.getElementById("theImage").src = "/generateImageWithRandomColors";
};

// $.ajax({
//     type : "GET",
//     datatype : "image/png",
//     url : "/generateImageWithRandomColors",
//     succsess : function(data){

//     },
//     error : function (){
//         console.log("error");
//     }
// });