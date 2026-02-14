<h2 align="center">Cédulas - Beecrowd 1018</h2>

### Descrição:

Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

#### Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

#### Saída

Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

#### Exemplo

| Entrada | Descrição              |
| :------ | :--------------------- |
| 576     | 576                    |
|         | 5 nota(s) de R$ 100,00 |
|         | 1 nota(s) de R$ 50,00  |
|         | 1 nota(s) de R$ 20,00  |
|         | 0 nota(s) de R$ 10,00  |
|         | 1 nota(s) de R$ 5,00   |
|         | 0 nota(s) de R$ 2,00   |
|         | 1 nota(s) de R$ 1,00   |

### Soluções

#### Solução 01:

- [Solução Oirginal JavaScript](solution.js)
- [Solução Adpatda para Java](solution01.java)

Solução que fiz no começo dos meus estudos em programação, quando ainda nem sabia sobre estruturas condicionais e laços de repetição - o que explica o volume de comandos manulmente repetidos. No geral, é uma reposta alinhada com a proposta de sucessão de conteúdos, já que a questão faz parte do assunto _sequencial_ da plataforma, dentro da categoria **iniciante**. O que, também, abriu margem para novos aprendizados sobre qualidade e melhorias...

Originalmente feita em JavaScript e adpatada para sua versão em Java. Para a soluçao js, por não ser tipada, a leitura da entrada, que passei por engano, como ponto flutuante `let valor = parseFloat(lines.shift());` é julgada como `Accepted`. A entrada do problema é inteiro. Em java, isso `Wrong answer (5%)` como resposta e, portanto foi corrigida para ser aceita.

#### Tempo de cada versão

versão 1: Tempo de 0.468 segundos e 1,13 KB de tamanho;
versão 2: Tempo de 0.104 segundos e 639 Bytes de tamanho;
Versão 3: Tempo de 0.080 segundos e 883 Bytes de tamanho.

#### Solução 02:

- [Solução Oirginal C](solution.js)
- [Solução Adpatda para Java](solution01.java)

Solução que desenvolvi durante o segundo período da faculdade, quando já conhecia sobre as estruturas básicas da lógica de programação. Apesar de mais compacta, acabei pecando na falta de simplicidade na iteração do array, compliquei ao tratar o array de trás pra frente, em vez de dispor diretamente os valores invertidos no póprio array. Além disso, escolhi não reaproveitar a variável, que armazena a entrada, para receber atualizaçãoes a cada iteração, ainda assim, minha versão parece pior que a solução 03 em questão de clareza (03 feita com auxílio de IA propositalmente). Ainda comparando solução 02 e 03, não achei tão necessário modular métodos e não soube avaliar as diferenças de usar ou não try-with-resources.
