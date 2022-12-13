# Teste Mockito

 O Mockito é um framework de testes unitários e o seu principal objetivo é instanciar classes e controlar o comportamento dos métodos.
Isso é chamando de **mock**, na tradução livre que dizer zombar. Pois ao **mockar** a dependencia de uma classe, classe que esta testando pense
estar invocando o método realmente, mas de fato não está.

## 1.2 Criando objetos fictícios com API Mockito

Mockito fornece vários métodos para criar objetos fictícios:

* Usando a `@ExtenWith(MockitoExtension.class)` extensão para `JUnit 5` em combinação com `@Mock` anotação nos campos.
* Usando o `mock()` método estático.
* Usando a `@Mock` anotação.


## 1.3 Usando `when().theReturn()` e `when().thenThrow()`

Mocks podem retornar valores diferentes dependendo dos argumentos passados para um método. A `when(...).theReturn`
cadeia de método é usada para especificar um valor de retorno para uma chamada de método com parâmetros predefinidos.
Pode usar métodos como `anyString` ou `anyInt` para definir que, dependendo do tipo de entrada, um determinado valor deve ser retornado.
Se especificar mais de um valor, eles serão retornados na ordem de especificação, até que o último seja utilizado. Em seguida, o último valor
especificado é retornado.




