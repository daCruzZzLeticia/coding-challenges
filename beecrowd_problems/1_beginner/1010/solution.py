cp1, qp1, vp1 = input().split()
cp2, qp2, vp2 = input().split()

codPeca1 = float(cp1); qtdPeca1 = float(qp1); valorPeca1Unica = float(vp1);
codPeca2 = float(cp2); qtdPeca2 = float(qp2); valorPeca2Unica = float(vp2);

valorTotal = (qtdPeca1 * valorPeca1Unica) + (qtdPeca2 * valorPeca2Unica)

print(f'VALOR A PAGAR: R$ {valorTotal:.2f}')