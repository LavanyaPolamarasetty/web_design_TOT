// do while 
do{
    console.log(i);
    i++;
}while(i<=10);


//switch
switch(0){
        case 1:
            alert("case 1exc");
            break;
        case 2:
            alert("case 2");
            break;
        case 3:
            alert("case 3");
            break;
    default:
        alert("default");
}


//functions without argument
function gre(){
    return "hii";
}
undefined
gre()
"hii"

// fun with arguments
function add(h,j){
    return h+j;
}
undefined
add(90,90)
180

// without name, anonymous function

var mul = function(n,m){
    return  n*m;
}
undefined
mul(8,9)
72

// arrow function
var mul = (n,m)=>{
    return  n*m;
}
undefined
mul(7,6)
42

object:
------
- it is an entity having state and behaviour 
- space, physical thing,
- instances
-  J