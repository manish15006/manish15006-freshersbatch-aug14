//5a
const x=(a=2,b=3)=>a+b;
console.log(x());
//5b
let userFriends=(username,...friends)=>{
    username=username,
    friends=friends
};
console.log('manish',['vamshi','mohan','riyaz']);
//5c
let Names=['ben','gwen','max','keven','juile'];
let printCapitalNames=(...Names)=>{                         //question 5.c
    for(let i in Names)
    console.log(Names[i].toUpperCase()+" ");
    }

    printCapitalNames(...Names); 