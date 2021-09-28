//scoping
function obj(x,y){
    if (x=y){
        var z=x;
        x=y;
        y=z;
    }
    console.log(z===x);
    return [x,y];
}