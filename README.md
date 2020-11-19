# POO2020

# Online Goods



## Autores:

| Número     | Nome              |
|------------|-------------------|
|  50036577  | Catarina Guilherme|
|  50034581  | Miguel Morais     |
|  50034705  | Paulo Patarra     |


## Enquadramento
Online Goods é uma aplicação que o faz comprar tudo o que precisa sem sair de casa!
Este projeto é realizado no âmbito das unidades curriculares de programação orientada por objetos e base de dados.
A aplicação permite que o cliente após se registar e efetuar o login, realize as suas encomendas e efetue o seu pagamento, tendo 
o cliente sempre a informação do estado da sua encomenda.
Relativamente a aplicações semelhantes, já existem bastantes, como a amazon, ebay entre outros, este tipo de plataformas têm tido um 
crescimento brutal nos últimos anos, e como tal concordámos que este seria um tema apelativo. 




## Casos de utilização:



### Caso de uso Principal
**Descrição:** \
Este é o caso de uso core do projeto.

**Pré-condições:**
- O utilizador Cliente estar registado na aplicação. 
- Os produtos estarem em stock.

**Passo a passo:**
1) O utilizador Cliente faz o login na aplicação; 
2) Realiza uma encomenda de um produto/varios produtos;
3) E de seguida efetua o pagamento; 
4) O cliente observa a informação do estado da sua encomenda.

**Pós-condições:**
- Alteraçoes de stock, produto pode ficar ou não em falta.
- O pedido é guardado. 
- Alteraçoes do estado da encomenda, aguardar pagamento, pago, entregue, cancelado.



### Caso de uso Secundário 
**Descrição:** \
Este é o primeiro cenário secundário do projeto.

**Pré-condições:**
- O utilizador admin estar logado. 

**Passo a passo:**
1) O utilizador Admin realiza a gestão de stocks;
2) como administrador pode alterar o estado das encomendas.

**Pós-condições:**
- Alteraçoes de stock, produto novamente disponivel.
- Alteraçoes do estado da encomenda por parte do administrador. 



### Caso de uso Secundário 
**Descrição:** \
Este é o segundo cenário secundário do projeto.

**Pré-condições:**
- N/A

**Passo a passo:**
1) O utilizador cliente ao realizar a sua encomenda irá ser notificado do estado da sua encomenda 

**Pós-condições:**
- N/A


