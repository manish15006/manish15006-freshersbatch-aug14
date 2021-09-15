function translate(str) {
    str=str.toLowerCase();
    var n =str.search(/[aeiou]/);
    switch (n){
      //case 0: str = str+"way"; break;
      case -1: str = str+"ay"; break;
      default :
        //str= str.substr(n)+str.substr(0,n)+"ay";
        str=str.replace(/([^aeiou]*)([aeiou])(\w+)/, "$2$3$1ay");
      break;
   }
   return str;

}
console.log(translate("The quick brown fox"));