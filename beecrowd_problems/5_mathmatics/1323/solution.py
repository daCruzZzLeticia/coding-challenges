n = int(input())

while n>0:
	totalQuadrados = 0
	
	for i in range(n, 0, -1):
		totalQuadrados+=i*i
		
	print(totalQuadrados)
	n = int(input())