/*
Um 'sistema é composto por componentes'. temos que pensar assim daqui para frente.
a solucao quando eu for fazer um sistema, é que o sistema tem que estar dividido em componentes.
onde um componente faz uma coisa, outro componentes faz outra coisa.

Os componentes devem ser:
*''coesos'' (ter responsabilidade clara e unica). ex um componente de email onde a responsabilidade dele é só mandar email. é a divisao de
responsabilidades para trazer mais clareza do sistema. fica mais facil de dar manutencao e substituir. flexibilidade de tirar e colocar novos componentes.
*''desacoplados'' entre si. ou seja um componente nao pode estar muito acoplado ao outro. eles precisam estar desacoplados, ligacao entre eles
deve ser fraca. facil de tirar.

obs. um sistema deve sempre ser pensado como 'componentes', onde cada um tem sua responsabilidade. e tbm onde esses componentes estao interrelacionados entre si.

obs. nesse exemplo da aula, o professor cria 3 componentes onde cada um tem a sua responsabilidade, que sao:
*SalaryService ( esse componente calcula o netSalary que é o salario liquido. obs esse componente depende de outros 2 componenetes,
que sao o TaxService e o PensionService).
*TaxService ( esse componente vai calcular o imposto. obs nesse caso sao 20% de imposto, mas imagina um componente complexo, a ideia é
a gente encapsular esse calculo dentro desse componente, os calculos sao delegados aqui dentro).
*PensionService (esse componente vai fazer calculos relacionados a previdencia. nesse caso sao 10% de desconto de previdencia).
obs. atencao! esses 3 objetos acima, que sao os componentes SalaryService, TaxService, e o PensionService sao componentes.
obs. temos tbm os objetos de dados que carregam dados do nosso negocio(model, entity, dto), nesse exemplo é a classe Employee(atributos name e grossSalary).

obs. dica par ao intelij. para criarmos o pacote e classe juntos, vamos no nome da classe e por exemplo colocamos 'services.TaxService' onde
nesse caso o 'services' é o nome do pacote, e 'TaxService' é o nome da classe.





*/