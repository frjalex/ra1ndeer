grammar Asm1;

prog : stat+;

stat : ID '=' expr ';'     # assign
     | 'print' expr ';'      # print
     ;

expr : expr op=(MUL|DIV) expr # muldiv
     | expr op=(ADD|SUB) expr # addsub
     | INT                 # int
     | ID                  # id
     | '(' expr ')'        # pares
     ;

ID   : [a-z]+ ;
INT  : [0-9]+ ;
WS   : [ \t\r\n]+ -> skip;

MUL  : '*' ;
DIV  : '/' ;
ADD  : '+' ;
SUB  : '-' ;