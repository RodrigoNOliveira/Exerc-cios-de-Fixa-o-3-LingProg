#include <stdio.h>
#include <stdlib.h>
#include <time.h>

//É rapido mas se o numero for grande so tristeza
void imprimirLista(int lista[], int tamanho) {
    int i;
    for ( i = 0; i < tamanho; i++) {
        printf("%d ", lista[i]);
    }
    printf("\n");
}


void insertionSort(int lista[], int tamanho) {
    int i;
	for (i = 1; i < tamanho; i++) {
        int chave = lista[i];
        int j = i - 1;
        while (j >= 0 && lista[j] > chave) {
            lista[j + 1] = lista[j];
            j = j - 1;
        }
        lista[j + 1] = chave;
    }
}

int main() {
    int tamanho, i;
    printf("Digite o tamanho da lista: ");
    scanf("%d", &tamanho);

    int lista[tamanho];

    srand(time(NULL));
    for (i = 0; i < tamanho; i++) {
        lista[i] = rand() % 100;
    }

	printf("Lista desordenada:\n");
    imprimirLista(lista, tamanho);
    insertionSort(lista, tamanho);
    printf("Lista ordenada:\n");
    imprimirLista(lista, tamanho);

    return 0;
}

