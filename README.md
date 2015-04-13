# ExploringMarsWeb

Este projeto implementa uma interface/servi�o web para o projeto ExploringMars (https://github.com/andregarcia/ExploringMars), o qual implementa uma solu��o para o teste de programa��o da elo7 (https://gist.github.com/nirev/fa9e63cfe8251f585611)


### Dependencia (ATEN��O!!)
Para a execu��o deste projeto � necess�rio instalar em seu reposit�rio maven local o projeto ExploringMars encontrado em https://github.com/andregarcia/ExploringMars


### Execu��o
Execute "mvn tomcat:run" para rodar a aplica��o via maven ou fa�a deploy do arquivo war gerado via maven (utilizando "mvn package")


### Input via formul�rio
Com a aplica��o executando localmente na porta 8080, va para http://localhost:8080/exploringmarsweb/form.jsp para acessar o formul�rio. 
Neste formul�rio, entre com os dados de entrada na caixa de texto'input'.


### Input via curl
Fa�a um POST com upload de um arquivo de entrada via curl, especificando o caminho do arquivo de entrada no par�metro -F

```sh
curl -i -X POST -H "Content-Type: multipart/form-data" -F "file=@sample_input.txt" http://localhost:8080/exploringmarsweb/explore/mars
```

