Mnum = new Array(4);

for(x=0; x<4; x++){
    Mnum[x] = new Array(x);

    for(y=0; y<5; y++){
        Mnum[x][y] = (x+2) * (y + 1);
    }
}

console.log(Mnum);