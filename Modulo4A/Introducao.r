#Este codigo imprime o texto ola, mundo!
print("Olá, mundo!")

#Parte 2

#Variavel saudacao
saudacao = "Oi"

#Variavel pessoa a ser saudada
pessoa = "Arsène"

cat(saudacao,",",pessoa,"!")

#Parte 3

#Pedindo ao usuario que indique a saudacao com comando input()
saudacao = readline(prompt = "Indique a saudação: ")

#Pedindo ao usuario que indique a pessoa cumprimentada com comando input()
pessoa = readline(prompt = "Indique o nome da pessoa saudada: ")

#imprimindo o que o usuario escreveu
cat(saudacao,",",pessoa,"!")