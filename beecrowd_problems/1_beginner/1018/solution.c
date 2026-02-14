#include <stdio.h>
int main(void)
{
    int N;
    scanf("%d", &N);

    int tiponotas[7] = {1, 2, 5, 10, 20, 50, 100};

    printf("%d\n", N);

    int valorJaContado = 0;
    for (int i = 6; i >= 0; i--)
    {
        int quantidadeNotas = (N - valorJaContado) / tiponotas[i];
        valorJaContado += quantidadeNotas * tiponotas[i];
        printf("%d nota(s) de R$ %d,00\n", quantidadeNotas, tiponotas[i]);
    }

    return 0;
}