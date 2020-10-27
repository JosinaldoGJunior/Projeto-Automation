# Projeto-Automation
<h4>Nome – Josinaldo Júnior</h4>


Projeto criado na linguagem Java usando Selenium e Junit. Os padrões de projetos Page Objects e DriverFactory foram utilizados, além de uma DSL. Segue abaixo um Guia para auxílio na execução dos testes.

1 – Versões

2 – Recomendações

3 – Pacotes

4 – Resumo 


<h4>1 – Versões</h4>

Chrome - Versão 86.0.4240.111

ChromeDriver -  86.0.4240.22

Java – 8 v241

Junit – 4.13


<h4>2 – Recomendações</h4>

1 – Os testes estão configurados para rodar no navegador Google Chrome e maximizado.

2 – Na page DriverFactory Configurar o caminho do driver no seu computador.

3 – Caso prefira executar os testes no Firefox, altere o caminho do driver no DriverFactory, e na Page Propriedade altere Browsers.CHROME para Browsers.FIREFOX

4 – Projeto construído com o  Maven.

5 – É imprescindível que os testes sejam executados na suíte pois os testes de compras e avaliação depende do login e senha criado na teste de cadastro.

6 – Para evitar erros foi feito uma lógica no e-mail para que ele tenha uma parte randômica. Pois se executarem a suíte mais de uma vez o sistema informará um erro de e-mal já cadastrado.



<h4>3 – Pacotes</h4>

<h4>Core</h4>

BasePage -> É a base que está a DSL. A BasePage é instanciada nas pages do pacote Pages.

BaseTest -> Instanciada em todos os testes sua função e rodas métodos antes ou depois de cada teste. Possui o método finaliza, que pega o screenshot automaticamente no final de todos os testes, além do fechamento do browser.

DriverFactory -> Além do padrão de projeto Page Objects foi usado o Driver Factory para centralizar o driver em apenas uma instancia.

Propriedades -> As propriedades foram criadas para ajudar na execução dos testes. A propriedade Fechar Browser é usada quando queremos deixar o Browser aberto (FAVOR DEIXAR COMO TRUE). E a propriedade Browsers foi criada para alterar facilmente os navegadores da execução dos testes. As opções são Chrome ou Firefox.

<h4>Pages</h4>

Usando o Padrão de Projeto Page Objects, foram criadas uma classe page para cada página do sistema. As pages são:

SummaryPage;

ShippingPage;

OrderHistoryPage;

MyAccountPage;

EveningDressesPage;

CheckPayPage;

FormOfPayPage;

MenuPage;

DressPage;

AddressPage;

CadastroPage.

<h4>Testes</h4>

As classes test são aonde estão os testes.

CadastroTest -> Teste para criação de um usuário com senha randômica de 5 caracteres alfanumérico.

CompraTest -> Foram criados dois testes uma para a compra de uma vestido rosa de tamanho m e outra para a compra de um vestido cinza tamanho pequeno. As validações aqui foram realizadas com a Assert  na mensagem de “Your order on My Store is complete.”. Além dos Asserts nos campos Reference, Product, Quantity, Unit price, Total price, Items (tax excl.), Items (tax incl.), Shipping and handling (tax incl.) e Total. 

AvaliarVestidosTest -> Teste para avaliar os vestidos comprados. Avaliações realizadas com 5 estrelas e foi feito um Assert para validar a mensagem “Your comment has been added and will be available once approved by a moderator”

<h4>Suite</h4>

Foi criada para execução em ordem dos testes.

<h4>4 – Resumo</h4>

Obrigado pela oportunidade. Segue link do Github

