/*function rev(){
let n=[1,2,3,4,5,6];
let reversenum=n.reverse();
document.write(reversenum);
}
document.write(rev());*/
function customReverse(originalArray) {

    let leftIndex = 0;
    let rightIndex = originalArray.length - 1;
  
    while (leftIndex < rightIndex) {
  
      // Swap the elements with temp variable
      let temp = originalArray[leftIndex];
      originalArray[leftIndex] = originalArray[rightIndex];
      originalArray[rightIndex] = temp;
  
      // Move indices to the middle
      leftIndex++;
      rightIndex--;
    }
  }
  let n=[1,2,3,4,5,6];
  customReverse(n);
  document.write(n);