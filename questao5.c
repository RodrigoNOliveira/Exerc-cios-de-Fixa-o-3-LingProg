#include <stdio.h>


double adicao(double i, double j){
	return i+j;
}

double subtracao(double i, double j){
	return i-j;
}

double multi(double i, double j){
	return i*j;
}

double div(double i, double j){
	return i/j;
}

int main() {
    double num1, num2;
    char operador;
    
  	printf("Digite o primeiro valor: ");
    scanf("%lf", &num1);
    printf("Digite um operador (+, -, *, /): ");
    scanf(" %c", &operador);
    printf("Digite o segundo valor: ");
    scanf("%lf", &num2);

    float resultado;

    switch (operador) {
        case '+':
            resultado = adicao(num1, num2);
            break;
        case '-':
            resultado = subtracao(num1, num2);
            break;
        case '*':
            resultado = multi(num1, num2);
            break;
        case '/':
            resultado = div(num1, num2);
            break;
        default:
            printf("Operador inválido\n");
            return 1;
    }

    printf("Resultado: %.2f\n", resultado);

    return 0;
}
