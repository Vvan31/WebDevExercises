function table(){
    // let arr = [];
    let result = "";
    let arr = Array(10).fill().map(()=> Array(10).fill());
    for (let i = 0; i <= 10; i++) {
        arr[i] = [];
        for (let j = 0; j <= 10; j++) {
            if(i == 0 || j==0){
                if (i == 0 && j == 0){
                    result = result + " x "
                }
                if (i == 0 && j != 0){
                    arr[i][j] = j;
                    result = result +" [" + arr[i][j] + "]";
                }
                if (j == 0 && i !=0){
                    arr[i][j] = i;
                    result = result +" [" + arr[i][j] + "]";
                }
            }else{
                    arr[i][j] = i*j;
                    result = result +"  " +arr[i][j];
            }
         }
         result = result + "\n";
    }

    return result;
}
console.log(table())