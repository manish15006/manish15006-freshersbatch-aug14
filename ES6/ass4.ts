let arrow = (...names)=>{       
    let output = [];
    for(let i in names){
        output.push({
            name:names[i],
            length:names[i].length
        });
    }
    console.log(...output);    
}
let names=['Tom','Ivan','Jerry'];
arrow(...names); 