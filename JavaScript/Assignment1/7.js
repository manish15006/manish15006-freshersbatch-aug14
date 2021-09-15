document.addEventListener('DOMContentLoaded', function() {
    
    document.getElementById("forex-amount").addEventListener("input",calculator);
    document.getElementById("forex-rate").addEventListener("change",ChangeCurreny);
  
    function calculator(){
         let amount=document.getElementById("forex-amount").value;
         let rate=document.getElementById("forex-rate").value;
      if(rate=="select"){
          document.getElementById("forex-ugx").setAttribute("placeholder","please select currency");
      }else{
          let compute=amount*rate;
          document.getElementById("forex-ugx").value=compute;
      }
    }
    function ChangeCurreny(){
      let rate=document.getElementById("forex-rate").value;
      let amount=document.getElementById("forex-amount").value;
      let compute=rate*amount;
      document.getElementById("forex-ugx").value=compute.toFixed(2);
    } 
  });