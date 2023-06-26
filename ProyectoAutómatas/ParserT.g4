grammar ParserT;
import LexerT;

program: COMIENZO statement+ FIN ;

statement: declare_var | imprimir | leer ; 

declare_var: declare_int | declare_string | declare_bool ;
	declare_int		: CONST? ENTERO NOMBRE_VAR (ASIGNAR NUMERO)? SEMICOLON ;
	declare_string	: CONST? CADENA NOMBRE_VAR (ASIGNAR PALABRA)? SEMICOLON ;
	declare_bool	: CONST? BOOLEANO NOMBRE_VAR (ASIGNAR VALORES_BOOL)? SEMICOLON ;   

imprimir: IMPRIMIR ABRIR_PAR NOMBRE_VAR CERRAR_PAR SEMICOLON ;
leer	: LEER ABRIR_PAR NOMBRE_VAR CERRAR_PAR SEMICOLON ;