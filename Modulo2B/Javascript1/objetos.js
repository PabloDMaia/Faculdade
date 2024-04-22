var pessoa = {
    nome: 'Arsène',
    sobrenome: "d'Arc"
};

console.log(pessoa['sobrenome'])


var pessoa1 = new Object();
pessoa1.nome = "Astern";
pessoa1.sobrenome = "Pluto";
pessoa1.falarNome = function(){
    console.log("Nome é: " + this.nome);
}

pessoa1.falarNome();

function criarPessoa(nome, sobrenome){
    return{nome,sobrenome};
}

var p1 = criarPessoa("Satanael","Raoul");
var p2 = criarPessoa("Ann","Takamaki");

console.log(p2);