function string(a){
    document.write("*******<br>")
    for(i=0;i<a.length;i++){
        document.write("*"+a[i]+"*<br>");
    }
    document.write("*******")
}
const list=new Array("Hello","World","in","a","frame");
string(list);
