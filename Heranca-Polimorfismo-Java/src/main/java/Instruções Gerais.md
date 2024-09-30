# Documentação Java 17 - Classes Úteis para os Exercícios

Este documento contém links para a documentação oficial do Java 17 das principais classes e interfaces que serão utilizadas nos exercícios de herança e polimorfismo.

## Classes Fundamentais

- [Object](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html) - A raiz da hierarquia de classes
- [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html) - Representação de texto
- [Integer](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html) - Wrapper para o tipo primitivo `int`
- [Double](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html) - Wrapper para o tipo primitivo `double`
- [Boolean](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Boolean.html) - Wrapper para o tipo primitivo `boolean`
- [StringBuilder](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html) - Classe para construir strings mutáveis
- [AtomicInteger](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/atomic/AtomicInteger.html) - Inteiro com operações atômicas

## Coleções

- [List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html) - Interface para listas
- [ArrayList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html) - Implementação de lista baseada em array
- [Map](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html) - Interface para mapas (dicionários)
- [HashMap](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html) - Implementação de mapa baseada em hash
- [Collections](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html) - Classe utilitária para coleções

## Data e Tempo

- [LocalDate](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDate.html) - Representa uma data (ano, mês, dia)
- [LocalDateTime](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDateTime.html) - Representa uma data com tempo
- [DateTimeFormatter](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html) - Formatador para data e hora
- [Period](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/Period.html) - Representa um período de tempo

## Exceções

- [Exception](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html) - Classe base para exceções verificadas
- [RuntimeException](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/RuntimeException.html) - Classe base para exceções não verificadas

## Entrada e Saída

- [System](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html) - Métodos de sistema, incluindo entrada e saída padrão
- [Scanner](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html) - Classe para ler entrada do usuário

## Enums

- [Enum](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Enum.html) - Classe base para tipos enum

## Utilitários

- [Math](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html) - Métodos matemáticos úteis
- [Random](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html) - Geração de números aleatórios

## Interfaces Funcionais

- [Comparable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html) - Interface para ordenação natural
- [Comparator](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html) - Interface para ordenação customizada

## Streams e Lambdas

- [Stream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html) - Interface para operações de fluxo de dados
- [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html) - Container para um valor que pode ser nulo
- [Collectors](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Collectors.html) - Utilitários para operações de redução em streams

## Reflexão

- [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Class.html) - Metadados de uma classe

## Modificadores

- [final](https://docs.oracle.com/javase/tutorial/java/IandI/final.html) - Documentação sobre o uso do modificador `final`

## Classes Adicionais que valem a pena pesquisar sobre

- [BigDecimal](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/math/BigDecimal.html) - Para cálculos de alta precisão
- [UUID](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/UUID.html) - Geração de identificadores únicos
- [Arrays](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html) - Utilitários para arrays
- [Objects](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Objects.html) - Utilitários para objetos

Lembre-se de consultar a documentação oficial do Java 17 para obter informações detalhadas sobre métodos, construtores e exemplos de uso de cada classe.