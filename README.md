# Teste Mockito

 O Mockito é um framework de testes unitários e o seu principal objetivo é instanciar classes e controlar o comportamento dos métodos.
Isso é chamando de **mock**, na tradução livre que dizer zombar. Pois ao **mockar** a dependencia de uma classe, classe que esta testando pense
estar invocando o método realmente, mas de fato não está.

## 1.2 Criando objetos fictícios com API Mockito

Mockito fornece vários métodos para criar objetos fictícios:

* Usando a `@ExtenWith(MockitoExtension.class)` extensão para `JUnit 5` em combinação com `@Mock` anotação nos campos.
* Usando o `mock()` método estático.
* Usando a `@Mock` anotação.


## 1.3 Usando `when().thenReturn()` e `when().thenThrow()`

Mocks podem retornar valores diferentes dependendo dos argumentos passados para um método. A `when(...).thenReturn`
cadeia de método é usada para especificar um valor de retorno para uma chamada de método com parâmetros predefinidos.
Pode usar métodos como `anyString` ou `anyInt` para definir que, dependendo do tipo de entrada, um determinado valor deve ser retornado.
Se especificar mais de um valor, eles serão retornados na ordem de especificação, até que o último seja utilizado. Em seguida, o último valor
especificado é retornado.

A `when(...).thenReturn(...)` cadeia de métodos pode ser usada para lançar uma exceção.

## 1.4 Usando @Spy

@Spy ou o spy() método pode se usado para agrupar um objeto real. Cada camada, a menos que especificado de outra forma, é delegada ao objeto,
conhecido como espião.

## 1.5 Verify() as chamadas nos objetos fictícios

Mockito rastreia todas as chamadas de método e seus parâmetros para o objeto. Usado o `verify()´ método no objeto para verificar se as condições especificadas foram
atendidas. Por exemplo, pode verificar se um método foi chamado com determinados parâmentros. Esse tipo de teste chamado de teste de comportamento. O teste de comportamento não verifica o resultado de uma chamada de método, mas verifica se um método é chamado com os parâmetros corretos.

## 1.6 Usando @InjectMocks

A **@InjectMocks** anotação que tenta fazer injeção de dependência de construtor, método ou campo de objeto em outro tipo.
É util para conectar objetos a serem testados.

## 1.7 Capturando os argumentos

A `ArgumentCaptor` classe permite acessar os argumentos das chamadas de métodos durante a verificação. Isso permite capturar esses argumentos
de chamadas de método e usá-lo para testes.






