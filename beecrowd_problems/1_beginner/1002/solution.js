var input = require('fs').readFileSync('/dev/stdin', 'utf8')
var lines = input.split('\n')

const PI = 3.14159
let raio = parseFloat(input)

let area = PI * Math.pow(raio, 2)

console.log('A=' + area.toFixed(4))
