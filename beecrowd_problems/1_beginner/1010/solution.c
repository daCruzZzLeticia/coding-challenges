#include <stdio.h>

int main(void)
{
    int codigo1, quantidade1, codigo2, quantidade2;
    float precoUNIT1, precoUNIT2;

    scanf("%d %d %f", &codigo1, &quantidade1, &precoUNIT1);
    scanf("%d %d %f", &codigo2, &quantidade2, &precoUNIT2);

    float preco1 = quantidade1 * precoUNIT1;
    float preco2 = quantidade2 * precoUNIT2;

    float valorTotal = preco1 + preco2;

    printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

    return 0;
}