function concatenate(a,b){
    let z = new Array;
    for(i=0,j=0,k=0;i<a.length && j<b.length && k<(a.length+b.length);i++,j++,k++){
        z[k]=a[i];
        z[++k]=b[i];
    }
    return z;
}    
let x = ["a","b","c"];
let y = [1,2,3];
document.write(concatenate(x,y));
console.log(concatenate(x,y));