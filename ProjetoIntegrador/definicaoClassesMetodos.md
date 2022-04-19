**Criar Classe Conta**
Abstrata
**atributos**
[ ] número da conta
[ ] saldo
[ ] ***cartão de crédito*** atrelado
**métodos**
[ ] métodos get
[ ] obter dados da conta
[ ] depósito
[ ] saque;

**Criar Classe cartão de crédito**
**atributos**
[ ]
**métodos**
[ ] 

**Criar Classe Conta Corrente**
Herança da ***classe conta***
**atributos**
**métodos**
[ ] saque
  - permitida somente se saldo > 0;

**Criar Classe Conta Especial**
Herança da ***classe conta***
**atributos**
[ ] valor de limite;
**métodos**
[ ] saque
  - permitida somente se saldo + limite <= saque;

***Criar Classe Gerencia Contas***
**atributos**
**métodos**
[ ] inserir
[ ] remover
[ ] consultar os dados de uma conta
