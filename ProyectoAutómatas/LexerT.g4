lexer grammar LexerT;

/* Inicio y fin del código */
COMIENZO: 'BEGIN' ;
FIN: 'END' ;

/* Lectura e impresión */
IMPRIMIR: 'imprimir' ;
LEER: 'leer' ;

/* Constantes */
CONST: 'CONST' ;

/* Simbolo de asignación */
ASIGNAR: '=' ;

/* Tipos de datos (3) */
ENTERO: 'entero' ;
CADENA: 'cadena' ;
BOOLEANO: 'booleano' ;

/* Operadores matemáticos (suma, resta, multiplicación y división) */
OP_MATE: MAS | MENOS | MULT | DIV;
MAS: '+' ;
MENOS: '-' ;
MULT: '*' ;
DIV: '/' ;

/* Funciones matemáticas (3) */
SENO: 'SENO' ;
COSENO: 'COSENO' ;
MOD: 'MOD' ;

/* Operadores lógicos (2) */
Y: '&&' ;
O: '||' ;

/* Simbolos de agrupación */
ABRIR_PAR: '(' ;
CERRAR_PAR: ')' ;
ABRIR_BRACKET: '[' ;
CERRAR_BRACKET: ']' ;
ABRIR_BRACE: '{' ;
CERRAR_BRACE: '}' ;

/* Simbolos de puntuación/separadores */
SEMICOLON: ';' ;
COMA: ',' ;

/* Simbolos de operadores de comparación/relación */
COMP_OP: MAYOR_QUE | MENOR_QUE | DISTINTO_DE ;
MAYOR_QUE: '>' ;
MENOR_QUE: '<' ;
IGUAL_QUE: '==' ;
DISTINTO_DE: '!=' ;

/* Estructuras repetitivas (2) */
MIENTRAS: 'mientras' ; 
PARA: 'para' ;

/* Estructuras condicionales (1) */
SI: 'si' ;
ENTONCES: 'entonces' ;

/* Nombres posibles para las variables (caracteres en minúscula, mayúscula, dígitos y guión bajo) */
NOMBRE_VAR: (CARACT_MIN | CARACT_MAYUS | DIGITO | '_')+ ;

/* Números admitne números enteros y decimales sin un punto decimal */			
NUMERO: '-'? DIGITO+ ;

/* Palabras pueden ser caracteres en minuscula y mayuscula, deben estar entre " " y no puede estar vacío*/
PALABRA: '"' ( (CARACT_MIN | CARACT_MAYUS | WS) )* '"' ;

/* Posibles valores que puede tener un dato tipo booleano */
VALORES_BOOL: ('verdadero' | 'falso') ;

/* Caracteres en minuscula del 'a' a la 'z' */
fragment CARACT_MIN: [a-z] ;

/* Caracteres en mayúscula de la 'A' a la 'Z' */
fragment CARACT_MAYUS: [A-Z] ;

/* Dígitos del 0 al 9 */
fragment DIGITO: [0-9] ;

/* Regla que permite saltar los espacios en blanco dentro del código */
WS: [ \t\r\n]+ -> skip ;